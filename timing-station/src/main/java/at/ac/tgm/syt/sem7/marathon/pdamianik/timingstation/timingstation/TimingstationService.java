package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.timingstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class TimingstationService {
	@Autowired
	private TimingstationSimulation simulation;

	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${active-mq.queue}")
	private String queue;

	private static final Logger log = LoggerFactory.getLogger(TimingstationService.class);
	private static final Logger transmissionLog = LoggerFactory.getLogger("transmission");

	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

	public void sendData(TimingstationData timingstationData) throws JsonProcessingException {
		log.info("Attempting to send message to queue: " + queue);
		ObjectMapper mapper = new ObjectMapper();
		transmissionLog.debug(mapper.writeValueAsString(timingstationData));
		jmsTemplate.convertAndSend(queue, timingstationData);
	}

    public TimingstationData getTimingstationData() {
        return this.simulation.getData();
    }

	public TimingstationData updateTimingstationData() {
		return this.simulation.updateData();
	}
}
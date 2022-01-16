package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.controlstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
	@Autowired
	ControlStationService service;

	private static final Logger log = LoggerFactory.getLogger(JmsConsumer.class);
	private static final Logger transmissionLog = LoggerFactory.getLogger("transmission");

	@JmsListener(destination = "${active-mq.queue}")
	public void receiveData(TimingstationData data) throws JsonProcessingException {
		log.info("Received Timing Station Data from Timing Station " + data.getTimingstationID());

		ObjectMapper mapper = new ObjectMapper();
		transmissionLog.debug(mapper.writeValueAsString(data));
		service.addData(data);
	}
}

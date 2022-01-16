package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.timingstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ScheduledSend {
	private static final Logger log = LoggerFactory.getLogger(ScheduledSend.class);

	@Autowired
	TimingstationService timingstationService;

	@Scheduled(fixedRate = 30, timeUnit = TimeUnit.SECONDS)
	public void sendData() throws JsonProcessingException {
		TimingstationData data = timingstationService.updateTimingstationData();
		timingstationService.sendData(data);
	}
}

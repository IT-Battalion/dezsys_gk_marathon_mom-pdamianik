package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.timingstation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledSend {
	private static final Logger log = LoggerFactory.getLogger(ScheduledSend.class);

	@Autowired
	TimingstationService timingstationService;

	@Scheduled(fixedRate = 25000)
	public void sendData() {
		timingstationService.sendData(timingstationService.getTimingstationData());
	}
}

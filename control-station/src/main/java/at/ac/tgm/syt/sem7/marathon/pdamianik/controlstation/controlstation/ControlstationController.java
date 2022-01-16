package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.controlstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model.ControlStationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlstationController {
	@Autowired
	ControlStationService service;

	@RequestMapping("/")
	public String timingstationMain() {
		String mainPage = "This is the controlstation application! (DEZSYS_MARATHON_REST) <br/><br/>" +
				"<a href='/data'>Link to /data</a><br/>" +
				"<a href='/consumer.html'>Link to the consumer</a><br/>";
		return mainPage;
	}

	@RequestMapping(value = "/data", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ControlStationData controlstationData() {
		return service.getControlStationData();
	}

	@RequestMapping(value = "/data/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public ControlStationData controlstationDataJson() {
		return service.getControlStationData();
	}

	@RequestMapping(value = "/data/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public ControlStationData controlstationDataXml() {
		return service.getControlStationData();
	}
}

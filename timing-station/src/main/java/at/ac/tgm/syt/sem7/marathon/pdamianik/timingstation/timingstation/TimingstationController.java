package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.timingstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimingstationController {

    @Autowired
    private TimingstationService service;
	
    @RequestMapping("/")
    public String timingstationMain() {
    	String mainPage = "This is the timingstation application! (DEZSYS_MARATHON_REST) <br/><br/>" +
                          "<a href='http://localhost:8080/data'>Link to /data</a><br/>" +
                          "<a href='http://localhost:8080/transfer'>Link to /transfer</a><br/>" +
                          "<a href='http://localhost:8080/consumer.html'>Link to the consumer</a><br/>";
        return mainPage;
    }

    @RequestMapping(value = "//data", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public TimingstationData timingstationData() {
        return service.getTimingstationData();
    }

    @RequestMapping(value = "/data/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public TimingstationData timingstationDataJson() {
        return service.getTimingstationData();
    }

    @RequestMapping(value = "/data/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public TimingstationData timingstationDataXml() {
        return service.getTimingstationData();
    }

    @RequestMapping("/transfer")
    public void timingstationTransfer() {
        service.sendData(service.getTimingstationData());
    }
}
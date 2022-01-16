package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.controlstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model.ControlStationData;
import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControlStationService {
	private ControlStationData controlStationData;
	private final List<TimingstationData> timingStationData;

	public ControlStationService() {
		this.controlStationData = new ControlStationData();
		this.timingStationData = new ArrayList<>();
	}

	public void addData(TimingstationData data) {
		this.timingStationData.add(data);

		this.controlStationData = new ControlStationData();

		for (TimingstationData timingstationData : this.timingStationData) {
			this.controlStationData.add(timingstationData);
		}
	}

	public ControlStationData getControlStationData() {
		return this.controlStationData;
	}
}

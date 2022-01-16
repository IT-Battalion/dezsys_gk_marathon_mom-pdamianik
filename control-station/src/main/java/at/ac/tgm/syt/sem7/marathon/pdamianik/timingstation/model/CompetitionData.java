package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model;

import java.util.List;

public class CompetitionData {
	private String unitTiming;

	private List<Party> parties;

	public CompetitionData() {
		this.unitTiming = "hh:mm:ss";
	}

	public CompetitionData(List<Party> parties) {
		this();

		this.parties = parties;
	}

	public List<Party> getParties() {
		return parties;
	}

	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	public String getUnitTiming() {
		return unitTiming;
	}

	public void setUnitTiming(String unitTiming) {
		this.unitTiming = unitTiming;
	}

	@Override
	public String toString() {
		String info = String.format("unit timing = %s, parties: %s",
				unitTiming, parties);
		return info;
	}
}

package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model;

public class Party {
	private String unitTiming;

	private String timingStationId;
	private int partyId;
	private String timing;

	public Party() {
		this.unitTiming = "hh:mm:ss";
	}

	public Party(String timingStationId, int partyId, String timing) {
		this();

		this.timingStationId = timingStationId;
		this.partyId = partyId;
		this.timing = timing;
	}

	public String getUnitTiming() {
		return unitTiming;
	}

	public void setUnitTiming(String unitTiming) {
		this.unitTiming = unitTiming;
	}

	public String getTimingStationId() {
		return timingStationId;
	}

	public void setTimingStationId(String timingStationId) {
		this.timingStationId = timingStationId;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}
}

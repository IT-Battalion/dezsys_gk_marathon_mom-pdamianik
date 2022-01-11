package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model;

public class Party {
	private int partyId;
	private String timing;

	public Party(int partyId, String timing) {
		this.partyId = partyId;
		this.timing = timing;
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

	@Override
	public String toString() {
		String info = String.format("party id = %d, timing = %s",
				partyId, timing);
		return info;
	}
}

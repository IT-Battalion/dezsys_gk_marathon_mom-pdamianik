package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model;

public class TimingstationInfo {
	private String timingstationID;

	private double distance;
	private String unitDistance;

	private double altitude;
	private String unitAltitude;

	public TimingstationInfo(String timingstationID, double distance, String unitDistance, double altitude, String unitAltitude) {
		this.timingstationID = timingstationID;
		this.distance = distance;
		this.unitDistance = unitDistance;
		this.altitude = altitude;
		this.unitAltitude = unitAltitude;
	}

	public String getTimingstationID() {
		return timingstationID;
	}

	public void setTimingstationID(String timingstationID) {
		this.timingstationID = timingstationID;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getUnitDistance() {
		return unitDistance;
	}

	public void setUnitDistance(String unitDistance) {
		this.unitDistance = unitDistance;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getUnitAltitude() {
		return unitAltitude;
	}

	public void setUnitAltitude(String unitAltitude) {
		this.unitAltitude = unitAltitude;
	}
}

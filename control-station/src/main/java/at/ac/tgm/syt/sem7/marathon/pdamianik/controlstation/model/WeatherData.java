package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model;

public class WeatherData {
	private String timingStationId;
	private String timestamp;

	private double windspeed;
	private String unitWindspeed;

	private double temperature;
	private String unitTemperature;

	private double precipitation;
	private String unitPrecipitation;

	private double atmosphericPressure;
	private String unitAtmosphericPressure;

	public WeatherData() {
		this.unitWindspeed = "kmH";
		this.unitTemperature = "C";
		this.unitPrecipitation = "ml";
		this.unitAtmosphericPressure = "hPa";
	}

	public WeatherData(String timingStationId, String timestamp, double windspeed, double temperature, double precipitation, double atmosphericPressure) {
		this();

		this.timingStationId = timingStationId;
		this.timestamp = timestamp;
		this.windspeed = windspeed;
		this.temperature = temperature;
		this.precipitation = precipitation;
		this.atmosphericPressure = atmosphericPressure;
	}

	public String getTimingStationId() {
		return timingStationId;
	}

	public void setTimingStationId(String timingStationId) {
		this.timingStationId = timingStationId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	public String getUnitWindspeed() {
		return unitWindspeed;
	}

	public void setUnitWindspeed(String unitWindspeed) {
		this.unitWindspeed = unitWindspeed;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getUnitTemperature() {
		return unitTemperature;
	}

	public void setUnitTemperature(String unitTemperature) {
		this.unitTemperature = unitTemperature;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public String getUnitPrecipitation() {
		return unitPrecipitation;
	}

	public void setUnitPrecipitation(String unitPrecipitation) {
		this.unitPrecipitation = unitPrecipitation;
	}

	public double getAtmosphericPressure() {
		return atmosphericPressure;
	}

	public void setAtmosphericPressure(double atmosphericPressure) {
		this.atmosphericPressure = atmosphericPressure;
	}

	public String getUnitAtmosphericPressure() {
		return unitAtmosphericPressure;
	}

	public void setUnitAtmosphericPressure(String unitAtmosphericPressure) {
		this.unitAtmosphericPressure = unitAtmosphericPressure;
	}
}

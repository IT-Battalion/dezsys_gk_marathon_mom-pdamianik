package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model;

public class WeatherData {
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

	public WeatherData(double windspeed, double temperature, double precipitation, double atmosphericPressure) {
		this();

		this.windspeed = windspeed;
		this.temperature = temperature;
		this.precipitation = precipitation;
		this.atmosphericPressure = atmosphericPressure;
	}

	public double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(double windspeed) {
		this.windspeed = windspeed;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public double getAtmosphericPressure() {
		return atmosphericPressure;
	}

	public void setAtmosphericPressure(double atmosphericPressure) {
		this.atmosphericPressure = atmosphericPressure;
	}

	public String getUnitWindspeed() {
		return unitWindspeed;
	}

	public void setUnitWindspeed(String unitWindspeed) {
		this.unitWindspeed = unitWindspeed;
	}

	public String getUnitTemperature() {
		return unitTemperature;
	}

	public void setUnitTemperature(String unitTemperature) {
		this.unitTemperature = unitTemperature;
	}

	public String getUnitPrecipitation() {
		return unitPrecipitation;
	}

	public void setUnitPrecipitation(String unitPrecipitation) {
		this.unitPrecipitation = unitPrecipitation;
	}

	public String getUnitAtmosphericPressure() {
		return unitAtmosphericPressure;
	}

	public void setUnitAtmosphericPressure(String unitAtmosphericPressure) {
		this.unitAtmosphericPressure = unitAtmosphericPressure;
	}

	@Override
	public String toString() {
		String info = String.format("windspeed = %.2f, temperature = %.2f, precipitation = %.2f, atmospheric pressure = %.2f",
			windspeed, temperature, precipitation, atmosphericPressure);
		return info;
	}
}

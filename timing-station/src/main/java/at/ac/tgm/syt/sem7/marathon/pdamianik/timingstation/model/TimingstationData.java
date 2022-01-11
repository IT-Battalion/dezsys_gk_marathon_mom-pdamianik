package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.text.SimpleDateFormat;
import java.util.Date;

@JsonRootName("timingstationData")
public class TimingstationData {
	
	private String timingstationID;
	private String timestamp;

	private double distance;
	private String unitDistance;

	private double altitude;
	private String unitAltitude;

	private WeatherData weatherData;

	private CompetitionData competitionData;

	/**
	 * Constructor
	 */
	public TimingstationData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
		this.unitDistance = "m";
		this.unitAltitude = "hm";
	}

	public TimingstationData(String timingstationID, double distance, double altitude, WeatherData weatherData, CompetitionData competitionData) {
		this();

		this.timingstationID = timingstationID;
		this.distance = distance;
		this.altitude = altitude;
		this.weatherData = weatherData;
		this.competitionData = competitionData;
	}

	/**
	 * Setter and Getter Methods
	 */
	public String getTimingstationID() {
		return timingstationID;
	}
	
	public void setTimingstationID(String timingstationID) {
		this.timingstationID = timingstationID;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	public CompetitionData getCompetitionData() {
		return competitionData;
	}

	public void setCompetitionData(CompetitionData competitionData) {
		this.competitionData = competitionData;
	}

	public String getUnitDistance() {
		return unitDistance;
	}

	public void setUnitDistance(String unitDistance) {
		this.unitDistance = unitDistance;
	}

	public String getUnitAltitude() {
		return unitAltitude;
	}

	public void setUnitAltitude(String unitAltitude) {
		this.unitAltitude = unitAltitude;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Timing Station Info: ID = %s, timestamp = %s, distance = %.2f, weather: %s, competition data: %s",
			timingstationID, timestamp, distance, weatherData, competitionData);
		return info;
	}
}

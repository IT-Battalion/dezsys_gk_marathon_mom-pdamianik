package at.ac.tgm.syt.sem7.marathon.pdamianik.controlstation.model;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonRootName("controlstationData")
public class ControlStationData {
	Map<String, TimingstationInfo> timingstations;

	List<WeatherData> weatherData;

	List<Party> timings;

	public ControlStationData() {
		this(new HashMap<>(), new ArrayList<>(), new ArrayList<>());
	}

	public ControlStationData(Map<String, TimingstationInfo> timingstations, List<WeatherData> weatherData, List<Party> timings) {
		this.timingstations = timingstations;
		this.weatherData = weatherData;
		this.timings = timings;
	}

	public Map<String, TimingstationInfo> getTimingstations() {
		return timingstations;
	}

	public void setTimingstations(Map<String, TimingstationInfo> timingstations) {
		this.timingstations = timingstations;
	}

	public List<WeatherData> getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(List<WeatherData> weatherData) {
		this.weatherData = weatherData;
	}

	public List<Party> getTimings() {
		return timings;
	}

	public void setTimings(List<Party> timings) {
		this.timings = timings;
	}

	public void add(TimingstationData data) {
		this.timingstations.put("station" + data.getTimingstationID(), data.getInfo());

		this.weatherData.add(data.convertWeatherData());

		this.timings.addAll(data.convertTimings());
	}
}

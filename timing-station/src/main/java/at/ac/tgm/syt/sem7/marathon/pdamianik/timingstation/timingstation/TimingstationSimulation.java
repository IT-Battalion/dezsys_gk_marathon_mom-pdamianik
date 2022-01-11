package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.timingstation;

import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.CompetitionData;
import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.Party;
import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.TimingstationData;
import at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation.model.WeatherData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TimingstationSimulation {
	private TimingstationData data;

	public TimingstationSimulation(@Value("${TIMING_STATION}") String inTimingstationID) {
		int stationId = Integer.parseInt(inTimingstationID);

		WeatherData weatherData = new WeatherData(
				getRandomDouble(0, 50),
				getRandomDouble(25, 35),
				getRandomInt(0, 50) != 0 ? 0 : getRandomDouble(1, 50),
				getRandomDouble(999, 1111)
		);

		List<Party> parties = new ArrayList<>();

		double factor = Math.cos(stationId/42.0);
		int partyCount = (int) ((43 - stationId) * 5 * factor + getRandomInt((int)(-10*factor), (int)(10*factor)));

		for (int i = 0; i < partyCount; i++) {
			Party pary = new Party(
					getRandomInt(1, 10000),
					new SimpleDateFormat("HH:mm:ss").format(new Date(getRandomInt(3600 * 60, 3600 * 60 * 5)))
			);
			parties.add(pary);
		}

		CompetitionData competitionData = new CompetitionData(parties);

		this.data = new TimingstationData(
				inTimingstationID,
				stationId,
				getRandomDouble(165, 235),
				weatherData,
				competitionData
		);
	}
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public TimingstationData getData() {
		List<Party> parties = this.data.getCompetitionData().getParties();

		for (int i = 0; i < getRandomInt(0, 10); i++) {
			Party pary = new Party(
					getRandomInt(1, 10000),
					new SimpleDateFormat("HH:mm:ss").format(new Date(getRandomInt(3600 * 60, 3600 * 60 * 5)))
			);
			parties.add(pary);
		}

		return this.data;
	}

}

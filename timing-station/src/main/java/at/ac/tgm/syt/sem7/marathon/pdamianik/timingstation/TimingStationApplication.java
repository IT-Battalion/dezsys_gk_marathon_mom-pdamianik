package at.ac.tgm.syt.sem7.marathon.pdamianik.timingstation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TimingStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimingStationApplication.class, args);
	}

}

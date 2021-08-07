package com.example.schedulingtasks;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("\n******************************");
		System.out.println(new Date());
		System.out.println("******************************");
	}
}

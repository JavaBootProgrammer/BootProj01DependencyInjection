
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private  LocalDate  date;
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param constructor");
	}
	
	// b.method
	public  String findSeason() {
		System.out.println("SeasonFinder.findSeason()");
		//get current month value
		int monthValue=date.getMonthValue();
		//write b.logic
		if(monthValue>=3 && monthValue<=6)
			return "Summer Season";
		else if(monthValue>=7 && monthValue<=10 )
			return "Rainy Season";
		else
			return "Winter Season";
	}

}

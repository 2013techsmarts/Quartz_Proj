package com.smarttechies.scheduler;

import java.text.ParseException;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class MailScheduler {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args)  {
		try {          
			SchedulerFactory sf = new StdSchedulerFactory();
			Scheduler scheduler = sf.getScheduler();
			
			scheduler.start();
			


		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}
}

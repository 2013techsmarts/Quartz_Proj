package com.smarttechies.scheduler;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class MailScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {          
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			scheduler.start();


		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}
}

package com.smarttechies.scheduler;

import java.text.ParseException;

import org.quartz.CronExpression;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import com.smarttechies.job.MailSenderJob;

public class MailScheduler {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		try {          
			SchedulerFactory sf = new StdSchedulerFactory();
			Scheduler scheduler = sf.getScheduler();
			//Tie the MailSenderJob to scheduler
			JobDetailImpl jobDetail = new JobDetailImpl();
			jobDetail.setGroup("group1");
			JobKey jobKey = new JobKey("job1");
			jobDetail.setKey(jobKey);
			jobDetail.setJobClass(MailSenderJob.class);
			//create a trigger and tie it to the job
			// Trigger the job to run on every minute
			CronExpression cronExpression = new CronExpression("0 0/1 * 1/1 * ? *");
	        CronTriggerImpl cronTrigger = new CronTriggerImpl();
	        cronTrigger.setName("mail trigger");
	        cronTrigger.setCronExpression(cronExpression);
	        //Tie the job and the trigger to the scheduler
	        scheduler.scheduleJob(jobDetail, cronTrigger);
			scheduler.start();
			


		} catch (SchedulerException se) {
			se.printStackTrace();
		}
	}
}

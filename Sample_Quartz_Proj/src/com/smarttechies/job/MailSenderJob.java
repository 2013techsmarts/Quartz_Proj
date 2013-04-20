package com.smarttechies.job;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MailSenderJob implements Job{
	
	Logger log = Logger.getLogger(MailSenderJob.class);
	
	@Override
	public void execute(JobExecutionContext pArg0) throws JobExecutionException {
		log.info("The mail sender job triggerd");
		//From here call the mail sender service
	}

}

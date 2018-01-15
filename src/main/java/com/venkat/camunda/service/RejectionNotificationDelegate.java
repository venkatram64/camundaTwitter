package com.venkat.camunda.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

/**
 * Created by Venkatram on 1/15/2018.
 */
@Service("emailAdapter")
public class RejectionNotificationDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        String content = (String) execution.getVariable("content");
        String comments = (String) execution.getVariable("comments");

        System.out.println("Hi!\n\n"
                + "Unfortunately your tweet has been rejected.\n\n"
                + "Original content: " + content + "\n\n"
                + "Comment: " + comments + "\n\n"
                + "Sorry, please try with better content the next time :-)");
    }

}

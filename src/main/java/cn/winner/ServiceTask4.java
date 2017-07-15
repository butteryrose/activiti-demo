package cn.winner;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuebj on 2017/6/30.
 */
public class ServiceTask4 implements JavaDelegate{
    private final Logger log = LoggerFactory.getLogger(ServiceTask4.class.getName());
    @Override
    public void execute(DelegateExecution execution) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("variavles=" + execution.getVariables());
        execution.setVariable("task4", "I am task 4");
        log.info("I am task 4.");
    }
}

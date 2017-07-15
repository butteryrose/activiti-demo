package cn.winner;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuebj on 2017/6/30.
 */
public class ServiceTask3 implements JavaDelegate{
    private final Logger log = LoggerFactory.getLogger(ServiceTask3.class.getName());
    @Override
    public void execute(DelegateExecution execution) {
        log.info("variavles=" + execution.getVariables());
        execution.setVariable("task3", "I am task 3");
        log.info("I am task 3.");
    }
}

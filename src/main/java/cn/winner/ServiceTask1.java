package cn.winner;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xuebj on 2017/6/30.
 */
public class ServiceTask1 implements JavaDelegate{
    private final Logger log = LoggerFactory.getLogger(ServiceTask1.class.getName());
    @Override
    public void execute(DelegateExecution execution) {
        log.info("variavles=" + execution.getVariables());
        execution.setVariable("pass", "2");
        execution.setVariable("a", "4");
        log.info("I am task 1.");
    }
}

package cn.winner;

import cn.Application;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by xuebj on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ActivitiTest {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private ProcessEngine processEngine;

    @Test
    public void test(){
        ProcessInstance pi = runtimeService.startProcessInstanceByKey("AutomaticParalellBasedForkJoin");
        System.out.println("pi=" + pi.getId());
    }

    @Test
    public void delayProcess(){
        ProcessInstance pi = runtimeService.startProcessInstanceByKey("delay");
        try {
            Thread.sleep(70*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void listPorcessList(){
        List<ProcessDefinition> processDefinitionList = processEngine.getRepositoryService().createProcessDefinitionQuery().list();
        processEngine.getRepositoryService().deleteDeployment("3");
        System.out.println(processDefinitionList);
    }
}

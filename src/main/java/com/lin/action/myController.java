package com.lin.action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //����Rest���Ŀ�����
/*@EnableAutoConfiguration *///�Զ����ã��൱��д��spring�������ļ�

public class myController {
    @RequestMapping("hello/{name}")
    @ResponseBody
    public String hello(@PathVariable() String name){
        return name + ":Hello,Spring Boot";
    }

  /*  public static void main(String[] args) {
        //����springboot��Ŀ
        SpringApplication.run(myController.class,args);
    }*/
}

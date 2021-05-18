package com.azure.devops.test.azuredevopstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiuxian.song
 * @version 1.0
 * @create: 2021-05-18 00:25
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    public String Hello(boolean flag){
        String msg = "This is from apex devops test azure repos, batch1, ";
        if (flag){
            msg += "flag is on";
        }else{
            msg += "flag is off";
        }
        System.out.println(msg);
        return msg;
    }
}
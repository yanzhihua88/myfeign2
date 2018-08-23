package com.yzh.myfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.myfeign.client.ComputeClient;
import com.yzh.myfeign.dto.ParamDTO;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }
    
    @RequestMapping(value = "/zullTest", method = RequestMethod.POST)
    public ParamDTO zullTest(@RequestBody ParamDTO param) {
        return param;
    }

}
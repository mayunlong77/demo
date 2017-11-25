package com.order.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.order.service.TestService;


@Controller
@RequestMapping("test")
public class TestController {
    
    private Logger log = Logger.getLogger(TestController.class);
    
    @Autowired
    private TestService testService;
    
    @RequestMapping("/test")
    @ResponseBody
    public Map<String, Object> testDb(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", testService.getData());
        log.debug(" map = " + map);
        return map;
        
    }
    
}

package com.mystudy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by bbose on 7/22/16.
 */

@RestController
public class EmployeeController {


    @RequestMapping(value = "/createemployee", method= RequestMethod.POST)
    public ResponseEntity createEmployee(@RequestBody MultiValueMap<String, String> formData){
        return ResponseEntity.ok("Employee Created");
    }
}

package com.msb.controller;

import com.msb.bean.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ResponseBody表示把当前强求返回的内容直接作为响应体，用来接收
 */
@Controller
public class JsonController {

    @ResponseBody
    @RequestMapping("/json")
    public String json(){

        return "<h1>hello,json</h1>";
    }

    @RequestMapping("json2")
    public String json2(@RequestBody String body){
        System.out.println(body);
        return "index";
    }

    @RequestMapping("test")
    public String test(HttpEntity<String> httpEntity){
        System.out.println(httpEntity);
        String body = httpEntity.getBody();
        return "index";
    }

    @RequestMapping("/testResponseEntity")
    public ResponseEntity<String> testResponseEntity(){
        String str = "<h1>hello,springmvc</h1>";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Set-cookie","name=zhangsan");
        return new ResponseEntity<String>(str,httpHeaders, HttpStatus.OK);
    }

}

package org.equalhsiao.springbootDemo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
@RestController
public class HelloController {
	
	@ApiOperation(value = "Add a new pet to the store")
	@ApiResponses(value = { @ApiResponse(code = 405, message = "Invalid input")})
	 //透過 @RequestMapping 指定從/hello會被對應到此hello()方法
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    //透過 @ResponseBody 告知Spring，此函數的回傳值是HTTP Response的本文
    public String hello(@RequestBody Map<String,String> map){
        return "Hello World!";
    }
}

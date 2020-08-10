package com.pofu.springboot.sbdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello")
    public String say(@RequestParam("who") String who) {
        System.out.println("Hello "+who);
        return "hello "+who+",  this is a springboot demo！~";
       
    }
	
	private  volatile   Boolean  bFlag = false;
	public void test1() {
	        synchronized (bFlag) {
	        	System.out.println("flag="+bFlag);
	        }
	}
}

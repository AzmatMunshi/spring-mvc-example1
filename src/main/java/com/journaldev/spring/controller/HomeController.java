package com.journaldev.spring.controller;

import java.io.BufferedReader;
import java.io.File;
import java.nio.CharBuffer;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		
		for (int i = 0; i < 10; ++i) {
            	for (int j = 0; j < 10; ++i) {
                	
            	}
        	}

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		for (int i = 0; i < 10; ++i) {
              for (int j = 0; j < 10; ++i) {
                 
            }
           }
		
		return "user";
	}
	
	int p1;
	String s1;
	public void assignment(int p1, String s1)
	{
		p1=p1;
		s1=s1;
		
		File configLocation = new File("E://Test.txt"); // JAVA-S0406
		BufferedReader configReader = null;
		CharBuffer configBuf = CharBuffer.wrap(new String());
	}
		
		
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author JustInG
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String getConfigView(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "index";
	}

	@RequestMapping(value = "getp", produces = { "application/json" }, method = RequestMethod.GET)
	public @ResponseBody String getPoint(ModelMap model) {
		
		Point3D p = new Point3D(1, 15, 67, 158);
		String str = "";
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			str = mapper.writeValueAsString(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return str;
	}
/*
	@RequestMapping(value = "postp", method = RequestMethod.POST)
	@ResponseBody
	public String postPoint(@RequestBody final Point3D p) {
		// someService.save(p);
		
		JOptionPane.showMessageDialog(null, "infoMessage", "InfoBox: " + "titleBar1", JOptionPane.INFORMATION_MESSAGE);
		
		return "Success";
	}
	*/
	@RequestMapping(value = "posts", method = RequestMethod.POST, consumes="application/json")
	public String postPoint(@RequestBody final String str) {
		// someService.save(p);
		
	    Point3D p = new Point3D();
	    
	    try {
			p = new ObjectMapper().readValue(str, Point3D.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//JOptionPane.showMessageDialog(null, p.toString(), "InfoBox: " + "point info:", JOptionPane.INFORMATION_MESSAGE);
		
		return "index";
	}
}

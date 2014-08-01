package com.ded.myapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ded.myapp.bean.DEDBean;
import com.ded.myapp.bean.HierarchyBean;
import com.ded.myapp.mongodb.DEDBeanRepository;

@Controller
@RequestMapping("/ded")
public class DEDController {

	@Autowired
	DEDBeanRepository dedBeanRepository;
	
	@RequestMapping(value = "/getDEDById/{_id}", method = RequestMethod.GET)
	public @ResponseBody
	DEDBean getDEDById(@PathVariable String _id) {
		
		return dedBeanRepository.getDEDById(_id);

	}
	
	@RequestMapping(value = "/getDEDByAttId/{attID}", method = RequestMethod.GET)
	public @ResponseBody
	DEDBean getDEDByAttId(@PathVariable String attID) {
		
       
		return dedBeanRepository.searchDEDByAttId(attID);

	}
	
	@RequestMapping(value = "/getEmp", method = RequestMethod.GET)
	public String getEmp(Model model) {
		return "index";
 
	}
}

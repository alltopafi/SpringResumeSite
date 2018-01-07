package com.alltopafi.jesse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alltopafi.jesse.model.projects.ResumeSite;

@Controller
public class SiteController {

	 @RequestMapping("/")
	   public String index() {
	      return "addProject";
	   }
	 
	 @PostMapping("/viewProject")
	   public String viewProject(@ModelAttribute("rs") ResumeSite rs) {
	      return "viewProject";
	   }
}

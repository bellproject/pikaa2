package com.pikaa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pikaa.model.Locations;
import com.pikaa.model.ZipcodePage;
import com.pikaa.service.pikaaService;

@Controller
@RequestMapping(value="/pikaa")
public class PikaaController {

	@Autowired
	pikaaService ps;
	/*@RequestMapping(method=RequestMethod.GET, value="/welcome")
	public String welcomePage1(Model model){
		return "welcome-page";
	}*/
	
	@RequestMapping(value="/zipcode", method= RequestMethod.GET)
	public String zipCodePage(Model model){
		ZipcodePage zp = new ZipcodePage();
		model.addAttribute("zip", zp);
		return "zipcode-page";
	}
	
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public String welcomePage(Model model)
	{
		model.addAttribute("welcome", "welcome");
		return "welcome-page";
	}
	
	@RequestMapping(value="/zipcode", method=RequestMethod.POST)
	public String getZip(@Valid @ModelAttribute ("zip") ZipcodePage zip, BindingResult br, Model model){
		
		System.out.println("in zip post");
		if(br.hasErrors())
		{
			return "welcome-page";
		}

		int zipCode = Integer.parseInt(zip.getZipcode());
		System.out.println(zipCode);
		List<Locations> topList = ps.topNearestLocsList(zipCode);
		model.addAttribute("topList", topList);
		return "location-list";
	}
	
}

package com.skcet.day1.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/wel")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}
	
	@GetMapping("/get")
	public String getName()
	{
		String studentName="IamNeo";
		return "Welcome "+studentName+"!";
	}
	
	@GetMapping("/fav")
	public String getMyFav()
	{
		String getFavColor="Black";
		return "My favourite color is "+getFavColor;
	}
}

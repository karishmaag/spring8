package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BikeService;
import com.example.demo.model.BikeModel;




@RestController
public class BikeController {
 @Autowired
 BikeService sser;
	@PostMapping("addnbike")
 public List<BikeModel> addndetails(@RequestBody List<BikeModel> ss)
 {
	 return sser.savedetails(ss);
 }
	@GetMapping("getnew/{year}")
    public List<BikeModel>displayAll(@PathVariable int year)
    {
   	 return sser.getDetails1(year);
    }
    @GetMapping("getnew1/{bikename}")
    public List<BikeModel>displayAll1(@PathVariable  String bikename)
    {
   	 return sser.getDetails2(bikename);
    }
    @GetMapping("getnew2/{year}/{bikename}")
    public List<BikeModel>displayAll3(@PathVariable int year,@PathVariable String bikename)
    {
   	 return sser.getDetails3(year,bikename);
    }
	
}

package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BikeRepo.BikeRepo;
import com.example.demo.model.BikeModel;


@Service
public class BikeService {
	@Autowired
	BikeRepo sr;
	public List<BikeModel>savedetails(List<BikeModel> ss)
	{
		return (List<BikeModel>)sr.saveAll(ss);
	}
	public List<BikeModel>getDetails1(int year)
	 {
		 return sr.getCarInfo(year);
	 }
	 public List<BikeModel>getDetails2(String bikename)
	 {
		 return sr.getCarInfo1(bikename);
	 }
	 public List<BikeModel>getDetails3(int year,String bikename)
	 {
		 return sr.getCarInfo2(year,bikename);
	 }
}

package com.example.demo.BikeRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BikeModel;


public interface  BikeRepo extends JpaRepository<BikeModel, Integer> {
      
	@Query(value="select * from bikedetail where year=:s",nativeQuery = true)
	public List<BikeModel>getCarInfo(@Param("s") int year);
	
	@Query(value="select * from bikedetail where bikename=:sn",nativeQuery = true)
	public List<BikeModel>getCarInfo1(@Param("sn") String bikename);
	
	@Query(value="select * from bikedetail where year=:s or bikename=:sn",nativeQuery = true)
	public List<BikeModel>getCarInfo2(@Param("s") int year,@Param("sn") String bikename);
}

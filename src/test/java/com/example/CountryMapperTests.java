package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Country;
import com.example.mapper.CountryMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryMapperTests {

	@Autowired
	CountryMapper mapper;
	
	@Test
	public void test00_confirm(){
		System.out.println("mapper = " + mapper);
	}
	
	@Test
	public void test01_select(){
		List<Country> list = mapper.selectAll();
		
		for(Country country : list)
			System.out.println(country);
	}
	@Test
	public void test01_selectAllWithCity(){
		List<Country> list = mapper.selectAllWithCity();
		
		for(Country country : list)
			System.out.println(country);
	}
	
}

package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Country;

@Mapper
public interface CountryMapper {

	@Select("select * from country")
	List<Country> selectAll();
	
	List<Country> selectAllWithCity();
}

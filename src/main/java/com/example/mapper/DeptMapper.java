package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.Dept;

@Mapper
public interface DeptMapper {
	
	@Select("select * from dept")
	List<Dept> selectAll();
	
	List<Dept> selectAllWithEmp();

}

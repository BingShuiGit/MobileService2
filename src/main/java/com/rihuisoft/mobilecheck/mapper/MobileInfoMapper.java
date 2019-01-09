package com.rihuisoft.mobilecheck.mapper;

import com.rihuisoft.mobilecheck.entity.MobileInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "MobileInfoMapper")
public interface MobileInfoMapper {

	void save(MobileInfo mobile);
	boolean update(MobileInfo mobile);
	boolean delete(int id);
	MobileInfo findById(int id);
	List<MobileInfo> findAll();
}

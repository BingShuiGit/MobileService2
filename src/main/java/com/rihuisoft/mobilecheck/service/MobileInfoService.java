package com.rihuisoft.mobilecheck.service;


import com.rihuisoft.mobilecheck.entity.MobileInfo;

import java.util.List;


public interface MobileInfoService {
	void save(MobileInfo mobile);
	boolean update(MobileInfo mobile);
	boolean delete(int id);
	MobileInfo findById(int id);
	List<MobileInfo> findAll();
}

package com.rihuisoft.mobilecheck.service.impl;

import com.rihuisoft.mobilecheck.entity.MobileInfo;
import com.rihuisoft.mobilecheck.mapper.MobileInfoMapper;
import com.rihuisoft.mobilecheck.service.MobileInfoService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "MobileInfoService")
@Transactional //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class MobileInfoServiceImpl implements MobileInfoService {

	@Resource(name = "MobileInfoMapper")
	private MobileInfoMapper mobileInfoMapper;

	List<MobileInfo> mobileInfos = null;


	public boolean delete(int id) {
		
		return mobileInfoMapper.delete(id);
	}

	public List<MobileInfo> findAll() {
		List<MobileInfo> findAllList = mobileInfoMapper.findAll();
		return findAllList;
	}

	public MobileInfo findById(int id) {

		MobileInfo mobile = mobileInfoMapper.findById(id);
		
		return mobile;
	}

	public void save(MobileInfo mobile) {

		mobileInfoMapper.save(mobile);
	}

	public boolean update(MobileInfo mobile) {

		return mobileInfoMapper.update(mobile);
	}
}

package com.rihuisoft.mobilecheck.service.impl;

import com.rihuisoft.mobilecheck.entity.TransactionInfo;
import com.rihuisoft.mobilecheck.mapper.TransactionInfoMapper;
import com.rihuisoft.mobilecheck.service.TransactionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by rihui on 2016/5/19.
 */
@Repository(value = "TransactionInfoService")
@Transactional
public class TransactionInfoServiceImpl implements TransactionInfoService {

    @Resource
    private TransactionInfoMapper transactionInfoMapper;

    public TransactionInfo findById(int id){
        TransactionInfo Transaction = transactionInfoMapper.findById(id);
        return Transaction;
    }
}

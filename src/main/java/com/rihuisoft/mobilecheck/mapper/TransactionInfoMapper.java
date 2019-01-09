package com.rihuisoft.mobilecheck.mapper;

import com.rihuisoft.mobilecheck.entity.TransactionInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by rihui on 2016/5/19.
 */
@Repository(value = "TransactionInfo")
public interface TransactionInfoMapper{
    TransactionInfo findById(int id);
}

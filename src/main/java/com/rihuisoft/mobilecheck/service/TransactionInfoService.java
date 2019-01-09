package com.rihuisoft.mobilecheck.service;

import com.rihuisoft.mobilecheck.entity.TransactionInfo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by rihui on 2016/5/19.
 */
public interface TransactionInfoService {
    TransactionInfo findById(int id);
}

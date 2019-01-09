package com.rihuisoft.mobilecheck.controller;

import com.rihuisoft.mobilecheck.service.TransactionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by rihui on 2016/5/19.
 */
@Controller
@RequestMapping("/Transaction")
public class TransactionInfoController {

    @Autowired
    private TransactionInfoService transactionInfoService;

    public String getById(int id, HttpServletRequest request){
        request.setAttribute("transaction",transactionInfoService.findById(id));
        return "/transactionInfo";
    }
}

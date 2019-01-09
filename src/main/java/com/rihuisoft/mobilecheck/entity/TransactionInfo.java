package com.rihuisoft.mobilecheck.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 交易信息
 * Created by rihui on 2016/5/19.
 */
@XmlRootElement(name = "TransactionInfo")
public class TransactionInfo {
    private int id;
    private String tId;
    private String tOrderNum;
    private String tUserInfo;
    private boolean tConform;
    private boolean tCancel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettOrderNum() {
        return tOrderNum;
    }

    public void settOrderNum(String tOrderNum) {
        this.tOrderNum = tOrderNum;
    }

    public String gettUserInfo() {
        return tUserInfo;
    }

    public void settUserInfo(String tUserInfo) {
        this.tUserInfo = tUserInfo;
    }

    public boolean istConform() {
        return tConform;
    }

    public void settConform(boolean tConform) {
        this.tConform = tConform;
    }

    public boolean istCancel() {
        return tCancel;
    }

    public void settCancel(boolean tCancel) {
        this.tCancel = tCancel;
    }

    public TransactionInfo() {
    }

    public TransactionInfo(int id, String tId, String tOrderNum, String tUserInfo, boolean tConform, boolean tCancel){
        super();
        this.id = id;
        this.tId = tId;
        this.tOrderNum = tOrderNum;
        this.tUserInfo = tUserInfo;
        this.tConform = tConform;
        this.tCancel = tCancel;


    }
}

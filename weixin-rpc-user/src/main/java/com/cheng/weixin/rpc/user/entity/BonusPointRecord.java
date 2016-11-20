package com.cheng.weixin.rpc.user.entity;

import com.cheng.common.entity.DataEntity;
import com.cheng.weixin.rpc.user.enumType.TXType;

/**
 * Desc: 积分记录  记录积分的收支情况
 * Author: cheng
 * Date: 2016/6/3
 */
public class BonusPointRecord extends DataEntity<BonusPointRecord> {
    private String accountId;
    private int beforeBonusPoints;
    private int txBonusPoints;
    private int frozenBonusPoints;
    private int afterBonusPoints;
    private TXType txType;
    private String behaviorId;
    private String txResult;

    public BonusPointRecord() {
    }

    public BonusPointRecord(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getBeforeBonusPoints() {
        return beforeBonusPoints;
    }

    public void setBeforeBonusPoints(int beforeBonusPoints) {
        this.beforeBonusPoints = beforeBonusPoints;
    }

    public int getTxBonusPoints() {
        return txBonusPoints;
    }

    public void setTxBonusPoints(int txBonusPoints) {
        this.txBonusPoints = txBonusPoints;
    }

    public int getFrozenBonusPoints() {
        return frozenBonusPoints;
    }

    public void setFrozenBonusPoints(int frozenBonusPoints) {
        this.frozenBonusPoints = frozenBonusPoints;
    }

    public int getAfterBonusPoints() {
        return afterBonusPoints;
    }

    public void setAfterBonusPoints(int afterBonusPoints) {
        this.afterBonusPoints = afterBonusPoints;
    }

    public TXType getTxType() {
        return txType;
    }

    public void setTxType(TXType txType) {
        this.txType = txType;
    }

    public String getBehaviorId() {
        return behaviorId;
    }

    public void setBehaviorId(String behaviorId) {
        this.behaviorId = behaviorId;
    }

    public String getTxResult() {
        return txResult;
    }

    public void setTxResult(String txResult) {
        this.txResult = txResult;
    }
}

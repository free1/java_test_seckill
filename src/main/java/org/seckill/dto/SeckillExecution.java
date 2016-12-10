package org.seckill.dto;

import org.seckill.entity.SuccessKilled;

/**
 * 秒杀结果输出
 * Created by free on 16/10/16.
 */
public class SeckillExecution {

    private long seckillId;

    private int state;

    private String stateInfo;

    private SuccessKilled successKilled;

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = statEnum.getState();
        this.stateInfo = statEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    public long getSeckillId() {

        return seckillId;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }
}

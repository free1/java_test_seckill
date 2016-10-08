package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by free on 16/10/8.
 */
public interface SuccessKilledDao {

    /**
     * 购买明细, 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询SuccessKilled并带有Seckill
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);

}

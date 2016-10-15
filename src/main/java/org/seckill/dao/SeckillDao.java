package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by free on 16/10/8.
 */
public interface SeckillDao {

    /**
     * 减少库存
     * @param seckillId
     * @param killTime
     * @return 如果>1，更新行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);


    /**
     * 详情
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);


    /**
     * 商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}

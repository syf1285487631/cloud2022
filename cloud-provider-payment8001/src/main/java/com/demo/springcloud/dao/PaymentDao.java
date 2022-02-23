package com.demo.springcloud.dao;

import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shaoYF
 * @title: PaymentDao
 * @projectName cloud2022
 * @description: TODO
 * @date 2022/2/21 22:18
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

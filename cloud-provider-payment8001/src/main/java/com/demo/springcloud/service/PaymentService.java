package com.demo.springcloud.service;

import com.demo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author shaoYF
 * @title: PaymentService
 * @projectName cloud2022
 * @description: TODO
 * @date 2022/2/21 22:38
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}

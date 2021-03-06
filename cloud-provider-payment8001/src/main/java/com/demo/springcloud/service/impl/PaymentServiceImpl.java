package com.demo.springcloud.service.impl;

import com.demo.springcloud.entities.Payment;
import com.demo.springcloud.dao.PaymentDao;
import com.demo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shaoYF
 * @title: PaymntServiceImpl
 * @projectName cloud2022
 * @description: TODO
 * @date 2022/2/21 22:38
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

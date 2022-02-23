package com.demo.springcloud.controller;

import com.demo.springcloud.entities.CommonResult;
import com.demo.springcloud.entities.Payment;
import com.demo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author shaoYF
 * @title: PaymentController
 * @projectName cloud2022
 * @description: TODO
 * @date 2022/2/21 22:42
 */
@RestController
@Slf4j
public class PaymentController {

        @Resource
        private PaymentService paymentService;

        @PostMapping(value = "/payment/create")
        public CommonResult create(@RequestBody Payment payment)
        {
            int result = paymentService.create(payment);
            log.info("*****插入结果："+result);

            if(result > 0)
            {
                return new CommonResult(200,"插入数据库成功,serverPort:得",result);
            }else{
                return new CommonResult(444,"插入数据库失败",null);
            }
        }

        @GetMapping(value = "/payment/get/{id}")
        public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
        {
            Payment payment = paymentService.getPaymentById(id);

            if(payment != null)
            {
                return new CommonResult(200,"查询成功,serverPort:大萨达",payment);
            }else{
                return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
            }
        }
}

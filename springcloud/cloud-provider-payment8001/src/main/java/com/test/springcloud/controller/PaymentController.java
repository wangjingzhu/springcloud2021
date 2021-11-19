package com.test.springcloud.controller;

import com.test.springcloud.entity.CommonResule;
import com.test.springcloud.entity.Payment;
import com.test.springcloud.service.PaymentService;
import com.test.springcloud.service.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(method = RequestMethod.POST, value = "/payment/create")
    public CommonResule create(@RequestBody Payment payment){
        log.info("插入成功？"+ payment);
        int rest = paymentService.create(payment);
        log.info("插入成功？"+ rest);
        if (rest > 0){
            return new CommonResule(200, "Success", rest);
        }else{
            return new CommonResule(400, "expected", null);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/payment/get/{id}")
    public CommonResule getPaymentByid(@PathVariable("id") Long id){
        Payment paymentByid = paymentService.getPaymentByid(id);
        log.info("查询成功？"+ paymentByid);
        System.out.println("qeqweqw");
        if (paymentByid != null){
            return new CommonResule(200, "Success", paymentByid);
        }else{
            return new CommonResule(400, "expected", null);
        }
    }
}

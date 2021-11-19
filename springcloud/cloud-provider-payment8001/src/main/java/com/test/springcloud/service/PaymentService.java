package com.test.springcloud.service;

import com.test.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentByid(@Param("id") Long id);
}

package com.test.springcloud.dao;

import com.test.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentByid(@Param("id") Long id);
}

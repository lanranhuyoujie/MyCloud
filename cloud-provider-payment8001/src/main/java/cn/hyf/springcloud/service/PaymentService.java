package cn.hyf.springcloud.service;

import cn.hyf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created By 黄一飞 On 2020 04 08 17:51
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

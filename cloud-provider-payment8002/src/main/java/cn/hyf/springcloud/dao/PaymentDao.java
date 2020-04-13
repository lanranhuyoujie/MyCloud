package cn.hyf.springcloud.dao;

import cn.hyf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created By 黄一飞 On 2020 04 08 17:47
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

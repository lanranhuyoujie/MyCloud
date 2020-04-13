package cn.hyf.springcloud.service.impl;

import cn.hyf.springcloud.dao.PaymentDao;
import cn.hyf.springcloud.entities.Payment;
import cn.hyf.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created By 黄一飞 On 2020 04 08 17:52
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}

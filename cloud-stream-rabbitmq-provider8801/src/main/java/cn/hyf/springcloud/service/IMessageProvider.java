package cn.hyf.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * Created By 黄一飞 On 2020 04 13 14:08
 */
@Service
public interface IMessageProvider
{
    public String send();
}

package cn.hyf.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created By 黄一飞 On 2020 04 09 14:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}

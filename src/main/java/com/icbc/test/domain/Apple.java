package com.icbc.test.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 苹果
 * @author lzc
 * @date 2025/03/25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Apple extends Fruit {

    /**
     * 初始化  8元
     */
    public Apple() {
        this.setPrice(new BigDecimal("8"));
    }


}
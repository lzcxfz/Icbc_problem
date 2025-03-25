package com.icbc.test.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 水果抽象类
 * @author lzc
 * @date 2025/03/25
 */
@Data
public abstract class Fruit {



    /**
     * 价格
     */
    private BigDecimal price;



    /**
     * 算价钱
     * @param
     * @return {@link BigDecimal }
     */
    public BigDecimal calc(int kilograms) {
        if (kilograms < 0){
            throw new IllegalArgumentException("水果斤数应为大于等于0的整数");
        }
        return this.price.multiply(BigDecimal.valueOf(kilograms));
    }

}
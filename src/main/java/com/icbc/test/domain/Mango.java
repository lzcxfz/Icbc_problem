package com.icbc.test.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 芒果
 * @author lzc
 * @date 2025/03/25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Mango extends Fruit {
    /**
     * 20元
     */
    public Mango() {
        this.setPrice(new BigDecimal("20"));
    }
}
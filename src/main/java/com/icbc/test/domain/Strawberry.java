package com.icbc.test.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 草莓
 * @author lzc
 * @date 2025/03/25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Strawberry extends Fruit {

    /**
     * 13元
     */
    public Strawberry() {
    this.setPrice(new BigDecimal("13.0"));
    }
}
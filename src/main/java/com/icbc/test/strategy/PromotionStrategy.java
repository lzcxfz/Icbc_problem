package com.icbc.test.strategy;

import java.math.BigDecimal;

/**
 * 策略
 * @author lzc
 * @date 2025/03/25
 */
interface PromotionStrategy  {
    BigDecimal applyPromotion(int originalTotal);
}
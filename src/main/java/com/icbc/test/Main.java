package com.icbc.test;

import com.icbc.test.domain.Apple;
import com.icbc.test.domain.Mango;
import com.icbc.test.domain.Strawberry;

import java.math.BigDecimal;

/**
 * 主函数
 * @author lzc
 * @date 2025/03/25
 */
public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Mango mango = new Mango();
        Strawberry strawberry = new Strawberry();
        int appleKilograms = 5;
        int strawberryKilograms = 10;
        int mangoKilograms = 3;

        // 问题1
        BigDecimal problem1 = apple.calc(appleKilograms).add(strawberry.calc(strawberryKilograms));
        System.out.println("问题1：购买" + appleKilograms+"斤苹果和"+strawberryKilograms+"斤草莓需要"+problem1+"元");

        // 问题2
        BigDecimal problem2 = apple.calc(appleKilograms).add(strawberry.calc(strawberryKilograms)).add(mango.calc(mangoKilograms));
        System.out.println("问题2：购买" + appleKilograms+"斤苹果和"+strawberryKilograms+"斤草莓和"+mangoKilograms+"斤芒果需要"+problem2+"元");

        // 问题3
        strawberry.setPrice(strawberry.getPrice().multiply(new BigDecimal("0.8")));
        BigDecimal problem3 = apple.calc(appleKilograms).add(strawberry.calc(strawberryKilograms)).add(mango.calc(mangoKilograms));
        System.out.println("问题3：购买" + appleKilograms+"斤苹果和"+strawberryKilograms+"斤草莓需要"+problem3+"元");

        // 问题4
        BigDecimal problem4 = apple.calc(appleKilograms).add(strawberry.calc(strawberryKilograms)).add(mango.calc(mangoKilograms));
        problem4 = problem4.subtract(problem4.remainder(new BigDecimal("100")).multiply(new BigDecimal("10")));
        System.out.println("问题4：购买" + appleKilograms+"斤苹果和"+strawberryKilograms+"斤草莓需要"+problem4+"元");

    }
}

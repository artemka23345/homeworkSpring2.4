package com.artemka23345.homeworkSpring.service.impl;

import com.artemka23345.homeworkSpring.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class СalculatorServiceImpl implements CalculatorService {

    public String greetings() {
        return "<b>Добро пожаловать в калькулятор</b>";

    }

    public Integer plus(Integer num1, Integer num2) {
        return (num1 + num2);

    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;

    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;

    }

    public Double divide(Double num1, Double num2) {
        return num1 / num2;

    }
}




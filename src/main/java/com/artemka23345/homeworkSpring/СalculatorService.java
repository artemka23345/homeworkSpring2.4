package com.artemka23345.homeworkSpring;

import org.springframework.stereotype.Service;

@Service
public class СalculatorService {

    public String greetings(){
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    public String plus(Integer num1,Integer num2){
        return num1 + "+" + num2 + "=" + (num1 + num2);

    }
    public String minus(Integer num1,Integer num2){
        return num1 + "+" + num2 + "=" + (num1 - num2);

    }
}




package com.artemka23345.homeworkSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService сalculatorService;

    public CalculatorController(CalculatorService сalculatorService) {
        this.сalculatorService = сalculatorService;
    }

    @GetMapping("/")
    public String greetings(){
        return сalculatorService.greetings();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Не передан параметер";
        }
        return  num1 + "+" + num2 + "=" + сalculatorService.plus(num1,num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Не передан параметр";
        }
        return  num1 + "*" + num2 + "=" + сalculatorService.multiply(num1,num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,@RequestParam(required = false) Integer num2){
        if(num1 == null || num2 == null){
            return "Не передан параметр";
        }
        return  num1 + "-" + num2 + "=" + сalculatorService.minus(num1,num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Double num1,@RequestParam(required = false) Double num2){
        if(num1 == null || num2 == null){
            return "Не передан параметр";
        }
        if(num2 == 0){
            return "Деление на ноль";
        }
        return  num1 + "/" + num2 + "=" + сalculatorService.divide(num1,num2);
    }


}

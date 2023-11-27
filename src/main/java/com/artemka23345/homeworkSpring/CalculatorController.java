package com.artemka23345.homeworkSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
        private СalculatorService сalculatorService;

    public CalculatorController(СalculatorService сalculatorService) {
        this.сalculatorService = сalculatorService;
    }
@GetMapping()
    public String greetings(){
        return сalculatorService.greetings();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1,@RequestParam("num2") Integer num2){
        return сalculatorService.plus(num1,num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1,@RequestParam("num2") Integer num2){
        return сalculatorService.plus(num1,num2);
    }


}

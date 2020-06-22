package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @RequestMapping(path = "/{operator}/{number1}/{compare}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int math(@PathVariable String operator, @PathVariable int number1, @PathVariable String compare, @PathVariable int number2) {
        int number = 0;
        if (operator.equals("add") && compare.equals("and")) {
            number = number1 + number2;
        }
         else if (operator.equals("subtract") && compare.equals("from")) {
            number = number2 -number1;
        }
        else if (operator.equals("multiply") && compare.equals("and")) {
            number = number1 * number2;
        }
        else if (operator.equals("divide") && compare.equals("by")) {
            number = number1 / number2;
        }
        return number;
    }
}

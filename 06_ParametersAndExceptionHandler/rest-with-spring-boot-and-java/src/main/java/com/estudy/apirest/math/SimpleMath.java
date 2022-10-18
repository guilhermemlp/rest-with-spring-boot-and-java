package com.estudy.apirest.math;

import com.estudy.apirest.converters.NumberConverter;
import com.estudy.apirest.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {

    public Double addition(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double average(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number) throws Exception {
        return Math.sqrt(number);
    }
}

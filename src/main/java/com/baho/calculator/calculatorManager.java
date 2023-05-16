package com.baho.calculator;

import javafx.scene.control.Label;

import java.util.ArrayList;

public class calculatorManager {

    public String containsProcess(Label equal,String processSign){
        String process ="";
        if(equal.getText().contains("x")||equal.getText().contains("/")||equal.getText().contains("-")||equal.getText().contains("+")){

        }else{
            equal.setText(equal.getText()+processSign);
            process=processSign;
        }
        return process;
    }

    public float calculate(int num1,int num2,String process){
        switch (process){
            case "x":
                return num1*num2;
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "/":
                return num1/num2;
            case "":
                return 0;
        }
        return 0;
    }
}

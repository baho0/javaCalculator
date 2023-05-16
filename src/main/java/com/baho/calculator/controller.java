package com.baho.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class controller {
    @FXML
    private Label equal;
    int num1=0;
    int num2=0;
    ArrayList<Integer> nums = new ArrayList<Integer>();
    String process="";
    calculatorManager calculatorManager = new calculatorManager();
    public void onClickNum(Label equal, int numFirst, int numSecond, String _process, String _buttonNum){
        if(equal.getText().contains("x")||equal.getText().contains("/")||equal.getText().contains("-")||equal.getText().contains("+")){
            num2 = Integer.parseInt(String.valueOf(num2)+_buttonNum);
            equal.setText(num1+process+num2);
            System.out.println("ok");
        }else{
            num1 = Integer.parseInt(String.valueOf(num1)+_buttonNum);
            equal.setText(equal.getText()+_buttonNum);
        }
    }
    @FXML
    protected void onClickCalculate(){
        System.out.println(num1);
        System.out.println(num2);
        equal.setText(String.valueOf(Math.round(calculatorManager.calculate(num1,num2,process))));
        num1=Integer.parseInt(equal.getText());
        num2=0;
    }
    @FXML
    protected void onClickOne(){
        onClickNum(equal,num1,num2,process,"1");
    }
    @FXML
    protected void onClickTwo(){
        onClickNum(equal,num1,num2,process,"2");
    }
    @FXML
    protected void onClickThree(){
        onClickNum(equal,num1,num2,process,"3");
    }
    @FXML
    protected void onClickFour(){
        onClickNum(equal,num1,num2,process,"4");
    }
    @FXML
    protected void onClickFive(){
        onClickNum(equal,num1,num2,process,"5");
    }
    @FXML
    protected void onClickSix(){
        onClickNum(equal,num1,num2,process,"6");
    }
    @FXML
    protected void onClickSeven(){
        onClickNum(equal,num1,num2,process,"7");
    }
    @FXML
    protected void onClickEight(){
        onClickNum(equal,num1,num2,process,"8");
    }
    @FXML
    protected void onClickNine(){
        onClickNum(equal,num1,num2,process,"9");
    }
    @FXML
    protected void onClickZero(){
        onClickNum(equal,num1,num2,process,"0");
    }
    @FXML
    protected void multiplication(){
        process =calculatorManager.containsProcess(equal,"x");
    }
    @FXML
    protected void subtraction(){
        process=calculatorManager.containsProcess(equal,"-");
    }
    @FXML
    protected void addition(){
        process=calculatorManager.containsProcess(equal,"+");
    }
    @FXML
    protected void division(){
        process=calculatorManager.containsProcess(equal,"/");
    }
    @FXML
    protected void onClickClear(){
        num2 =0;
        num1 =0;
        equal.setText("");
    }
}

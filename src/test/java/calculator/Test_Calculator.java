package calculator;

import calculator.Calculator;

import org.junit.*;

public class Test_Calculator{
    private Calculator test_calculator;

    public Test_Calculator(){
        test_calculator = new Calculator();
    }

    @Test
    public void test_add(){
        int a = 2;
        int b = 3;
        int c = 5;
        int _c = test_calculator.add(a,b);
        Assert.assertEquals(_c,c);;
    }


    @Test
    public void test_subtract(){
        int a = 10;
        int b = 5;
        int c = 5;
        int _c = test_calculator.subtract(a,b);
        Assert.assertEquals(_c,c);;
    }


    @Test
    public void test_multiply(){
        int a = 10;
        int b = 5;
        int c = 50;
        int _c = test_calculator.multiply(a,b);
        Assert.assertEquals(_c,c);;
    }


    public static void main(String args[]){
        System.out.println("Calculator test file main");
    }
}

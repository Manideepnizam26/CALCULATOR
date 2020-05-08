package src.test;
import src.main.Calculator;

public class Test_Calculator{
    private Calculator test_calculator;

    public Test_Calculator(){
        test_calculator = new Calculator();
    }

    public void test_add(){
        int a = 2;
        int b = 3;
        int c = 5;
        int sum = test_calculator.add(a,b);
    }



    public static void main(String args[]){
        System.out.println("Test program");
    }
}

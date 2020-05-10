package calculator;


public class Calculator{


    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    public static int multiply(int num1,int num2){
        return num1*num2;
    }

    public static float divide(float num1,float num2){
        if(num2==0){
            throw new IllegalArgumentException("num2(divisor) cannot be zero");
        }
        return num1/num2;
    }


    public static void main(String arg[]){
        System.out.println("Calculator file main");
        // System.out.println("6 + 3 = " + add(6, 3));    
    }

}
package calculator;

import java.util.Scanner;

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

        int choice,flag=0;
        int num1,num2;
        System.out.println("Welcome to Calculator");
        Scanner reader = new Scanner(System.in);

        do{

            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");

            choice = reader.nextInt();

            if(choice==5){
                flag = 1;
            }

            else{

                switch(choice){
                case 1:
                System.out.println("Addition");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextInt();
                System.out.print("Enter number 2: ");
                num2 = reader.nextInt();
                System.out.println(add(num1,num2));


                case 2:
                System.out.println("Subtraction");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextInt();
                System.out.print("Enter number 2: ");
                num2 = reader.nextInt();
                System.out.println(subtract(num1,num2));


                case 3:
                System.out.println("Multiplication");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextInt();
                System.out.print("Enter number 2: ");
                num2 = reader.nextInt();
                System.out.println(multiply(num1,num2));

                case 4:
                System.out.println("Division");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextInt();
                System.out.print("Enter number 2(not Zero): ");
                num2 = reader.nextInt();
                System.out.println(divide(num1,num2));

                }
            }

            System.out.println("\n");

        }while(flag==0);

    }

}
import java.util.Scanner;

public class MulWithoutOperator {

    //Multiplying two numbers without using '*' operator;
    public int getProduct(int a, int b){

        /* checking if any of the number is negative 
        case '-' '+' = '-' and vice-versa
        case '-' '-' = '+'
        It will check all this things */

        boolean negative = false;
        if(b < 0){
            b = -b;
            negative = true;
        }
        if(a < 0){
            a = -a;
            negative = !negative;
        }

        //it any one of the number is zero, The answer is zero
        int temp = 0;
        if(a==0 || b==0){
            return 0;
        }

        //main method to calculate the prodouct.
        for(int i = 1; i <= b; i++){
            temp = temp + a; 
        }
        return negative ? -temp : temp;
    }

    //division of two numbers without using '/' operator
    public int getDivisibleProduct(int a, int b){
        int temp = 0;
        
        //if denominator is zero then it will thow the error.
        if(b <= 0){
            throw new ArithmeticException("Division by zero not allowed!!!");
        }

        //checking for negative numbers
        boolean negative = (a < 0) ^ (b < 0);

        //Converting negative numbers to positive numbers for calculation       
        a = Math.abs(a);
        b = Math.abs(b);

        //division method without using division operator
        while(a >= b){
            a -= b;    
            temp++;
        }

        //if the anyone of the given number is '-' then we should print that in negative.
        return negative ? -temp : temp;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        MulWithoutOperator mul = new MulWithoutOperator();

        boolean running  = true;

        while(running){

            System.out.println("Choose to do operations: ");
            System.out.println("1. Multiplication \n2. Division \n0.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers for multiplication: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    int result = mul.getProduct(num1, num2);
                    System.out.println("The result is: " + result);

                    break;

                case 2:
                    System.out.println("Enter two valid numbers for Division: ");
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    int divResult = mul.getDivisibleProduct(num3, num4);
                    System.out.println("The Result is: " + divResult);

                    break;

                case 0:
                    System.out.println("Exiting!!!");
                    sc.close();
                    running = false;
                    break;

                default:
                    System.out.println("Enter the correct choice!!");
                    break;
            }
        }
        
    }
}

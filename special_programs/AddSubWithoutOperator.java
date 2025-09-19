import java.util.*;

public class AddSubWithoutOperator {
    
    //for addition
    public int addSum(int a, int b){
        while(b != 0){
            a++;
            b--;
        }

        return a;
    }

    //for subtraction
    public int subSum(int a, int b){
        if(a == b){
            return 0;
        }

        while(b!=0){
            a--;
            b--;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to add: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        AddSubWithoutOperator add = new AddSubWithoutOperator();

        int result = add.addSum(num1, num2);
        System.out.println("The sum is: "+result);
        
        System.out.println("Now give the numbers for subtraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int subResult = add.subSum(a, b);
        System.out.println("The subtracted sum is: "+ subResult);

        sc.close();
    }
}

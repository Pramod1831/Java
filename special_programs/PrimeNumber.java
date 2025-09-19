import java.util.*;

public class PrimeNumber {
    
    public int isPrime(int n){
        
        if(n <= 1){
            return 0;
        } else if(n == 2 || n == 3){
            return 1;
        } else if(n > 3){
            int rootNumber = (int) Math.sqrt(n);
            for(int i = 2; i <= rootNumber; i++){
                if(n % i == 0){
                    return 0;
                } 
            }
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        PrimeNumber primenumber = new PrimeNumber();
        int result = primenumber.isPrime(num);

        if(result == 0){
            System.out.println(num + " is not prime");
        } else {
            System.out.println(num + " is Prime");
        }

        sc.close();
    }
}

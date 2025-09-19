import java.util.*;

public class FindDivisor {
    
    public void getDivisor(int num){
        if(num <= 1){
            System.out.println("It is only divisble by 1");
        } 
        
        int rootNumber = (int) Math.sqrt(num);
        List<Integer> divisors = new ArrayList<>();

        for(int i = 1; i <= rootNumber; i++){
            if(num % i == 0){
                divisors.add(i);
                if(i != num/i){
                    divisors.add((num / i));
                }
            }
        }

        Collections.sort(divisors);
        System.out.println("Divisors of "+ num + " is: " + divisors);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check the divisors: ");
        int num = sc.nextInt();

        FindDivisor findDivisor = new FindDivisor();
        findDivisor.getDivisor(num);

        sc.close();
    }
}

package String;

import java.util.*;

class RomanToInteger {
    int val = 0;
    public int value(char ch){
         switch(ch){
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    System.out.println("Enter correct roman numbers");
                    return 0;
              }

    }
    public int romanToInt(String s) {
        if(s.length()==0){
            System.out.println("Enter Correct Roman Number");
            return 0;
        } else {
            for(int i=0; i<s.length(); i++){
                int curr = value(s.charAt(i));
              if(i+1 < s.length()  && curr < value(s.charAt(i+1))){
                val -= curr;
              }else {
                val += curr; 
              }
               
            }
            return val;
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        RomanToInteger solObj = new RomanToInteger();
        int abc = solObj.romanToInt(str);
        System.out.println("The number is: "+abc);
        sc.close();
    }
}
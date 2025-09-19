package String;
import java.util.*;

public class LenOfLastWord {

    public int lengthOfLastWord(String s) {

        //my method
        int temp = 0;
        int len = s.length()-1;
        while(len >= 0 && s.charAt(len) == ' '){
            len--;
        }
        
        while(len >= 0 && s.charAt(len) != ' '){
            temp++;
            len--;
        }

        return temp;

        //Actual method in leetcode
        
        // s = s.trim();
        // int lastSpace = s.lastIndexOf(' ');
        // return s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        LenOfLastWord  len = new LenOfLastWord();
        int result = len.lengthOfLastWord(str);

        System.out.println("The length of the last word is: "+result);

        sc.close();
    }

}
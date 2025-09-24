import java.util.*;

public class PolyAlphabetic {

    private String encryptPolyAlphabetic(String plainText, String key) {

        StringBuilder sb = new StringBuilder(); //to store all the words
        
        for(int i = 0; i < plainText.length(); i++){
            /*to convert it to A - Z using aschii value, in polyAlphabetic 
                'A' -> 0 to 
                'Z' -> 25, that is the reason we are subtracting with 'A'
            */
            int plainTextNumber = (int) plainText.charAt(i) - 'A'; 
            int keyNumber = (int) key.charAt(i) - 'A';

            int cipherNumber = (plainTextNumber  + keyNumber ) % 26;//encryption algorithm

            char c = (char) (cipherNumber + 'A'); //coverting aschii value to character(A -Z)
            sb.append(c);
        }

        String cipherText = sb.toString();
        
        return cipherText;
    }


    private String decryptPolyAlphabetic(String cipherText, String key){

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < cipherText.length(); i++){
            /*to convert it to A - Z using aschii value, in polyAlphabetic 
                'A' -> 0 to 
                'Z' -> 25, that is the reason we are subtracting with 'A'
            */
            int cipherNumber = cipherText.charAt(i) - 'A';
            int keyNumber = key.charAt(i) - 'A';
            
            int plainTextNumber = (cipherNumber - keyNumber + 26) % 26; //decryption algorithm

            char c = (char) (plainTextNumber + 'A');

            sb.append(c);
        }

        String convertedPlaintext = sb.toString();
        return convertedPlaintext;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter a word to convert it into PolyAlphabetic: ");
        
        //Getting the word from user
        String plainText = sc.next();
        plainText = plainText.toUpperCase(); //making all the words to uppercase.
        System.out.println("Plain Text:" + plainText);

        //generating of key word
        int len = plainText.length();
        StringBuilder sb =  new StringBuilder();
        for(int i = 0; i < len; i++){
            char c = (char) ('A' + rand.nextInt(26));
            sb.append(c);
        }
        String key = sb.toString();
        System.out.println("Key Text is: " +key);

        //creating object to call the method, because the method is not static.
        PolyAlphabetic polyAlphabetic = new PolyAlphabetic();

        //encryptin method
        String cipherText = polyAlphabetic.encryptPolyAlphabetic(plainText, key);
        System.out.println("Encrypted Text: " + cipherText);

        //decryption method
        String convertedPlaintext = polyAlphabetic.decryptPolyAlphabetic(cipherText, key);
        System.out.println("Decrypted Text: " + convertedPlaintext);

    }


}

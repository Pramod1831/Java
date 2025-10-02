package String;

import java.util.*;


class IsoMoprphicString {
    public boolean isIsomorphic(String s, String t) {
        

        // for storing in the form of key -> value
        Map<Character, Character> isoMap = new HashMap<>();
        //In this problem set is used for two side checking.
        Set<Character> mapped = new HashSet<>();
        

        //if length of the s is not equal to t then it is false.
        if(s.length() != t.length()){
            System.out.println("Enter the Correct Word!!");
            return false;
        } else {
    
            for(int i = 0, j = 0; i < s.length() && j < t.length(); i++, j++){
                char ps = s.charAt(i);
                char pt = t.charAt(j);
                
                if(isoMap.containsKey(ps)){
                    /*checking whether the key is present or not, 
                    if yes it should be false,
                    because there should be unique key to get isoMorphic String*/
                    if(isoMap.get(ps) != pt){
                        return false;
                    }
                } else {
                    //same as above but now we are referring to values, bcz value should also be unique.
                    if(mapped.contains(pt)){
                        return false;
                    }
                    mapped.add(pt);
                    isoMap.put(ps, pt);
                }
                
            }
        }

        return true;
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        IsoMoprphicString sol = new IsoMoprphicString();

        boolean result = false;

        result = sol.isIsomorphic(s, t);

        System.out.println(result);

        sc.close();

    }
}
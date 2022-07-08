package test;

import java.util.ArrayList;
import java.util.List;
// Confirm if a string can be manipulated to another string.
public class Test {
    public static void main(String[] args) {
        String string1 ="abb";
        String string2 = "bba";
        permutation(string1,"",string2);

    }
    static void permutation(String str, String result,String str2) {
        if (str.length() == 0){
            if (result.equals(str2) ){
                System.out.println("true: " + result+ " = "+ str2);
                return;
            }
        }
        for (int i = 0; i <str.length(); i++) {

            char character = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i + 1);
            permutation(newStr,result + character,str2);
        }

    }
}

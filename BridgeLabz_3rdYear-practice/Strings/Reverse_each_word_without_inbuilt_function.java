package strings;

import java.util.*;

public class Reverse_each_word_without_inbuilt_function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        String word="";
        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch!=' ') {
                word=ch+word;
            }
            else {
                rev=rev+word+" ";
                word="";
            }
        };
        rev=rev+word;
        System.out.println(rev);
        sc.close();
    }
}
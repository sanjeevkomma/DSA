package com.demo.tech;

public class AnagramTest {

    public static void main(String args[]) {

        String str1 = "listen", str2 = "sizlent";

        System.out.println(isAnagramOrNot(str1,str2));
    }



    static boolean isAnagramOrNot(String str1, String str2){

        boolean isAnagram = false;
        Integer counter = 0;

        for ( int i = 0; i < str1.length(); i ++ ) {

            for ( int j = 0 ; j < str2.length(); j ++ ) {


                if ( str1.charAt(i) == str2.charAt(j)){
                    counter ++ ;
                }
            }
        }

if ( counter == str1.length())
    isAnagram = true;
        return isAnagram;

    }

}

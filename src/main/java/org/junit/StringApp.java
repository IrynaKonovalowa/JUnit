package org.junit;

import java.util.regex.Pattern;

public class StringApp {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();

        return text.equalsIgnoreCase(invertedText) ;
    }

    public static int numberOfConsonants(String text) {
        String str = text.toLowerCase();
        String vowels = "aeiou";
        int cons = 0;
        for(char c : str.toCharArray()) {
            if(!Character.isLetter(c)) {
                continue;
            }
            if(vowels.indexOf(c) == -1){
                cons++;
            }
        }
        return cons;
    };
    public static int numberOfVowels(String text) {
        String str = text.toLowerCase();
        String vowels = "aeiou";
        int vows = 0;
        for(char c : str.toCharArray()) {
            if(!Character.isLetter(c)) {
                continue;
            }
            if(vowels.indexOf(c) != -1){
                vows++;
            }
        }
        return vows;
    };
    public static long numberOfWords(String text, String word) {
        String str = text.toLowerCase();
        return Pattern.compile(word)
                .matcher(str)
                .results()
                .count();
    };
}

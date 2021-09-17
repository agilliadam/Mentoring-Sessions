package Hilfe3;

import java.util.Arrays;

public class PigLatin {

//    create a method that takes a String and  converts each word to Pig latin. Pig Latin is a constructed language game in which words in English are altered according to a simple set of rules. In this exercise, convert the word by removing the first letter, placing the that letter at the end of the word, and then appending "ay" to the word. Here is an example:
//    English: I SLEPT MOST OF THE NIGHT
//    Pig Latin: IAY LEPTSAY OSTMAY FOAY HETAY IGHTNAY
//    Examples:
//    Java is fun - > avaJay siay unfay
//    How many languages do you speak -> owHay anymay anguageslay oday ouyay peaksay

    public static void main(String[] args) {
        System.out.println(pigLatin("I SLEPT MOST OF THE NIGHT"));
    }

    public static String pigLatin(String str) {


        String[] word = str.split(" ");


        for (int i = 0; i < word.length; i++) {

           String firstLetter= String.valueOf(word[i].charAt(0));
           String wordWithoutFirstLetter= word[i].substring(1);
           String restOfTheWord= wordWithoutFirstLetter+firstLetter;
           String newWord =restOfTheWord+"AY";
           word[i]=newWord;

        }

        return   Arrays.toString(word);
    }
}
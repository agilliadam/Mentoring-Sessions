package test;

import java.util.Arrays;

public class ReverseEachWord {


    public static void main(String[] args) {
        // "Hello my name is John" -> "olleH ym eman si nhoJ"

        System.out.println(reverseEachWord("Hello my name is John"));
    }



    public static String reverseEachWord (String sent){
        String[] words = sent.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            words[i] = sb.toString();
        }

      /*  String temp= "";
        for (int i = 0; i <words.length; i++) {
          temp= temp+ words[i]+" ";

        }*/


        return String.join(" ", words);
        }


    }


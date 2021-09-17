package test;

public class May12 {
    public static void main(String[] args) {
        extraEnd("Hello");
        System.out.println(extraEnd("ab"));

        printInfo("Barak Obama");


        System.out.println(rotatedStr("hi"));

        System.out.println(middleTwo("hi"));

    }


/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
extraEnd("World") → "ldldld"

*/

    /* printInfo("Barack Obama") ->
    The name: Barack
    The last name: Obama
    The initials: BO
*/
    public static void printInfo(String name) {
        String[] splitted;
        splitted = name.split(" ");
        System.out.println("First name: " + splitted[0] + "\n" + "Last Name: " + splitted[1] + "\n" + splitted[0].charAt(0) + " " + "\n" + splitted[1].charAt(0));
        String firstName = splitted[0];

    }

    public static String extraEnd(String str) {
        String fragment = str.substring(str.length() - 2, str.length());
        return fragment + fragment + fragment;

    }

    /*Create a method called right2.
       /* Given a string, it returns a "rotated right 2" version where the last 2 chars are moved to the start.
        The string length will be at least 2.


        right2("Hello") → "loHel"
        right2("java") → "vaja"
       right2("Hi") → "Hi"
        */

    public static String rotatedStr(String input) {
        String fragment = input.substring(input.length() - 2, input.length());
        String fragment2 = input.substring(0, input.length() - 2);
        return fragment + fragment2;

    }
/*Create  method called middleTwo.
Given a string of even length, it returns a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

    public static String middleTwo(String str) {
        int middle=str.length()/2;
        int oneBefore=middle-1;
        return str.substring(oneBefore,middle+1);
    }

}

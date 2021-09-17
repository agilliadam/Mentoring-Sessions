package test;


public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic")); //-> true
        System.out.println(isPalindrome("Racecar")); //-> true
        System.out.println(isPalindrome("somestring"));// -> false
        System.out.println(isPalindrome("java"));//-> false
        System.out.println(isPalindrome("TENet"));// -> true
        System.out.println(isPalindrome("t"));//-> true
        System.out.println(isPalindrome("sS")); //-> true
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]+","").toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

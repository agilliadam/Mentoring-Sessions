package Hilfe;

public class repeat {
    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho")); // → 1
        System.out.println(countHi("ABChi hi")); // → 2 countHi("hihi") → 2
        System.out.println(countHi("hihihihihi")); // → 5
        System.out.println(countHi("hello")); // → 0
        System.out.println(countHi("hiblahi")); // → 2
    }
    public static int countHi(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            String str = s.substring(i);
            if (str.startsWith("hi")) {
                count++;
            }
        }
        return count;

    }
}

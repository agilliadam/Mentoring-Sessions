package Hilfe;

public class test {

//    middleThree("Candy"); //→ "and"
//    middleThree("and"); //→ "and"
//    middleThree("solving"); //→ "lvi"
//    middleThree("o"); //
//    middleThree("65454");

    public static String middleThree(String str) {
        if (str.length() >= 3) {
            int middle = str.length() / 2;
            System.out.println(str.substring(middle - 1, middle + 2));
        } else {
            System.out.println("empty");
        }
        return"";
    }
    public static void main(String[] args) {
        System.out.println(middleThree("Candy")); // → "and"
        System.out.println(middleThree("and") ); //→ "and"
        System.out.println(middleThree("solving")); // → "lvi"
        System.out.println(middleThree("Chocolate")); // → "col"
        System.out.println(middleThree("java yet java")); // → "yet"
        System.out.println(middleThree("ok"));
    }
}
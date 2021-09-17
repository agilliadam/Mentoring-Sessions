package test;

public class May21 {


    public static void main(String[] args) {
        String str = "java";  //Immutability
         // You cannot change its original value after creation

        str.toUpperCase();

        System.out.println(str);

        StringBuilder sb = new StringBuilder("hello");

        sb.reverse();  //Mutable -> changeable

        System.out.println(sb);

        // String equality

        int i;

        String st2 = new String("java");
        String st1 = new String("java");

        System.out.println(st2 == st1);
        System.out.println(st2.equals(st1));
        // ==  checks the memory location
        // checks if they are pointing to the same object

        st1 = st2;
        // After this assignment
        // st1 will point to whatever st2 was pointing to

        System.out.println(st2 == st1);

        System.out.println();


        String st3 = "helloworld";

        String st4 = "helloworld";

        System.out.println(st3 == st4);
        System.out.println(st3.equals(st4));


        String st5 = new String("helloworld");

        System.out.println(st4 == st5);

        System.out.println(st4.equals(st5));
    }
}

package test;

public class Sort3Ints {
    public static void sort3Ints(int a,int b, int c ) {


        if (a<=b && b<=c && a<=c)
        {
            System.out.println(a +" "+b +" "+c);
        }
        else if (a<=c && c<=b && a<=b )
        {
            System.out.println(a+" " +c+" "+ b);
        }
        else if (b<=a && a<=c && b<=c)
        {
            System.out.println(b+" " + a+" "+ c);
        }
        else if (b<=c && c<=a && b<=c)
        {
            System.out.println(b+" "+ c+" "+ a);
        }
        else if(c<=a && a<=b && c<=b)
        {
            System.out.println(c+" " +a+" "+ b);
        }
        else if (c<= b && b<=a && c<=a)
        {
            System.out.println(c+" "+b+" "+ a);
        }
    }

    public static void main(String[] args) {
        sort3Ints(3, 8, 3);
    }

}








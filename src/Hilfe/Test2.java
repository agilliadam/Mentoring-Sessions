package Hilfe;

public class Test2 {
    public static void main(String[] args) {
        int x=18, y=5;
        boolean w=true,z=false;
        x=w?y++:y--;
        w=!z;
        System.out.println((x+y)+" "+(w?5:10));
        ;

    }

}

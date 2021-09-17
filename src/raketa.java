import java.io.PrintStream;

public class raketa {


    public static String triangle() {
        String code = "    /\\"+"\n   /  \\"+"\n  /    \\" ;

        return code;
    }

    public static String quadratic() {
        String code =" +------+"+"\n |      |"+"\n |      |"+"\n +------+";
        return code;
    }

    public static String UnitedStates() {
       String code = " |United|"+"\n |States|";
     return code;
    }

        public static void main (String[]args){
            System.out.println(triangle() );
            System.out.println(quadratic());
            System.out.println(UnitedStates());
            System.out.println(quadratic());
            System.out.println(triangle());


    }
    }
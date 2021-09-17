import java.util.Scanner;

public class homework {

    public static void main(String[] args) {

        System.out.println("Please enter the amount: (e.g. 23.89) ");
        Scanner scanner=new Scanner(System.in);

        double  amount = scanner.nextDouble();
        // DON'T CHANGE THE ABOVE CODE.
        // Code to get user input has been written for you. Use the "amount" variable initialized above.

        int cents = (int)(amount * 100);
        int dollars = cents/100;
        int rest1=cents%100;
        int quarters=rest1/25;
        int rest2=rest1%25;
        int dimes=rest2/10;
        int rest3=rest2%10;
        int nickels=rest3/5;
        int rest4=rest3%5;
        int pennies=rest4;


        System.out.println("dollars " + dollars);
        System.out.println("quarters " + quarters);
        System.out.println("dimes " + dimes);
        System.out.println("nickels " + nickels);
        System.out.println("pennies " + pennies);


    }
}

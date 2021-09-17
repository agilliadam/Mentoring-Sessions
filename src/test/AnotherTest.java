package test;
import java.util.Scanner;
public class AnotherTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will let you guess a random number between 0 and 100."
                + "Please enter your guess");

        int secretNumber = (int) (Math.random() * 100);
        int trials = 0;
        while (true) {
            int trialNumber = (sc.hasNext()) ? sc.nextInt() : -1;
            trials++;

            if (secretNumber == trialNumber) {
                System.out.println("Congratulations, You found the number.");
            } else if (secretNumber > trialNumber) {
                System.out.println("Try higher\n");

            } else if (secretNumber < trialNumber) {
                System.out.println("Try lower\n");

            }
        }

    }
}

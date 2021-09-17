package test;

public class LPl {
//    Create a method that generates a random license plate for 3 states in the DMV area (DC,MD,VA).
//    Your method takes the state name and returns the corresponding random license plate.
//    The format of the license plates for each state is as follows:
//    VA -> XXX-####  (e.g UUW-6698)
//    DC -> XX#### (e.g BA1956)
//    MD -> #XX#### (e.g 5CE2273)
//    If the invalid state is passed as an argument, your method should return an empty string.
//            (Additionally, you can also implement the generation of your own state's license plate).
//    Examples:
//    generatePlate("VA") -> "ADS-2252"
//    generatePlate("MD") -> "3BS6121"
//    generatePlate("DC") -> "NS7821"
//    generatePlate("NY") -> ""
//    generatePlate("TX") -> ""
//    generatePlate("blalala") -> ""

    public static void main(String[] args) {
        //tests
        System.out.println(generatePlate("VA")); // -> e.g "ADS-2252"
        System.out.println(generatePlate("MD")); // -> e.g "3BS6121"
        System.out.println(generatePlate("DC")); // -> e.g "NS7821"
        System.out.println(generatePlate("NY")); // -> ""
    }


    // implement the method
    public static String generatePlate(String str) {

            str = generateLetters(3);


        String digits = generateDigits(3);

        String licensePlate = str + "-" + digits;
        return licensePlate;
    }


    static String generateLetters(int amount) {
        String letters = "";
        int n = 'Z' - 'A' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('A' + Math.random() * n);
            letters += c;
        }
        return letters;
    }


    static String generateDigits(int amount) {
        String digits = "";
        int n = '9' - '0' + 1;
        for (int i = 0; i < amount; i++) {
            char c = (char) ('0' + Math.random() * n);
            digits += c;
        }
        return digits;
    }

    }


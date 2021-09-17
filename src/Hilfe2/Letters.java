package Hilfe2;

public class Letters {




        public static void main(String[] args) {
            Letters();
            // Using nested loops print letters in the following order:
  /*
   aa
   ab
   ac
   ad
   ..
   az
   ba
   bb
   ..
   bz
   .
   .
   za
   ..
   zz
  */

        }

            static void Letters() {
                for (int i = 97; i <= 122; i++) {
                    for (int j = 97; j <= 122; j++) {
                        System.out.print((char) i);
                        System.out.println((char) j);
                    }
                }

            }
}
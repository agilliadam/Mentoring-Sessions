package Collections;
    

        import java.util .*;


    class ArrayList {

        public static void main(String[] args) {

            Map<String, String> map;

            java.util.ArrayList arrList = new java.util.ArrayList(); // pre-java 1.5

            arrList.add("Hello");
            arrList.add("gdasc");
            arrList.add(true);
            arrList.add("true");

            System.out.println(arrList);

            
            
//        for (int i = 0; i < arrList.size(); i++) {
//            System.out.println(((String) arrList.get(i)).toUpperCase());
//        }

            // Generics   ->  < >

            java.util.ArrayList<String> list = new java.util.ArrayList<String>();
            java.util.ArrayList<Integer> list2 = new java.util.ArrayList<Integer>();
            java.util.ArrayList<Integer> list3 = new java.util.ArrayList<>();

            List<Integer> list4 = new java.util.ArrayList<>(); // polymorphism
            list4.add(2); // autoboxing
            list4.add(new Integer(23));
            list4.add(45);
            System.out.println(list4);

            // ArrayList uses an array behind the scenes
            // When you create an empty arraylist, it by default creates an array with length 10
            // ArrayList default initial capacity -> 10

            List<Integer> list5 = new java.util.ArrayList<>(100);

            List<Integer> list6 = new java.util.ArrayList<>(list4);
            list6.add(1, 55);
            System.out.println(list6.get(1));  // array -> list6[1]

            list6.remove(2);
            list6.remove(new Integer(2));
            System.out.println(list6);


            List<String> list7 = new java.util.ArrayList<>();
            list7.add("John");
            list7.add("Joe");
            list7.add("Kamala");
            list7.add("John");
            list7.add("John");
            list7.add("John");
            list7.add("John");
            list7.add("Barack");

//        list7.remove("John");


            System.out.println(list7.size());

            List<String> listJohn = new java.util.ArrayList<>();

            for (int i = 0; i < list7.size(); i++) {
                String str = list7.get(i);
                if (str.equals("John")) {
                    listJohn.add(list7.remove(i));

                    i--;  // ArrayList size changes dynamically, so you need to adjust
                    // the index if you are modifying the array
                }

            }
            // lambda  ->  functional programming
            //
//        list7.removeIf( str -> str.equals("John"));

            System.out.println(list7);
            System.out.println(listJohn);

            listJohn.clear();
            System.out.println(listJohn.isEmpty());
            System.out.println(listJohn);

            if (list7.contains("Barack")) {
                list7.remove("Barack");
            }

            System.out.println(list7);

            System.out.println(list7.indexOf("Kamala"));

            list7.set(0, "Biden");    // array -> list7[0] = "Biden";

            System.out.println(list7);

            List<String> list9 = new java.util.ArrayList<>();
            list9.add("John");
            list9.add("Joe");
            list9.add("Kamala");
            list9.add("John");
            list9.add("John");
            list9.add("John");
            list9.add("John");
            list9.add("Barack");

            list9.replaceAll(e -> e.toLowerCase());

            System.out.println(list9);

            for (int i = 0; i < list9.size(); i++) {

                list9.set(i, "Biden");
            }

            System.out.println(list9);

//        Object[] arr = new Integer[6];
//
//        arr[0] = new String("hsaf");
//
//        System.out.println(Arrays.toString(arr));

            String[][] arr2 = {
                    {"Joe", "Biden", "joebiden@gmail.com"},
                    {"Joe", "Biden", "joebiden@gmail.com"},
                    {"Joe", "Biden", "joebiden@gmail.com"},
            };


            List<List<String>> list10 = new java.util.ArrayList<>();

            list10.add(new java.util.ArrayList<>());
            list10.add(new java.util.ArrayList<>());
            list10.add(new java.util.ArrayList<>());

            list10.get(0).add("Joe");
            list10.get(0).add("Biden");
            list10.get(0).add("joebiden@gmail.com");

            list10.get(0).set(1, "BIDN");

            System.out.println(list10);

        }
    }





package Collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        List<String> list = new Vector<>();

        StringBuilder sb = new StringBuilder();
        StringBuffer stb = new StringBuffer();
    }
}


// StringBuffer is the same as StringBuilder except the methods
// of StringBuffer are synchronized/thread-safe

// Thread-safe/synchronized methods -> the execution of these methods by multiple threads are synchronized,
// when one thread calls the method, the other threads will wait till this threads completes its execution
// ArrayList was introduced in Java 1.2
// Before ArrayList Vector was the class that was used for flexible version array
// Vector is a legacy class
// Vector is essentially the same as ArrayList except its methods are synchronized/thread-safe
// Vector class also has it own specific methods
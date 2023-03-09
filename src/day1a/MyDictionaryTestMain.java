package day1a;

import java.util.Arrays;
import java.util.List;

public class MyDictionaryTestMain {

    public static void main(String[] args) {
        MyDictionary<String,String> myDictionary = new MyDictionary<>("Ten","on ac");
        System.out.println(myDictionary);

        MyDictionary<Integer,String> myDictionary2 = new MyDictionary<>(2,"PNT");
        System.out.println(myDictionary2);

        MyDictionary<String, List<String>> myDictionary3 = new MyDictionary<>(
                "new",
                List.of("alo,loa,oal,lao")
        );
        System.out.println(myDictionary3);
    }

}

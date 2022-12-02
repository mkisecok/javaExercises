package exercises.singletonpattern;

import kisecok.testproject.Color;

public class SingletonService {


    public static void main(String[] args) {



        DoubleCheckedSingleton doubleCheckedSingleton_1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton doubleCheckedSingleton_2 = DoubleCheckedSingleton.getInstance();
       // DoubleCheckedSingleton doubleCheckedSingleton_3 = new DoubleCheckedSingleton();

        //System.out.println(DoubleCheckedSingleton.StringConstant);

       // System.out.println(doubleCheckedSingleton_1.equals(doubleCheckedSingleton_2));


        BillPughSingleton billPughSingleton_1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton_2 = BillPughSingleton.getInstance();

        //System.out.println(billPughSingleton_1.equals(billPughSingleton_2));



    }
}

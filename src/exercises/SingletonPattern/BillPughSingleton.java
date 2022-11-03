package exercises.SingletonPattern;

public class BillPughSingleton {

    //private constructor
    private BillPughSingleton(){

    }
    /*
    inner static class SingletonHelper is loaded when
    SingletonHelper.theSingletonInstance is executed/called.
     */
    private static class SingletonHelper {
        private static final BillPughSingleton theSingletonInstance = new BillPughSingleton();
    }
    //public static method to get theSingletonInstance
    public static BillPughSingleton getInstance(){
        return SingletonHelper.theSingletonInstance;
        /*
        when above line is executed SingletonHelper class is loaded and
        then static variable theSingletonInstance is initialized
         */
    }
}

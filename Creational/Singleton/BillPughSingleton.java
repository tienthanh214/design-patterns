package Creational.Singleton;
/** Singleton thread safe 
 * Bill Pugh Singleton 
 *  nested class
 *  use private inner static class that contains the instance
 *  most widely used approach
 */
public class BillPughSingleton {
    private BillPughSingleton() {}
    // this inner class only loaded into memory when first call
    private static class SingletonHelper {
        private static final BillPughSingleton _instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper._instance;
    }
}

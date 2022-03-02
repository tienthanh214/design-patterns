package Creational.Singleton;
/** Singleton thread safe
 *  Double Checked Locking
 *      used in multithread system
 *      synchronized only when the instance created for the first time
 *      note: broken under Java 1.4
 */
public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking _instance;
    
    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        // if instance is initialized then return the instance
        if (_instance == null) { 
            // not sure other thread might have initialized in the meanwhile
            // so lock by synchronized keyword
            synchronized (DoubleCheckedLocking.class) {
                // double check if instance is till null
                if (_instance == null)
                    _instance = new DoubleCheckedLocking();
            }
        }
        return _instance;
    }
}

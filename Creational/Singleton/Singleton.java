package Creational.Singleton;

/** Singleton pattern
 * Ensure a class only have one instance
 * Provide a global point of access to it
 *  Lazy Initialization
 *      only create a new object on its first call
 */
public class Singleton {
    static private Singleton _instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}

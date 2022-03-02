package Creational.Singleton;

/**
 * @author tienthanh214
 */

public class Main {
    public static void main(String[] args) {
        // test lazy initialization
        System.out.println("Singleton - Lazy initialization");

        Singleton oneInstance = Singleton.getInstance();
        System.out.println(oneInstance.hashCode());
        Singleton twoInstance = Singleton.getInstance();
        System.out.println(twoInstance.hashCode());

        // test thread safe singleton
        System.out.println("Singleton thread safe - DoubleCheckedLocking");
        Thread thread1 = new Thread() {
            public void run() {
                DoubleCheckedLocking threadSafeInstance1 = DoubleCheckedLocking.getInstance();
                System.out.println(threadSafeInstance1);
                BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
                System.out.println(billPughSingleton2);


            };
        };
        Thread thread2 = new Thread() {
            public void run() {
                DoubleCheckedLocking threadSafeInstance2 = DoubleCheckedLocking.getInstance();
                System.out.println(threadSafeInstance2);
                BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
                System.out.println(billPughSingleton2);

            };
        };

        thread1.start();
        thread2.start();
    }
}

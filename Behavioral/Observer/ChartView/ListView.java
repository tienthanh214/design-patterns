package Behavioral.Observer.ChartView;

public class ListView implements Observer, Widget {
    DataArray subject; // hold a ref to data array, can use this to unregister
    
    ListView(DataArray subject) {
        this.subject = subject;
    }

    @Override
    public void update(Subject subject) {
        if (subject == this.subject) {
            draw(); // redraw with new update
        }
        
    }
    
    @Override
    public void draw() {
        System.out.println("---- List View ----");
        for (int i = 0; i < subject.getSize(); ++i)
            System.out.print(subject.getAt(i) + " ");
        System.out.println("\n");
    }
}

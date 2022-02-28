package Behavioral.Observer.ChartView;

import java.util.HashMap;

public class BarChart implements Observer, Widget {
    DataArray subject;

    public BarChart(DataArray subject) {
        this.subject = subject;
    }
    
    @Override
    public void update(Subject subject) {
        if (subject == this.subject) {
            draw();
        }    
    }

    @Override
    public void draw() {
        HashMap<Integer, Integer> count = new HashMap<>();

        System.out.println("---- Histogram BarChart ----");
        for (int i = 0; i < subject.getSize(); ++i) {
            int val = subject.getAt(i);
            count.put(val, count.getOrDefault(val, 0) + 1); 
        }
        
        for (Integer key : count.keySet()) 
            System.out.println(key + ": " + count.get(key));
        
        System.out.println("");
    }


    
}

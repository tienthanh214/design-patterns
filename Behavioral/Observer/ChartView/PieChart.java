/**
 * View as Pie chart, show ArrayList data
 */

package Behavioral.Observer.ChartView;

import java.util.HashMap;

public class PieChart implements Observer, Widget {
    DataArray subject;
    
    public PieChart(DataArray subject) {
        this.subject = subject;
    }

    @Override
    public void update(Subject sub) {
        // check to make sure notifying subject is this's subject
        if (sub == subject) {
            draw(); // redraw with new update
        }
    }

    // draw pie chart (percentage histogram)
    @Override
    public void draw() {
        HashMap<Integer, Integer> count = new HashMap<>();

        System.out.println("---- Histogram PieChart ----");
        for (int i = 0; i < subject.getSize(); ++i) {
            int val = subject.getAt(i);
            count.put(val, count.getOrDefault(val, 0) + 1); 
        }
        
        for (Integer key : count.keySet()) 
            System.out.println(key + ": " + 1.0 * count.get(key) / subject.getSize() * 100 + "%");

        System.out.println("");
    }
}

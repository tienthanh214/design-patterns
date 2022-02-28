package Behavioral.Observer.ChartView;

import java.util.ArrayList;

public class DataArray extends Subject {
    private ArrayList<Integer> data;
    
    DataArray() {
        data = new ArrayList<>();
    }

    public void setAt(int pos, int val) {
        data.set(pos, val);
        notifyObservers();
    }

    public void removeAt(int pos) {
        data.remove(pos);
        notifyObservers();
    }

    public void add(int val) {
        data.add(val);
        notifyObservers();
    }

    public int getAt(int pos) {
        return data.get(pos);
    }

    public int getSize() {
        return data.size();
    }
}

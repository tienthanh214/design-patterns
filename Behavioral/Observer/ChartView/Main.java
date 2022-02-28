package Behavioral.Observer.ChartView;

public class Main {
    public static void main(String[] args) {
        DataArray data = new DataArray();
        data.register(new ListView(data));
        data.register(new BarChart(data));
        data.add(1);
        data.add(2);
        data.add(1);
        System.out.println(">>> Add PieChart observer");
        data.register(new PieChart(data));
        data.add(3);
        data.add(3);
        data.setAt(0, 5);
        data.removeAt(0);
        System.out.println("Done");

    }
}

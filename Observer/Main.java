package Observer;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        var datasource  = new DataSource();
        var sheet1 = new SpreadSheet(datasource);
        var sheet2 = new SpreadSheet(datasource);
        var chart = new Chart(datasource);

        datasource.addObserver(sheet1);
        datasource.addObserver(sheet2);
        datasource.addObserver(chart);

        datasource.setValue(1);
    }
}
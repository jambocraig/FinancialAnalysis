package Finance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FinanceTester {
    public static void main(String[] args) throws IOException {
        ArrayList<String[]> dataList = new ArrayList<>();
        ArrayList<FinanceSet> finList = new ArrayList<>();

        String fileSP = "SP.csv";
        BufferedReader br = new BufferedReader(new FileReader(fileSP));
        String line;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        while ((line = br.readLine()) != null) {
            String[] temp = line.split(",");
            dataList.add(temp);
        }
        br.close();

        for (int i = 1; i < dataList.size(); i++) {
            LocalDate d = LocalDate.parse(dataList.get(i)[0], formatter);
            double price = Double.parseDouble(dataList.get(i)[1]);
            FinanceSet fin = new FinanceSet(d, price);
            finList.add(fin);
        }

        FinanceSet current = new FinanceSet(finList.get(0).getDate(),
                finList.get(0).getClosing());
        FinanceSet highest = new FinanceSet(LocalDate.parse("01/01/1966", formatter),
                0.0);
        FinanceSet lowest = new FinanceSet(LocalDate.parse("01/01/1966", formatter),
                1000000000.0);

        for (FinanceSet fin : finList) {
            if (fin.getClosing() > highest.getClosing()) {
                highest.setDate(fin.getDate());
                highest.setClosing(fin.getClosing());
            }
            if (fin.getClosing() < lowest.getClosing()) {
                lowest.setDate(fin.getDate());
                lowest.setClosing(fin.getClosing());
            }

        }

        System.out.println(highest);
        System.out.println(current.getClosing() / highest.getClosing());
        System.out.println(lowest);
        System.out.println(current.getClosing() / lowest.getClosing());
    }
}

package Finance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FinanceTester {
    public static void main(String[] args) throws IOException {
        ArrayList<String[]> dataList = new ArrayList<>();
        FinanceSet fin;
        String fileSP = "SP.csv";
        BufferedReader br = new BufferedReader(new FileReader(fileSP));
        String line;

        while ((line = br.readLine()) != null){
            //System.out.println(line);
            String[] temp = line.split(",");
            dataList.add(temp);
        }
        br.close();


    }
}

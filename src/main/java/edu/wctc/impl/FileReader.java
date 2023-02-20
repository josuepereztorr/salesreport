package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader implements SalesInput {
    @Override
    public List<Sale> getSales() {
        File file = new File("sales.txt");
        try {
            Scanner sc = new Scanner(file).useDelimiter(";");
            List<Sale> sales = new ArrayList<>();
            while(sc.hasNext()) {
                String[] saleStr = sc.next().split(",");
                Sale sale = new Sale(
                        saleStr[0],
                        saleStr[1],
                        StringToDouble(saleStr[2]),
                        StringToDouble(saleStr[3])
                );
                sales.add(sale);
            }
            sc.close();
            return sales;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private Double StringToDouble(String str) {
        return Double.valueOf(str);
    }
}

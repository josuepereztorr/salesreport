package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        File file = new File("sales.txt");
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter(";");
            List<Sale> sales = new ArrayList<>();
            while(sc.hasNext()) {
                // gets a line from the file
//                System.out.println(sc.next());
                String[] saleStr = sc.next().split(",");
                Sale sale = new Sale();
                sale.setCustomerName(saleStr[0]);
                sale.setCountry(saleStr[1]);
                sale.setTotalAmount(Double.valueOf(saleStr[2]));
                sale.setTax(Double.valueOf(saleStr[3]));
                sale.setShippingCost(Double.valueOf(saleStr[4]));

                sales.add(sale);
                System.out.print(sale);;
            }
            System.out.println();
            sc.close();
            return sales;
        } catch (FileNotFoundException e) {
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            throw new RuntimeException(e);
        }
    }
}

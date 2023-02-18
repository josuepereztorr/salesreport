package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        File file = new File(("sales.txt"));
        try {
            Scanner sc = new Scanner(file);
//            // set delimiter as new line to read one line as a single token
//            sc.useDelimiter(System.getProperty("line.separator"));
            sc.useDelimiter(";");
            List<Sale> sales = new ArrayList<>();
            while(sc.hasNext()) {
                // add sale
//                Sale sale =
//                sales.add(sale);
            }
            sc.close();
            return sales;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

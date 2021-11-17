package Persistence.File;

import Model.Currency;
import Persistence.CurrencyLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileCurrencyLoader implements CurrencyLoader {
    private final String filepathname;

    public FileCurrencyLoader(String filepathname) {
        this.filepathname = filepathname;
    }
    

    @Override
    public ArrayList<Currency> loadAllCurrencies() {
        ArrayList<Currency> arrayList= new ArrayList<>();
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.filepathname)));
            while (true){
                String line = bufferedReader.readLine();
                if (line == null) break; 
                arrayList.add(currencyOf(line));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException, FileCurrencyLoader::loadAllCurrencies() "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException, FileCurrencyLoader::loadAllCurrencies() "+ex.getMessage());
        }
        
        return arrayList;
    }

    private Currency currencyOf(String line) {
        
        String[] split = line.split(",");
        return new Currency(split[0],split[1], split[2]);
        
    }
    
}

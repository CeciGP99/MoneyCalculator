package moneycalculator;

import Model.Currency;
import Persistence.File.FileCurrencyLoader;
import Persistence.File.WebServiceCurrencyLoader;
import java.util.ArrayList;

public class MoneyCalculator {
    public static void main(String[] args) {
        FileCurrencyLoader fileCurrencyLoader = new FileCurrencyLoader("C:\\Users\\Cecilia Gimenez\\Documents\\NetBeansProjects\\MoneyCalculator\\currencies.txt");
        WebServiceCurrencyLoader webserviceCurrencyLoader = new WebServiceCurrencyLoader("..");
        
        ArrayList<Currency> loadAllCurrencies = fileCurrencyLoader.loadAllCurrencies();
       
    }
}

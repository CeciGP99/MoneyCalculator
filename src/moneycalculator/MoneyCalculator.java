package moneycalculator;

import Control.CalculateCommand;
import Persistence.File.FileCurrencyLoader;
import Persistence.Rest.RestExchangeRateLoader;

public class MoneyCalculator {
    public static void main(String[] args) {
        
        FileCurrencyLoader fileCurrencyLoader = new FileCurrencyLoader("");
        
        RestExchangeRateLoader restExchangeRateLoader = new RestExchangeRateLoader();
//        WebserviceCurrencyLoader webserviceCurrencyLoader = new WebserviceCurrencyLoader("..");
        MainFrame mainFrame = new MainFrame(fileCurrencyLoader.loadAllCurrencies());        
        CalculateCommand calculateCommand = new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay(), restExchangeRateLoader);
        mainFrame.add(calculateCommand);
//        ArrayList<Currency> loadAllCurrencies = fileCurrencyLoader.loadAllCurrencies();
    }
}

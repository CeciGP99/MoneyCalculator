package Persistence.File;

import Model.Currency;
import Persistence.CurrencyLoader;
import java.util.ArrayList;

public class WebServiceCurrencyLoader implements CurrencyLoader{
    private final String url;

    public WebServiceCurrencyLoader(String url) {
        this.url = url;
    }
    
    
    @Override
    public ArrayList<Currency> loadAllCurrencies() {
        ArrayList<Currency> arrayList= new ArrayList<>();
        
        return arrayList;
    }
    
}

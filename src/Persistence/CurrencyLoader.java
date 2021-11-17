package Persistence;

import Model.Currency;
import java.util.ArrayList;

public interface CurrencyLoader {
    ArrayList<Currency> loadAllCurrencies();
}

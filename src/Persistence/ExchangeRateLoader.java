package Persistence;

import Model.Currency;
import Model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate get(Currency From, Currency To);
}

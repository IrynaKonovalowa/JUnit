package org.junit;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor

public class Currency {
    private String currency;

    public double getHryvniaFromCurrency(double amount){
       double res = 0;
        if(Objects.equals(currency, "USD"))
           res = 42.10*amount;
        else if(Objects.equals(currency, "EUR"))
            res = 45.47*amount;
        else if(Objects.equals(currency, "GBP"))
            res = 53.95*amount;
        else if(Objects.equals(currency, "YEN"))
            res =  0.29*amount;
        return res;
    }
}




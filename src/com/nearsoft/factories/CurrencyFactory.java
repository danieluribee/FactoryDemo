package com.nearsoft.factories;

import com.nearsoft.enums.currencyType;
import com.nearsoft.implementations.Dollar;
import com.nearsoft.implementations.Euro;
import com.nearsoft.implementations.Yen;
import com.nearsoft.interfaces.Currency;

public class CurrencyFactory {
   
    public Currency obtainCurrency(String currencyName){  
         if(currencyName == null){  
          return null;  
         }  
       if(currencyName.equalsIgnoreCase(currencyType.DOLLAR.toString())) {  
              return new Dollar();
            }   
        else if(currencyName.equalsIgnoreCase(currencyType.EURO.toString())){  
             return new Euro();  
         }   
       else if(currencyName.equalsIgnoreCase(currencyType.YEN.toString())) {  
             return new Yen();  
       }  
    return null;  
    }  
}
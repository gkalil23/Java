
package CurrencyConverter;
import CurrencyConverter.errors.UnknownCurrencyException;
import CurrencyConverter.errors.UnknownOperationException;

public class CurrencyConverter {
    
    private double cad;
    private double usd;
    private double eur;
    
    private double cadUsdRate;
    private double cadEurRate;
    
    public void setCADtoUSDrate(double rate){
        cadUsdRate = rate;
    }
    
    public void setCADtoEURrate(double rate){
        cadEurRate = rate;
    }

    public double getCad() {
        return cad;
    }

    public double getUsd() {
        return usd;
    }

    public double getEur() {
        return eur;
    }
    
    public double convertUSD(double amount, String operationType) throws UnknownCurrencyException, UnknownOperationException {
        if(operationType.equalsIgnoreCase("buy")){
            cad = amount;
            
            usd = cad * cadUsdRate;
            
            return usd;
        }
        else if(operationType.equalsIgnoreCase("sell")){
            usd = amount;
            
            cad = usd / cadUsdRate;
            
            return cad;
        }
        
        else{
            return 0.0;
        }
    }
    
    public double convertEUR(double amount, String operationType) throws UnknownCurrencyException, UnknownOperationException {
        if(operationType.equalsIgnoreCase("buy")){
            cad = amount;
            
            eur = cad * cadEurRate;
            
            return eur;
        }
        else if(operationType.equalsIgnoreCase("sell")){
            eur = amount;
            
            cad = eur / cadEurRate;
            
            return cad;
        }
        
        else{
            return 0.0;
        }
    }
    
}

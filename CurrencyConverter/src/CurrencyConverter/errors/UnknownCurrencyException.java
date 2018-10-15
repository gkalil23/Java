
package CurrencyConverter.errors;

public class UnknownCurrencyException extends Exception {
    private String currency;
    
    public UnknownCurrencyException(String currency){
        super("Unknown currency");
        
        this.currency = currency;
    }
    
    public String getCurrency(){
        return currency;
    }
}

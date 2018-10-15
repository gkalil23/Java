
package exchangestation;

import CurrencyConverter.CurrencyConverter;
import CurrencyConverter.errors.UnknownCurrencyException;
import CurrencyConverter.errors.UnknownOperationException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        
        System.out.println("Welcome to the MONOPOLY Exchange Station\n");
        System.out.println("Please input the currency exchange rates for USD-CAD and EUR-CAD. (Ex: 0.7 0.6)\n");
        
        converter.setCADtoUSDrate(sc.nextDouble());
        converter.setCADtoEURrate(sc.nextDouble());
        
        System.out.println("Exchange Rates set!\n");
        
        
        double amount;
        String operation;
        String currency;
        double result = 0;
        
        while(true){
            try {
                System.out.println("Please input the operation desired using the word buy or sell\n");
                amount = sc.nextDouble();
                operation = sc.next();
                currency = sc.next();
                
                if(amount == 0.0){
                    break;
                }
                else {
                    switch(currency){
                        case "USD":
                            result = converter.convertUSD(amount, operation);
                            if(operation.equalsIgnoreCase("buy")){
                                System.out.println("This conversion result is: " + result + " US Dollars\n");
                            }
                            else{
                                System.out.println("This conversion result is: " + result + " Canadian Dollars\n");
                            }
                            break;
                        case "EUR":
                            result = converter.convertEUR(amount, operation);
                            if(operation.equalsIgnoreCase("buy")){
                                System.out.println("This conversion result is: " + result + " Euros\n");
                            }
                            else{
                                System.out.println("This conversion result is: " + result + " Canadian Dollars\n");
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            catch (UnknownCurrencyException e){
                System.out.println(e.getMessage() + ": " + e.getCurrency());
                break;
            }
            catch (UnknownOperationException e){
                System.out.println(e.getMessage() + ": " + e.getOperation());
                break;
            }
            
        }
        
    } 
    
}


package CurrencyConverter.errors;

public class UnknownOperationException extends Exception {
    private String operation;

    public UnknownOperationException(String operation){
        super("Unknown operation");
        
        this.operation = operation;
    }
    
    public String getOperation(){
        return operation;
    }
}

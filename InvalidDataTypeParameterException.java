public class InvalidDataTypeParameterException extends Exception {
    private String message;
    
    InvalidDataTypeParameterException(String exception){
        super(exception);
    }
    public String getException(){
        return message;
    }
}

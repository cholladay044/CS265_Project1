public class InvalidInputException extends Exception{
    private String message;
    
    InvalidInputException(String message){
        super(message);
    }
    public String getException(){
        return message;
    }
}

package java8.ubs;

public class UserInputException extends Exception{

    private int code;
    private String error_message;

    public UserInputException(){
        super();
    }

    public UserInputException(String message, String... args){
        super(message);
        String formatedString = String.format(message, args);
    }

    public UserInputException(String message, Throwable cause){
        super(message, cause);
    }

    public UserInputException(Throwable cause){
        super(cause);
    }

}

package matt.damon.exception;

public class RestException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4566793291136172631L;

    public RestException() {

    }

    public RestException(Exception e) {
    }

    public String getCode() {
        return "10-000000";
    }
}

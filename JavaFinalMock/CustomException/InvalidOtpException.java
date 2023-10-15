public class InvalidOtpException extends RuntimeException {
    private String message;

    InvalidOtpException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

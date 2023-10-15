public class MainCheckOtp {
    static void otpValidate(int otp) throws InvalidOtpException {
        String op = "" + otp;
        if (4 == op.length())
            System.out.println("Otp validated");
        else
            throw new InvalidOtpException("Enter Otp is incorrect");
    }

    public static void main(String[] args) {
        System.out.println("Main method Start");
        try {
            otpValidate(12345);
        } catch (InvalidOtpException e) {
            e.printStackTrace();
        }
        System.out.println("Main Method end");
    }
}

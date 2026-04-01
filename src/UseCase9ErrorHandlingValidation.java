public class UseCase9ErrorHandlingValidation {
    public static void main(String[] args) {
        try {
            int nights = -1;
            if (nights <= 0) throw new Exception("Invalid nights");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
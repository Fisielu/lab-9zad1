
public class z {

        public static void main(String[] args) {
            ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

            try {
                exceptionGenerator.generateException();
            } catch (NullPointerException e) {
                System.out.println("Wystąpił wyjątek NullPointerException: \n" + e.getMessage());
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
}
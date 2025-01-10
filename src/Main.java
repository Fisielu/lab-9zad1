//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println("Example text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException ocurred.");
        }

        System.out.println("Program keeps runnung.");    }
}
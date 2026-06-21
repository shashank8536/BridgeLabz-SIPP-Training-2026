package Strings.level1;

public class NullPointerExceptionDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Handling the exception:");
        handleException();
        
        System.out.println("\nGenerating the exception (this will crash if not caught):");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception generated and caught in main: " + e);
        }
    }
}

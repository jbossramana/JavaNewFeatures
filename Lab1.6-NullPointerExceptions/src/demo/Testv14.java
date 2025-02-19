package demo;

public class Testv14 {
    public static void main(String[] args) {
        String text = null;
        int length = text.length(); // NullPointerException

        System.out.println("Length of the text: " + length);
    }
}

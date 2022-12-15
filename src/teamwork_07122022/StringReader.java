package teamwork_07122022;


public class StringReader {

    public static void main(String[] args) {
        String[] values = {"Hi","My name is","Serhat"};
        showContent(values);
    }

    public static void showContent(String[] values) {
        try {
            for (String value : values) {
                System.out.print(value + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException algılandı.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException algılandı.");
        }
    }
}
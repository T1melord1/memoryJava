import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String input = new Scanner(System.in).nextLine();

    int lastNum = Integer.parseInt(String.valueOf(input.charAt(input.length()-1)));
        System.out.println(lastNum);
    }
}

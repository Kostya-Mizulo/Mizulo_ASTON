import java.util.Scanner;

public class ConsolInput {
    public static String scanValue(String textBeforeScan){
        System.out.print(textBeforeScan);
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
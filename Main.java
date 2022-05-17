import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        TcKimlik t = new TcKimlik(s);

        System.out.println(t.getTcKimlikNo() + " nolu numara " + t.kontrolEt());

    }
}

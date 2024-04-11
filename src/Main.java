import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = "аия";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String n = scanner.next();
        char[] nArray = n.toCharArray();
        if ((nArray[nArray.length - 1] == a.charAt(0)) || (nArray[nArray.length - 1] == a.charAt(1)) || (nArray[nArray.length - 1] == a.charAt(2)))
            System.out.println("Приветик!");
        else System.out.println("Здарово");
    }
}
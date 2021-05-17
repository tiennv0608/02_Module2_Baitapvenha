import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VanBan vanBan = new VanBan();
        System.out.println("Nhap chuoi van ban");
        String str = scanner.nextLine();
        int countWord = vanBan.countWord(str);
        System.out.println("So tu trong chuoi la " + countWord);
        int countLetterA = vanBan.countLetterA(str);
        System.out.println("So ky tu A trong chuoi la " + countLetterA);
        vanBan.standardize(str);
    }
}

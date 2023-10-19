import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempt = 1;
        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if(isDirectory){
                System.out.println("Это путь к директории");
                continue;
            }
            if(fileExists){
                System.out.println("Путь корректен");
                System.out.println("Это файл номер " + attempt);
                attempt+=1;
                continue;
            }else {
                System.out.println("Указанный файл не существует");
            }
        }
    }
}

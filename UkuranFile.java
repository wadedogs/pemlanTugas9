import java.io.File;

public class UkuranFile {
    String nama;

    public static void main(String[] args) {
        var file = new File("test.txt");
        if (file.exists() && file.isFile()) {
            var ukuran = file.length(); // dalam byte
            if (ukuran < 1024 * 1024) {
                System.out.printf("Ukuran file: %.2f KB%n", ukuran / 1024.0);
            } else {
                System.out.printf("Ukuran file: %.2f MB%n", ukuran / (1024.0 * 1024.0));
            }
        } else {
            System.out.println("File tidak ditemukan");
        }

    }
}

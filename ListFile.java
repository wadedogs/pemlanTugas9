import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        var direktori = new File("data"); // nama folder
        if (direktori.exists() && direktori.isDirectory()) {
            var files = direktori.listFiles();
            if (files != null) {
                for (var file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("Gagal membaca isi folder.");
            }
        } else {
            System.out.println("Folder tidak ditemukan.");
        }
    }
}

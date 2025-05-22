import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var folder = new File("data"); // nama folder
        if (folder.exists() && folder.isDirectory()) {
            var files = folder.listFiles();
            var sukses = true;
            if (files != null) {
                for (var file : files) {
                    if (file.isFile()) {
                        if (!file.delete()) {
                            System.out.println("Gagal menghapus file: " + file.getName());
                            sukses = false;
                        }
                    }
                }
            }

            if (sukses && folder.delete()) {
                System.out.println("Berhasil menghapus folder");
            } else {
                System.out.println("Gagal menghapus folder.");
            }
        } else {
            System.out.println("Folder tidak ditemukan.");
        }
    }
}

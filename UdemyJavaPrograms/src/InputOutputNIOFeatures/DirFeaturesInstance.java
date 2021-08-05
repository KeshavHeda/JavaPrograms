package InputOutputNIOFeatures;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class DirFeaturesInstance {

    public static void main(String[] args) {

        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path path) throws IOException {
                return (Files.isRegularFile(path));
            }
        };

//        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p); // lambda function to filter

        Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2"); // windows separator
//        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2"); // OS independent separator
//        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.dat")) { // get only files with glob match
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for(Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException io) {
            System.out.println(io.getMessage());
            io.printStackTrace();
        }
        System.out.println("********************************************");
        String separator = File.separator;
        System.out.println(separator);
        String separator1 = FileSystems.getDefault().getSeparator();
        System.out.println(separator1);
        System.out.println("********************************************");
        try {
            Path tempFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary File Path = " + tempFile.toAbsolutePath());
        } catch (IOException  io) {
            System.out.println(io.getMessage());
            io.printStackTrace();
        }
        System.out.println("********************************************");
        // system volumes info
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores) {
            System.out.println("file store = " + store.name());
            System.out.println("Volume Name/Drive Letter = " +store);
        }
        System.out.println("********************************************");

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPaths) {
            System.out.println(path);
        }

    }
}

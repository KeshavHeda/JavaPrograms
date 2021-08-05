package InputOutputNIOPaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsInstance {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        System.out.println("*********************************************");
//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);
        System.out.println("*********************************************");
//        filePath = Paths.get("C:\\Users\\I328384\\OneDrive - SAP SE\\I328384_data\\Officials\\SelfProjects\\SelfLearn projects\\GithubJava\\OutThere.txt");
        filePath = Paths.get("C:\\Users\\I328384\\OneDrive - SAP SE\\I328384_data\\", "Officials\\SelfProjects\\SelfLearn projects\\GithubJava\\OutThere.txt");
        printFile(filePath);
        System.out.println("*********************************************");
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());
        System.out.println("*********************************************");
        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());
        System.out.println("*********************************************");
        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
        System.out.println(path3.toAbsolutePath());

        Path path4 = Paths.get("C:\\abcdef\\whatever.txt");
        System.out.println(path4.toAbsolutePath());

        filePath = FileSystems.getDefault().getPath("files");
        System.out.println("Exists = " + Files.exists(filePath));

        System.out.println("Exists = " + Files.exists(path4));
    }

    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}

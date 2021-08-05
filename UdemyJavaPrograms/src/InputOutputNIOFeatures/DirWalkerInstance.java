package InputOutputNIOFeatures;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirWalkerInstance {

    public static void main(String[] args) {
//        System.out.println("--------------- Walking Tree for Dir2 -------------------");
//        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
//        try {
//            Files.walkFileTree(dir2Path, new PrintNames());
//        } catch(IOException ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
//
//        System.out.println("--------------- Copy Dir2 to Dir4/Dir2Copy -------------------");
//        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
//        try {
//            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath) );
//        } catch(IOException ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }

        System.out.println("----------------------------------------------");
        File file = new File("C:\\Examples\\file1.txt");
        Path convertedPath = file.toPath();
        System.out.println("convertedPath = " + convertedPath);

        System.out.println("----------------------------------------------");
        File parent = new File("C:\\Examples");
        File resolvedFile = new File(parent, "Dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("C:\\Examples", "Dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        System.out.println("----------------------------------------------");
        Path parentPath = Paths.get("C:\\Examples");
        Path childRelativePath = Paths.get("Dir\\file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        System.out.println("----------------------------------------------");
        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("-------------------- print Dir2 contents using list --------------------------");
        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i=0; i< dir2Contents.length; i++) {
            System.out.println("i = " + i + ": " + dir2Contents[i]);
        }

        System.out.println("-------------------- print Dir2 contents using listFiles --------------------------");
        File[] dir2Files = dir2File.listFiles();
        for(int i=0; i< dir2Files.length; i++) {
            System.out.println("i = " + i + ": " + dir2Files[i].getName());
        }

    }
}

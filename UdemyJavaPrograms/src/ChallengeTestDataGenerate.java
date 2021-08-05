import InputOutputIntroduction.Location;

import java.io.*;

public class ChallengeTestDataGenerate {

    public static void main(String[] args) {

        try (FileWriter locFile = new FileWriter("TestDataLarge.txt")) {

            for(int i = 1; i <= 400; i++) {
                String comment1 = "#YMSG: Information Messages for User";
                String sourceText1 = "XTXT.BackendGenericError" + i + "=Back-end error! Please check the back-end services connection. \\n For error details, check the browser console.";

                String comment2 = "#YMSG: Tooltip Information about feature";
                String sourceText2 = "XTXT.SourcePathInputToolTip" + i + "=On downloading the translations, the source file will be in the folder structure specified by this field.";

                String comment3 = "#YMSG: Git Push to Repository";
                String sourceText3 = "XMSG.PushInProgress" + i + "=Transferring the translated file(s) to your repository.";

                String comment4 = "#XTIT: Page Title";
                String sourceText4 = "XTIT.ABAPListConfiguration" + i + "=ABAP Object List Configuration.";

                String comment5 = "#XBUT: Button Text";
                String sourceText5 = "XBUT.ServerTypeToolTip" + i + "=About which server type to choose.";

//                locFile.write(comment1 + "\n");
                locFile.write(sourceText1 + "\n");

//                locFile.write(comment2 + "\n");
                locFile.write(sourceText2 + "\n");

//                locFile.write(comment3 + "\n");
                locFile.write(sourceText3 + "\n");

//                locFile.write(comment4 + "\n");
                locFile.write(sourceText4 + "\n");

//                locFile.write(comment5 + "\n");
                locFile.write(sourceText5 + "\n");
            }
            System.out.println("Test Data Generated");

        } catch(IOException io) {
            io.printStackTrace();
        }
    }
}

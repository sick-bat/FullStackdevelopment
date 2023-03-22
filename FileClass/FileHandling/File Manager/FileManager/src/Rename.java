import java.io.File;
import java.util.*;

public class Rename {
    public void renameFile(){
        System.out.println("Please provide a valid path of the file to be renamed and the file name");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String filename = sc.nextLine();
        File old = new File(path, filename);
        System.out.println("Enter the new name of the file ");
        String newname = sc.nextLine();
        File newfilename = new File(newname);

        boolean success = old.renameTo(newfilename);


    }
    
}

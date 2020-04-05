import java.io.File;
 
public class CreateDirectoryExample {
     
    private static final String FOLDER ="C:\\demo_java\\java\\new";
 
    public static void main(String[] args) {
         
        File newFolder = new File(FOLDER);
         
        boolean created =  newFolder.mkdirs();
         
        if(created)
            System.out.println("Folder was created !");
        else
            System.out.println("Unable to create folder");
    }
}
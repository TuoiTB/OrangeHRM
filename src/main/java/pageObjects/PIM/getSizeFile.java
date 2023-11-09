package pageObjects.PIM;
import java.io.File;
public class getSizeFile
{
    //path of the file
    static final String PATH = "D:\\PROJECT\\OrangeHRM\\uploadFiles";
    public static void main(String args[])
    {
        //creating a constructor of the File class and passing the path of the file
        File file = new File(PATH);
        //checks if the specified exists or the specified file is a normal file (not a directory)
        if (!file.exists() || !file.isFile())
            return;
        //prints file size in bytes
        System.out.println(sizeInBytes(file));
        //prints file size in KB
        System.out.println(sizeInKiloBytes(file));
        //prints file size in MB
        System.out.println(sizeInMegaBytes(file));
    }
    //the method calculates the file size in megabytes
    private static String sizeInMegaBytes(File file)
    {
        return (double) file.length() / (1024 * 1024) + " mb";
    }
    //the method calculates the file size in kilobytes
    private static String sizeInKiloBytes(File file)
    {
        return (double) file.length() / 1024 + " kb";
    }
    //the method calculates the file size in bytes
    private static String sizeInBytes(File file)
    {
        return file.length() + " bytes";
    }
}
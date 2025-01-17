
package filedemonstration;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileDemonstration{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file or directory name: ");
        analyzePath(input.nextLine());
    } 
    
    public static void analyzePath(String path ){
        File name = new File(path);
        if (name.exists()){
            
            JOptionPane.showMessageDialog(null,String.format(
          "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            name.getName(), " exists",
                (name.isFile() ? "is a file" : "is not a file" ),
                (name.isDirectory() ? "is a directory" : "is not a directory" ),
                (name.isAbsolute() ? "is absolute path" : "is not absolute path" ),
            "Last modified: ",name.lastModified(),
            "Length: ", name.length(),
            "Path: ", name.getPath(), 
            "Absolute path:",name.getAbsolutePath(),
            "Parent: ", name.getParent()), "Information about "+path, JOptionPane.INFORMATION_MESSAGE);
            
            if (name.isDirectory()){
                String[] directory = name.list();
                String message = "\n\nDirectory contents:\n";

                for (String directoryName : directory){
                    message.concat("\n"+directoryName);
                }
                
            }
        }else{
            JOptionPane.showMessageDialog(null,
                    String.format("%s %s", path, "does not exist."), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }
}

            
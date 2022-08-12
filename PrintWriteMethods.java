package writedata;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteMethods {

    public static void main(String[] args) throws IOException {
        //create a file need import IOException
        File file = new File("C:\\Users\\Gazi\\Desktop\\JAVA Class\\WriteData\\testWriting.txt");
        file.createNewFile(); //create a file need import IOException
        System.out.println("Does it exist? "+ file.exists());
        System.out.println("The file has "+ file.length()+ " bytes");
        System.out.println("Can It be read? "+ file.canRead());
        System.out.println("Can It be Written? "+ file.canWrite());
        System.out.println("Is it a directory? "+ file.isDirectory());
        System.out.println("Is it a File? "+ file.isFile());
        System.out.println("Is it a Absolute? "+ file.isAbsolute());
        System.out.println("Is it a hidden? "+ file.isHidden());
        System.out.println("Absolute path is? "+ file.getAbsolutePath());
        System.out.println("Last Modified on? "+ new java.util.Date(file.lastModified()));
        
        try (PrintWriter printInFile = new PrintWriter(file)) {
            printInFile.print("This is a Java programar");
        }
//        //or
//        PrintWriter printInFile = new PrintWriter(file);
//        printInFile.print("This is a Java programar");
//        printInFile.close();
        
    }
    
}
//Result Exicution is : 
//Does it exist? true
//The file has 0 bytes
//Can It be read? true
//Can It be Written? true
//Is it a directory? false
//Is it a File? true
//Is it a Absolute? true
//Is it a hidden? false
//Absolute path is? C:\Users\Gazi\Desktop\JAVA Class\WriteData\testWriting.txt
//Last Modified on? Fri Aug 12 11:48:24 BDT 2022
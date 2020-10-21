package ge.edu.btu;

import java.io.File;
import java.util.Scanner;

public class FileFinder {
    public static void findFiles() {
        File folder = new File("C:\\Users\\User\\Desktop");
        String[] files = folder.list();

        System.out.println("შეიტანეთ საძიებო სიტყვა: ");

        Scanner scanner=new Scanner(System.in);
        String fileName = scanner.nextLine();

        for(int i=0;i<files.length;i++){
            if(files[i].startsWith(fileName)) System.out.println(files[i]);
        }
    };
}


package FileHandling;

//import java.io.*;

import java.io.*;
import java.util.Scanner;

public class ioClass {

    public static void main(String[] args) throws IOException {

 //file deletion code
//        File f =new File("src/FileHandling/note.txt");
//        f.createNewFile();

//reading data from file
//        InputStream is = new FileInputStream("src/FileHandling/notes.txt");
//        Scanner s =new Scanner(is);
//        int content=is.read();
//
//        while(content != -1){
//            System.out.println((char) content);
//             content=is.read();
//        }
// file write

//        FileOutputStream f1 =new FileOutputStream("src/FileHandling/note.txt", true);
//        // true means we are not erasing previous wriiten data of file
//        String s="vishal";
//        byte[] bytes = s.getBytes();
//
//        f1.write(bytes);
//        f1.close();

//        InputStream is1 = new FileInputStream("src/FileHandling/note.txt");
        BufferedReader br =new BufferedReader(new FileReader("src/FileHandling/note.txt"));
         String content1=br.readLine();
        while(content1 != null){
            // how to add multiple split
            String[] content2=content1.split("[,@]+");

            for(String content3 : content2){
                System.out.println(content3);
            }
//            System.out.println(content1);
             content1=br.readLine();
        }



// how to convert single string to byte
//          String str = "Aello";
//          byte[] b = str.getBytes();
//        System.out.println(b[0]);




    }
}

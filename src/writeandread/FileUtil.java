/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package writeandread;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;



/**
 *
 * @author Yusif
 */
public class FileUtil {
    
    private static void writeintoFile(String str) throws IOException{
        FileWriter fw = new FileWriter("yuska.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(str);
        
        bw.close();
        
    }
    
    private static void writeFileStrToByte(String str) throws IOException{
        byte [] byteText = str.getBytes();
        FileOutputStream fos = new FileOutputStream("yuska.txt", true);
        fos.write(byteText);
        fos.close();         
    } 
    
        private static void writeObjToFile(Object serObj) throws IOException{
                try {
            FileOutputStream fos = new FileOutputStream("yuska.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }      
    }
        
        public void instancewriteObjToFile(Object obj) throws IOException{
             FileUtil.writeObjToFile(obj);
        }
    
    
    private static void writeToPosition(String filename, int data, long position) 
  throws IOException {
    RandomAccessFile writer = new RandomAccessFile(filename, "rw");
    writer.seek(position);
    writer.writeInt(data);
    writer.close();
}
    
        public void instancewriteFileStrToByte(String str) throws IOException{
        FileUtil.writeFileStrToByte(str);
    }
    
    public void instanceWritetoFile(String str) throws IOException{
        FileUtil.writeintoFile(str);
    }
    
        public void instancewriteToPosition(String str) throws IOException{
        FileUtil.writeToPosition("yuska.txt",3,4);
    }
    
}

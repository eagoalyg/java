//java文本文件写操作
import java.io.*;

public class WriteStream{
    public static void main(String[] args){
        writeFile1();
        writeFile2();
    }


    private static void writeFile1(){
        FileOutputStream fis = null;
        OutputStreamWriter isr = null;
        BufferedWriter br = null;
        try{
            fis = new FileOutputStream("dir/t.txt");
            isr = new OutputStreamWriter(fis, "utf-8");
            br = new BufferedWriter(isr);
            br.write("hello");
            br.newLine();
            br.write("jack");
            br.newLine();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                br.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }


    private static void writeFile2(){
        try(BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dir/t.txt")))){
            br.write("hello");
            br.newLine();
            br.write("jack");
            br.newLine();
        }catch (Exception e){
            e.printStackTrace();
        }
    }    
}
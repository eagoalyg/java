//java文本文件读操作
import java.io.*;

public class ReadStream{
    public static void main(String[] args){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try{
            fis = new FileInputStream("dir/t.txt");
            isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
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


    private void readFile2(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dir/t.txt")))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
            }
    }
}
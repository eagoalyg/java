//java二进制文件的读操作
import java.io.*;

public class BinFileRead{
	public static void main(String[] args){
		fileRead1();
		fileRead2();
	}

	public static void fileRead1(){
		FileInputStream fos = null;
		BufferedInputStream bos = null;
		DataInputStream dos = null;
		try{
			fos = new FileInputStream("dir/t.txt");
			bos = new BufferedInputStream(fos);
			dos = new DataInputStream(bos);
			String a = dos.readUTF();
			int i = dos.readInt();
			String b = dos.readUTF();
			System.out.println(a);
			System.out.println(i);
			System.out.println(b);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				dos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void fileRead2(){
		//try-resource写法
		try(DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream("dir/t.txt")))){
			String a = dos.readUTF();
			int i = dos.readInt();
			String b = dos.readUTF();
			System.out.println(a);
			System.out.println(i);
			System.out.println(b);	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
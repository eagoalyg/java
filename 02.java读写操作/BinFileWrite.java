//java二进制文件的写操作
import java.io.*;

public class BinFileWrite{
	public static void main(String[] args){
		fileWrite1();
		fileWrite2();
	}

	public static void fileWrite1(){
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		try{
			fos = new FileOutputStream("dir/t.txt");
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			dos.writeUTF("a");
			dos.writeInt(20);
			dos.writeUTF("b");
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

	public static void fileWrite2(){
		//try-resource写法
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dir/t.txt")))){
				dos.writeUTF("a");
				dos.writeInt(20);
				dos.writeUTF("b");	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
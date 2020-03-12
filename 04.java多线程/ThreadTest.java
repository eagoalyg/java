//java多线程的简单实现

public class ThreadTest{
	public static void main(String[] args){
		ThreadOne to = new ThreadOne("dick");
		ThreadOne to1 = new ThreadOne("jack");
		to.start();
		to1.start();
	}
}


class ThreadOne extends Thread{
	String names;
	ThreadOne(String names){
		this.names = names;
	}
	public void run(){
		System.out.println(names + Thread.currentThread().getName());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
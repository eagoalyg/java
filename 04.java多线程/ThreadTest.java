//java多线程的简单实现

public class ThreadTest{
	public static void main(String[] args){
		ThreadOne to = new ThreadOne("dick");
		ThreadOne to1 = new ThreadOne("jack");
		ThreadTwo tt = new ThreadTwo();
		//使用接口实现多线程必须用Thread类来包装线程类
		Thread t = new Thread(tt);
		to.start();
		to1.start();
		t.start();

	}
}

//使用类继承来实现多进程
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
		System.out.println(Thread.currentThread().getName() + "done");
	}
}

//使用接口实现多进程
class ThreadTwo implements Runnable{
	public void run(){
		System.out.println("hello" + Thread.currentThread().getName());
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "done");
	}
}
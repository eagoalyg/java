package product;
import java.util.Random;

class Producter implements Runnable{
	private Storage storage;
	public Producter(Storage storage){
		this.storage = storage;
	}
	public void run(){
		int i = 0;
		Random r = new Random();
		while(i<10){
			i++;
			Product product = new Product(i, "手机" + r.nextInt(100));
			storage.push(product);
		}
	}
}
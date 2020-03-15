package product;

public class ProductTest{
	public static void main(String[] args) {
	 	Storage storage = new Storage();
	 	Thread producter1 = new Thread(new Producter(storage));
	 	producter1.setName("生产者１");
	 	Thread producter2 = new Thread(new Producter(storage));
	 	producter2.setName("生产者2");
	 	Thread cunsumer1 = new Thread(new Cunsumer(storage));
	 	cunsumer1.setName("生产者１");
	 	Thread cunsumer2 = new Thread(new Cunsumer(storage));
	 	cunsumer2.setName("生产者2");

	 	producter1.start();
	 	producter2.start();
	 	try{
	 		Thread.sleep(1000);
	 	}catch(InterruptedException e){
	 		e.printStackTrace();
	 	}
	 	cunsumer1.start();
	 	cunsumer2.start();
	 } 
}
package product;

class Cunsumer implements Runnable{
	private Storage storage;
	public Cunsumer(Storage storage){
		this.storage = storage;
	}
	public void run(){
		int i = 0;
		while(i<10){
			i++;
			storage.top();
		}
	}
}
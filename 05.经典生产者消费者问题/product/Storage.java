package product;

class Storage{
	private Product[] products = new Product[10];
	private int top = 0;

	//入库
	public synchronized void push(Product product){
		while(top == products.length){
			try{
				System.out.println("仓库已满！！！");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		products[top++] = product;
		System.out.println(Thread.currentThread().getName() + "生产了产品" + product);
		notifyAll();
		System.out.println("producter nitifyAll");
	}

	//出库
	public synchronized void top(){
		while(top == 0){
			try{
				System.out.println("仓库已空！！！");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		--top;
		Product p = new Product(products[top].getId(), products[top].getName());
		products[top] = null;
		System.out.println(Thread.currentThread().getName() + "消费产品" + p);
		notifyAll();
		System.out.println("cunsumer nitifyAll");
	}
}
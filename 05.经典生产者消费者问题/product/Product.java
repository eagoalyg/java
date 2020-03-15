package product;

class Product{
	private int id;
	private String name;

	public Product(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){
		return "产品ＩＤ：" + id + " 产品名字：" + name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
}
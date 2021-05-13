package extend;

public abstract class Product {
//有抽象方法存在必為抽象類別
//抽象類別不一定會有抽象方法
//	public abstract void calc();
	
	public static final double TAX;
	static {
		TAX =0.05;
//		System.out.println("static block");
		
	}
	
	protected String name;
	protected int price;
	

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String desc() {
		return String.format("名稱:%s,價錢:%d", name,price);
		
	}
	
	
	
}

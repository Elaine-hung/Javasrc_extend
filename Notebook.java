package extend;
//在notenook上 ctrl+1:fix 選擇地一個建議 會自動跑程式@override...
public class Notebook extends Product{//+ abstract
	
	public int warranty;//有繼承所以可以不用寫public name product這兩行
	public Notebook(String name, int price, int warranty) {
		super(name,price);//如果沒有呼叫這行 compiler會自動加一個super();在這裡
//		this.name = name;//有繼承所以可以執行   有super這行就可以省略
//		this.price = price;//有繼承所以可以執行  有super這行就可以省略
//		setName(name);
//		setPrice(price);
		
		this.warranty = warranty;
	}
	
	//annotation對這個方法做註記(檢查) 表示方法為繼承 要改變
	@Override
	public String desc() {
		String info=super.desc();//名稱:%s,價錢:%d
		
		return String.format("%s,保固:%d天", info,warranty);

//		return super.desc();
	}
	
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	
	
	
	
	
}

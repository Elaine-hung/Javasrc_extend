package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		
		//Product原本設Notebook
		//Notebook具備兩個型態，一個是本身的Notebook,另一個繼承來的Product
		Product nb=new Notebook("Asus",30000,365);
//		System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());
		
		System.out.println(nb.desc());//呼叫方法
//		nb.getWarranty();
		nb.getName();
		nb.getPrice();
//		Product a =new Product("冷氣",50000);
//		System.out.println(a.name);//在同一個package所以不會跑錯誤
		//先取得日歷Calendar再取得日期Date
//		GregorianCalendar calendar=new GregorianCalendar(2021,4,13);//月份是0起算 日跟年都正常1起算
		GregorianCalendar calendar=new GregorianCalendar(2021, Calendar.MAY,13);//月份是0起算 日跟年都正常1起算
		
		Date date=calendar.getTime();
		
		Food food =new Food("肉鬆",200, date);
		System.out.println(food.desc());
		
//		Product[]items=new Product[] {nb,food};
		Product[]items= {nb,food};
		buy(items);
//		
//		buy(nb);
//		buy(food);
	}

	public static void buy(Product[] ps) {
		int sum =0;
		for(Product eachItem:ps) {
			System.out.println("買入:"+eachItem.desc());
			sum=sum+eachItem.getPrice();
		}
		System.out.println("總金額:"+sum);
	}//就不需要輸入兩次的商品
//	public static void buy(Food f) {
//		System.out.println("買入:"+f.desc());
//		
//	}
}


//		final int b =1;
//		b=2;//上面有final所以會跑錯
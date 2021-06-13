package com.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bookShop=new BookShop();
		bookShop.setShopName("Shop1");
		bookShop.loadDataFromDatabase();
		System.out.println(bookShop);
		
//		BookShop bookShop1=(BookShop) bookShop.clone(); //shallow cloning
		BookShop bookShop1=bookShop.clone("Shop1"); //deep cloning
		bookShop.getBooks().remove(2);
		
		System.out.println(bookShop);
		System.out.println(bookShop1);

	}

}

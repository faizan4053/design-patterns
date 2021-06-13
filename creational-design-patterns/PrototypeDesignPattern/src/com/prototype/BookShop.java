package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadDataFromDatabase() {
		for(int i=1;i<=10;i++) {
			Book b=new Book();
			b.setbId(i);
			b.setbName("book "+i);
			this.getBooks().add(b);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	//for shallow cloning 
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
	//for deep cloning original object data is reflected in cloned object even if there is a change in original object
	
	protected BookShop clone(String shopName) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookShop =new BookShop();
		bookShop.setShopName(shopName);
		for(Book book:this.getBooks()) {
			bookShop.getBooks().add(book);
		}
		return bookShop;
	}
	

	
}

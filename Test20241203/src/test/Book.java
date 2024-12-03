package test;

public class Book {
	
	private String bookname;
	private String author;
	
	public Book(String bookname, String author) {
		this.bookname=bookname;
		this.author=author;
	}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void prn() {
		System.out.println("책이름 : " + bookname);
		System.out.println("저자 : " + author);
	}
	
}

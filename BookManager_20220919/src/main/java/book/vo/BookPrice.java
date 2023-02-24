package book.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class BookPrice implements Serializable{
	
	public static final long serialVersionUID = 95624873864235L;
	
	private int bookid;
	private Timestamp bookpdate;
	private int bookprice;
	
	public BookPrice() {
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public Timestamp getBookpdate() {
		return bookpdate;
	}

	public void setBookpdate(Timestamp bookpdate) {
		this.bookpdate = bookpdate;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return String.format("BookPrice [bookid=%s, bookpdate=%s, bookprice=%s]", bookid, bookpdate, bookprice);
	}
	
}

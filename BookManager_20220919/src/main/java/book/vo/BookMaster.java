package book.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class BookMaster implements Serializable{
	
	public static final long serialVersionUID = 483973849278934783L;
	
	private int bookid;
	private String bookname;
	private String bookisbn;
	private String bookdomain;
	private Timestamp bookwdate;
	
	public BookMaster() {
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookisbn() {
		return bookisbn;
	}

	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}

	public String getBookdomain() {
		return bookdomain;
	}

	public void setBookdomain(String bookdomain) {
		this.bookdomain = bookdomain;
	}

	public Timestamp getBookwdate() {
		return bookwdate;
	}

	public void setBookwdate(Timestamp bookwdate) {
		this.bookwdate = bookwdate;
	}

	@Override
	public String toString() {
		return String.format("BookMaster [bookid=%s, bookname=%s, bookisbn=%s, bookdomain=%s, bookwdate=%s]", bookid,
				bookname, bookisbn, bookdomain, bookwdate);
	}
	
}

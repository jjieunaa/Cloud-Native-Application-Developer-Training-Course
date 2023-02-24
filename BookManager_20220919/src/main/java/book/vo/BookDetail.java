package book.vo;

import java.io.Serializable;

public class BookDetail implements Serializable{
	
	public static final long serialVersionUID = 4625973486795L;
	
	private int bookid;
	private String bookcontent;
	private int bookpagecnt;
	private String bookauthor;
	
	public BookDetail() {
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookcontent() {
		return bookcontent;
	}

	public void setBookcontent(String bookcontent) {
		this.bookcontent = bookcontent;
	}

	public int getBookpagecnt() {
		return bookpagecnt;
	}

	public void setBookpagecnt(int bookpagecnt) {
		this.bookpagecnt = bookpagecnt;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	@Override
	public String toString() {
		return String.format("BookDetail [bookid=%s, bookcontent=%s, bookpagecnt=%s, bookauthor=%s]", bookid,
				bookcontent, bookpagecnt, bookauthor);
	}
	
}

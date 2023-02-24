package product;

public class Product implements java.io.Serializable {

	private String prodNo;
	private String prodName;
	private String prodDate;
	private String prodQuan;

	public Product() {
	}

	public String getProdNo() {
		return prodNo;
	}

	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDate() {
		return prodDate;
	}

	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
	}

	public String getProdQuan() {
		return prodQuan;
	}

	public void setProdQuan(String prodQuan) {
		this.prodQuan = prodQuan;
	}

}

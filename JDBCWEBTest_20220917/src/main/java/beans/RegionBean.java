package beans;

import java.io.Serializable;

public class RegionBean implements Serializable {
	
	public static final long serialVersionUID = 3247983483273L;
	
	public RegionBean() {
	}
	
	private int regionID;
	private String regionDescription;
	
	public int getRegionID() {
		return regionID;
	}
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}
	public String getRegionDescription() {
		return regionDescription;
	}
	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}
	
	@Override
	public String toString() {
		return "RegionBean [regionID=%s, regionDescription=%s]" + regionID + regionDescription;
	}
	
}

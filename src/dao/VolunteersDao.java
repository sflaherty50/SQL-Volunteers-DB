package dao;

public class VolunteersDao {
	private int vol_id;
	private int org_id;
	private String full_name;
	private String phone;
	public VolunteersDao(int vol_id, int org_id, String full_name, String phone) {
		super();
		this.vol_id = vol_id;
		this.org_id = org_id;
		this.full_name = full_name;
		this.phone = phone;
	}
	public int getvol_id() {
		return vol_id;
	}
	public void setvol_id(int vol_id) {
		this.vol_id = vol_id;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getfull_name() {
		return full_name;
	}
	public void setfull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	

}
	

}

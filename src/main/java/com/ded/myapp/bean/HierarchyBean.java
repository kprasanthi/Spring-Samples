package com.ded.myapp.bean;

import java.util.List;

public class HierarchyBean {
	String attID;
	String firstName;
	String lastName;
	String email;
	String phone;
	String qPresence;
	// only needed for the top hierarchy
	int totalDBCount;
	double totalDBCapacity;
	double totalDBUsed;
	double totalDBFree;
	
	List<HardwareInventoryBean> totalInvBean;
	
	List<HardwareInventoryBean> hardwareInvObjLst;
	DPLRInfoBean dplrInfoObj;
	List<HierarchyBean> hierarchyColl;
	
	//modify the constructor to include dplrInfoObj and hierarchyColl
	public HierarchyBean(String attID, String firstName, String lastName,
			String email, String phone, String qPresence, int totalDBCount,
			double totalDBCapacity, double totalDBUsed, double totalDBFree,
			List<HardwareInventoryBean> totalInvBean,List<HardwareInventoryBean> hardwareInvObjLst)  {
		
		this.attID = attID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.qPresence = qPresence;
		this.totalDBCount = totalDBCount;
		this.totalDBCapacity = totalDBCapacity;
		this.totalDBUsed = totalDBUsed;
		this.totalDBFree = totalDBFree;
		this.totalInvBean = totalInvBean;
		this.hardwareInvObjLst = hardwareInvObjLst;
		
	}
	
	public String getAttID() {
		return attID;
	}
	public void setAttID(String attID) {
		this.attID = attID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getqPresence() {
		return qPresence;
	}
	public void setqPresence(String qPresence) {
		this.qPresence = qPresence;
	}
	
		public DPLRInfoBean getDplrInfoObj() {
		return dplrInfoObj;
	}
	public void setDplrInfoObj(DPLRInfoBean dplrInfoObj) {
		this.dplrInfoObj = dplrInfoObj;
	}
	
	public List<HierarchyBean> getHierarchyColl() {
		return hierarchyColl;
	}
	public void setHierarchyColl(List<HierarchyBean> hierarchyColl) {
		this.hierarchyColl = hierarchyColl;
	}
	public List<HardwareInventoryBean> getHardwareInvObjLst() {
		return hardwareInvObjLst;
	}
	public void setHardwareInvObjLst(List<HardwareInventoryBean> hardwareInvObjLst) {
		this.hardwareInvObjLst = hardwareInvObjLst;
	}
	public List<HardwareInventoryBean> getTotalInvBean() {
		return totalInvBean;
	}
	public void setTotalInvBean(List<HardwareInventoryBean> totalInvBean) {
		this.totalInvBean = totalInvBean;
	}
	public int getTotalDBCount() {
		return totalDBCount;
	}
	public void setTotalDBCount(int totalDBCount) {
		this.totalDBCount = totalDBCount;
	}
	public double getTotalDBCapacity() {
		return totalDBCapacity;
	}
	public void setTotalDBCapacity(double totalDBCapacity) {
		this.totalDBCapacity = totalDBCapacity;
	}
	public double getTotalDBUsed() {
		return totalDBUsed;
	}
	public void setTotalDBUsed(double totalDBUsed) {
		this.totalDBUsed = totalDBUsed;
	}
	public double getTotalDBFree() {
		return totalDBFree;
	}
	public void setTotalDBFree(double totalDBFree) {
		this.totalDBFree = totalDBFree;
	}
	@Override
	public String toString() {
		return "HierarchyBean [attID=" + attID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phone="
				+ phone + ", qPresence=" + qPresence + ", totalDBCount="
				+ totalDBCount + ", totalDBCapacity=" + totalDBCapacity
				+ ", totalDBUsed=" + totalDBUsed + ", totalDBFree="
				+ totalDBFree + ", totalInvBean=" + totalInvBean
				+ ", hardwareInvObjLst=" + hardwareInvObjLst + ", dplrInfoObj="
				+ dplrInfoObj + ", hierarchyColl=" + hierarchyColl + "]";
	}
	
	
}

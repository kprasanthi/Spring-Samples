package com.ded.myapp.bean;

public class HardwareInventoryBean {
	
	int db_Count;
	String db_Type;
	double db_FreeSize;
	double db_UsedSize;
	double db_Size;
	
	public HardwareInventoryBean(int db_Count,String db_Type,
	        double db_FreeSize,double db_UsedSize,double db_Size) {
			
         this.db_Count = db_Count;
		 this.db_Type = db_Type;
		 this.db_FreeSize = db_FreeSize;
		 this.db_UsedSize = db_UsedSize;
		 this.db_Size = db_Size;

	}
	
	public int getDb_Count() {
		return db_Count;
	}
	public void setDb_Count(int db_Count) {
		this.db_Count = db_Count;
	}
	public String getDb_Type() {
		return db_Type;
	}
	public void setDb_Type(String db_Type) {
		this.db_Type = db_Type;
	}
	public double getDb_FreeSize() {
		return db_FreeSize;
	}
	public void setDb_FreeSize(double db_FreeSize) {
		this.db_FreeSize = db_FreeSize;
	}
	public double getDb_UsedSize() {
		return db_UsedSize;
	}
	public void setDb_UsedSize(double db_UsedSize) {
		this.db_UsedSize = db_UsedSize;
	}
	public double getDb_Size() {
		return db_Size;
	}
	public void setDb_Size(double db_Size) {
		this.db_Size = db_Size;
	}
	
}

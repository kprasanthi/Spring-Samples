package com.ded.myapp.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class DEDBean {
	
	List<HierarchyBean> hierarchyObjList;	
	
	 @Id
	 private String creationDate;
	 
	 
	 public DEDBean(String creationDate,List<HierarchyBean> hierarchyObjList) {
			
			this.creationDate = creationDate;
			this.hierarchyObjList = hierarchyObjList;
		}
	
	
	
	public String getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}


	
	
	
	public List<HierarchyBean> getHierarchyObjList() {
		return hierarchyObjList;
	}
	public void setHierarchyObjList(List<HierarchyBean> hierarchyObjList) {
		this.hierarchyObjList = hierarchyObjList;
	}
	
}

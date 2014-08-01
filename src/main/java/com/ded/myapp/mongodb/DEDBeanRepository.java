package com.ded.myapp.mongodb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.ded.myapp.bean.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link DEDBean}s
 *
 * 
 */
@Repository
public class DEDBeanRepository {

	 static final Logger logger = LoggerFactory.getLogger(DEDBeanRepository.class);

	    @Autowired
	    MongoTemplate mongoTemplate;
	    
	    /** 
	     * Get DED By Id
	     * @DEDBean
	     */
	    public DEDBean getDEDById(String _id){
	    	
	    	DEDBean dedbean = mongoTemplate.findById(_id,DEDBean.class);
	    	
	    	return dedbean;
	    }
		
		/**
		 *
		 * search DED By AttID
		 *  @DEDBean
		*/ 
		public DEDBean searchDEDByAttId(String attID){
		String qryStr = "{hierarchyObjList:{$elemMatch:{attID:'"+attID+"'}}}";
		  BasicQuery query = new BasicQuery(qryStr);

          DEDBean dedbean = mongoTemplate.findOne(query, DEDBean.class);
		  
		  return dedbean;
		  
		}
		
		
		/**
		 *
		 * search DED By Date
		 * @DEDBean 
		*/ 
		public DEDBean searchDEDByDate(){
		
		  BasicQuery query1 = new BasicQuery("{_id:'2014-07-18-06:21:54'}");

          DEDBean dedbean = mongoTemplate.findOne(query1, DEDBean.class);
		  
		  return dedbean;
		  
		}
	    
	    
	    /** 
	     * Insert data to DED Collection
	    */
	    public void insertDED() {
	    	
	    	List<HierarchyBean> hierarchyObjList = new ArrayList<HierarchyBean>();
	    	
	    	//pass a Hierarchy bean object as argument
	    	//To do - need to include dplrInfoObj and hierarchyColl fields also after modifying the Hierarchy bean constructor
			
			List<HardwareInventoryBean> totalInvBean = new ArrayList<HardwareInventoryBean>();
	
	        HardwareInventoryBean hardwareInvBean = new HardwareInventoryBean(10,"relational",2,38,40);
			
			totalInvBean.add(hardwareInvBean);
			
			
			List<HardwareInventoryBean> hardwareInvObjLst = new ArrayList<HardwareInventoryBean>();
			
			HardwareInventoryBean hardwareInvBean2 = new HardwareInventoryBean(10,"relational",2,38,40);
			
			hardwareInvObjLst.add(hardwareInvBean2);
	    	
	    	
			HierarchyBean hierbean = new HierarchyBean("123","marc","weber","marc.weber@gmail.com","123-456-7890","available",2,12,8,4,totalInvBean,hardwareInvObjLst);
	    	
	    	hierarchyObjList.add(hierbean);
	    	
	    	//Convert Date object to String and then pass to the DEDBean constructor
			Date creationDate = new Date();
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
			
			String strCreationDate = dateFormat.format(creationDate);
	    	
	    	DEDBean d1 = new DEDBean(strCreationDate,hierarchyObjList);
	    	
	    	mongoTemplate.insert(d1);
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    /**
	     * Create a {@link DEDBean} collection if the collection does not already exists
	     */
	    public void createDEDCollection() {
	        if (!mongoTemplate.collectionExists(DEDBean.class)) {
	            mongoTemplate.createCollection(DEDBean.class);
	        }
	    }

	    /**
	     * Drops the {@link DEDBean} collection if the collection does already exists
	     */
	    public void dropDEDCollection() {
	        if (mongoTemplate.collectionExists(DEDBean.class)) {
	            mongoTemplate.dropCollection(DEDBean.class);
	        }
	    }
	
	
	
}
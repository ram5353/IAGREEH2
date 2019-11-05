package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.GenAnwAnwender;
import com.example.demo.Entity.UserDetails;
import com.example.demo.dto.LiveSystems;

@Repository
public class IAgreeDaoImpl implements IAgreeDao{

	
	@PersistenceContext
    private EntityManager entityManager;
	@SuppressWarnings({  "unchecked" })
	@Override
	public List<GenAnwAnwender> getData(String racfid) { 
      System.out.println("in Daoimpl");	
      
      Query ctr =  entityManager.unwrap(Session.class).createQuery("select distinct anwName , anwVorname,anwEmployeeNr,anwEmail,anwId from GenAnwAnwender WHERE anwRacf =:racfId" )
    		  .setParameter("racfId",  "UOqwe1");
      List us = ctr.getResultList();
      Object[] ganw = (Object[]) us.get(0);
      Integer id = new Integer((int) ganw[4]);
      
      
      
      Query ctr1 =  entityManager.unwrap(Session.class).createQuery("select gssc.sysId,gss.sysName from GenScSystemConfig gssc inner join GenSysSystem gss on \n"+
      		 "gssc.sysId = gss.sysId  where gssc.anwId =:anwid").setParameter("anwid", id);
      List<LiveSystems> listOfLiveSystems = ctr1.getResultList();
      System.out.println(listOfLiveSystems);
      
      
     // Query ctr2  =   	entityManager.unwrap(Session.class).createQuery("SELECT GVV.vgUuid,GVV.vgStatus,GVV.vgVerfallsdatum,GVV.vgEingestelltAm,GVV.sysId,GVV.lastUpdatedClientId, gss.sysName,ghh.hisHistoryEvent  FROM GenVgVorgang GVV INNER JOIN  GenAnwAnwender GAA ON GAA.anwId = GVV.vgGenehmiger inner join GenSysSystem gss on GVV.sysId = gss.sysId inner join GenHisHistory ghh on ghh.hisProcessUuid = gvv.vgUuid and ghh.sysId=gvv.sysId WhERE anwRacf =:racfId AND vgEingestelltAm >= add_months(sysdate, -6) AND  vgVerfallsdatum >= SYSDATE")
    	//	.setParameter("racfId", "UOqwe2");
      SQLQuery sqlquery = entityManager.unwrap(Session.class).createSQLQuery("SELECT GVV.VG_UUID,GVV.VG_STATUS,GVV.VG_VERFALLSDATUM,GVV.VG_EINGESTELLT_AM,GVV.SYS_ID,GVV.LAST_UPDATED_CLIENT_ID,\n" + 
      		"gss.SYS_NAME,ghh.his_history_event  FROM GEN_VG_VORGANG GVV INNER JOIN  gen_anw_anwender GAA ON GAA.ANW_ID = GVV.VG_GENEHMIGER inner join \n" + 
      		"gen_sys_system gss on GVV.sys_id = gss.sys_id inner join GEN_HIS_HISTORY ghh on ghh.his_process_uuid = gvv.vg_uuid and ghh.sys_id=gvv.sys_id \n" + 
      		"WhERE ANW_RACF =:racfId AND VG_EINGESTELLT_AM >= add_months(sysdate, -6) AND  VG_VERFALLSDATUM >= SYSDATE ")
    		  .setParameter("racfId", "UOqwe1");
      
       List listOfProcesses = sqlquery.getResultList();
       System.out.println(listOfProcesses);
       
      return us;
	}
	
	
	@Override
	public List getUserData(String id) {
		
		Query ctr =  entityManager.unwrap(Session.class).createQuery("select distinct anwName , anwVorname,anwEmployeeNr,anwEmail,anwId from GenAnwAnwender WHERE anwRacf =:racfId" )
	    		  .setParameter("racfId",  id);
	      return ctr.getResultList();
		
	}


	@Override
	public List getAuthorisedSystems(int anwId) {
		
		 Query ctr1 = entityManager.unwrap(Session.class).createQuery("select gssc.sysId,gss.sysName from GenScSystemConfig gssc inner join GenSysSystem gss on \n"+
	      		 "gssc.sysId = gss.sysId  where gssc.anwId =:anwid").setParameter("anwid", anwId);
		 return ctr1.getResultList();
		}


	@Override
	public List getProcessDetails(String anwRacf) {
		// TODO Auto-generated method stub
		SQLQuery sqlquery = entityManager.unwrap(Session.class).createSQLQuery("SELECT GVV.VG_UUID,GVV.VG_STATUS,GVV.VG_VERFALLSDATUM,GVV.VG_EINGESTELLT_AM,GVV.SYS_ID,GVV.LAST_UPDATED_CLIENT_ID,\n" + 
	      		"gss.SYS_NAME,ghh.his_history_event  FROM GEN_VG_VORGANG GVV INNER JOIN  gen_anw_anwender GAA ON GAA.ANW_ID = GVV.VG_GENEHMIGER inner join \n" + 
	      		"gen_sys_system gss on GVV.sys_id = gss.sys_id inner join GEN_HIS_HISTORY ghh on ghh.his_process_uuid = gvv.vg_uuid and ghh.sys_id=gvv.sys_id \n" + 
	      		"WhERE ANW_RACF =:racfId AND VG_EINGESTELLT_AM >= add_months(sysdate, -6) AND  VG_VERFALLSDATUM >= SYSDATE ")
	    		  .setParameter("racfId", anwRacf);
	      
	      	      return sqlquery.getResultList();
	}
}

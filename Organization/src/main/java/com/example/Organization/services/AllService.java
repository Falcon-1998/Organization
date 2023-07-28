package com.example.Organization.services;
import com.example.Organization.dao.*;
import com.example.Organization.entities.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AllService {
	//private List<MpOrganization> lso ; 
	@Autowired
	private OrgDao  orgDao;
	@Autowired
	private UserDao userDao ;
	@Autowired
	private TrailerDao trailerDao ; 
	@Autowired
	private TractorDao tractorDao ; 
	public AllService()
	{
		//lso =  new ArrayList<MpOrganization>() ; 
		
	}
    public List<MpOrganization> getOrganization()
    {
       return orgDao.findAll() ; 	
    }
    public Optional<MpOrganization> getOneOrg(long id)
    {
       return orgDao.findById(id); 	
    }
    public MpOrganization addOrg(MpOrganization mo)
    {
    	orgDao.save(mo) ;
    	return mo ; 
    }
    public List<MpUser> getUsers()
    {
       return userDao.findAll() ; 	
    }
    public Optional<MpUser> getOneUser(long id)
    {
       return userDao.findById(id);
      
    }
    public MpUser addUser(MpUser mt)
    {
 	   userDao.save(mt);
 	   return mt ;
    }
    
    public List<MpTractor> getTractor()
    {
       return tractorDao.findAll() ; 	
    }
    public Optional<MpTractor> getOneTractor(long id)
    {
       return tractorDao.findById(id); 	
    }
    public MpTractor addTractor(MpTractor mt)
    {
 	   tractorDao.save(mt);
 	   return mt ;
    }
    
    public List<MpTrailer> getTrailer()
    {
       return trailerDao.findAll() ; 	
    }
    public Optional<MpTrailer> getOneTrailer(long id)
    {
       return trailerDao.findById(id); 	
    }
   public MpTrailer addTrailer(MpTrailer mt)
   {
	   trailerDao.save(mt);
	   return mt ;
   }
} 

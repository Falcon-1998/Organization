package com.example.Organization.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Organization.entities.*;

import com.example.Organization.services.AllService;

@RestController
public class MyController {
    @Autowired
	private AllService allService ; 
	@GetMapping("/home")
	public String home()
  {
	return "Welcome to the Organization Appication."   ; 
  }
	@GetMapping("/org")
  public List<MpOrganization> getOrganization()
  {
	  return allService.getOrganization(); 
  }
	@GetMapping("/org/{orgid}")
	  public Optional<MpOrganization> getOneOrg(@PathVariable("orgid") long id)
	  {
		  return allService.getOneOrg(id); 
	  }
	@PostMapping("/org")
	public MpOrganization createOrg(@RequestBody MpOrganization  mo)
	{   System.out.print(mo.toString()) ; 
		allService.addOrg(mo); 
		return mo ; 
	}
	@GetMapping("/user")
	public List<MpUser> getUsers()
	{
		return allService.getUsers();
	}
	@GetMapping("/user/{userid}")
	public Optional<MpUser> getUsersbyID(@PathVariable("userid") long id)
	{
		return allService.getOneUser(id);
	}
	@PostMapping("/user")
	public MpUser addUser(@RequestBody MpUser  mu)
	{   System.out.print(mu.toString()) ; 
		allService.addUser(mu); 
		return mu; 
	}
	@GetMapping("/trailer")
	public List<MpTrailer> getTrailer()
	{
		return allService.getTrailer() ; 
	}
	@PostMapping("/trailer")
	public MpTrailer addTrailer(@RequestBody MpTrailer trailer)
	{
		return allService.addTrailer(trailer) ; 
	}
	@GetMapping("/tractor")
	public List<MpTractor> getTractor()
	{
		return allService.getTractor();
	}
	@PostMapping("/tractor")
	public MpTractor addTractor(@RequestBody MpTractor tractor)
	{
		return allService.addTractor(tractor);
	}
}

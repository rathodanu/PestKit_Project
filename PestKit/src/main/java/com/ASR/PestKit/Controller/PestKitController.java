package com.ASR.PestKit.Controller;

import com.ASR.PestKit.Service.ContactService;
import com.ASR.PestKit.Service.ServiceSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ASR.PestKit.DAO.ServiceRepository;
import com.ASR.PestKit.Model.Contact;
import com.ASR.PestKit.Model.Service;

import com.ASR.PestKit.Model.UserSignup;
import com.ASR.PestKit.ServiceImpl.ServiceSerImpl;
import com.ASR.PestKit.ServiceImpl.SignUpServiceImpl;
import com.ASR.PestKit.ServiceImpl.contactServiceImpl;
import com.mysql.cj.xdevapi.SessionFactory;

@Controller
public class PestKitController {

	@Autowired
	ContactService contactService;

	@Autowired
	ServiceSer serviceSer;

	@Autowired
	SignUpServiceImpl signUpServiceImpl;
	
	@RequestMapping("ShowPage")
	public String indexPage()
	{
		return "index";
	}
	
	@RequestMapping("indexPagePermission")
	public String indexPagePermission(UserSignup signUp)
	{
		signUpServiceImpl.addSignUp(signUp);
		return "index";
		
		
	}
	
	@RequestMapping("aboutPage")
	public String aboutPage()
	{
		return "about";
	}
	
	@RequestMapping("blogPage")
	public String blogPage()
	{
		return "blog";
	}
	

	@RequestMapping("contactPage")
	public String contactPage()
	{
		return "contact";
	}
	
	
	@RequestMapping("contactPagePermission")
	public String contactPagePermission(Contact contact) throws Exception {
		contactService.addContact(contact);
		String mobile = contact.getMobile();
		if(mobile.length()!=10) {
			throw new Exception("mobile number should be of 10 digits");
		}
		return  "contact";
	
	}
	
	@RequestMapping("pricePage")
	public String pricePage()
	{
		return "price";
	}
	
	@RequestMapping("projectPage")
	public String projrctPage()
	{
		return "project";
	}
	


	@RequestMapping("servicePage")
	public String servicePage()
	{
		
		return "service";
	}
	
	@RequestMapping("servicePagePermission")
	public String servicePagePermission(Service service) throws Exception {

		serviceSer.addService(service);
		return "service";
	}
	

	@RequestMapping("teamPage")
	public String teamPage()
	{
		return "team";
	}
	
	@RequestMapping("testimonialPage")
	public String testimonialPage()
	{
		return "testimonial";
	}



	

}

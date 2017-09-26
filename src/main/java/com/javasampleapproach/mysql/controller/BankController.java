package com.javasampleapproach.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.mysql.model.Balance;
import com.javasampleapproach.mysql.model.Token;
import com.javasampleapproach.mysql.pojoclasses.BalanceData;
import com.javasampleapproach.mysql.pojoclasses.ValidUser;
import com.javasampleapproach.mysql.repo.BalanceRepository;
import com.javasampleapproach.mysql.repo.Tokenrepository;

@RestController
public class BankController {

	
	@Autowired
	private Tokenrepository reppo;
	
	@Autowired
	private BalanceRepository brep;

	@RequestMapping("/validateuser")
	public @ResponseBody ValidUser validateuser(@RequestParam("senderid") String senderid) {
	  String isallowed ="";
	  String accountnumber="";
       List<Token> L = reppo.findBytelegramid(senderid);
       System.out.println(L.size());
       for(Token s:L) {
    	   isallowed = s.getAllowed();
    	   accountnumber= s.getaccount_number();
    	   
    	   System.out.println(s.getAllowed());
       }
       
       if(isallowed.equals("yes")) {
           ValidUser v = new ValidUser(isallowed,accountnumber);
           return v;
       }
       
       else
       {
    	   ValidUser u = new ValidUser("You are not authorized");
    	   return u;
       }
       
       
		
	}
	
	@RequestMapping("/balance")
	public @ResponseBody BalanceData getbalance(@RequestParam("senderid") String senderid) {
		
		   BalanceData v = null;
		  String isallowed ="";
		  String accountnumber="";
		  String balance="";
		  String date="";
	       List<Token> L = reppo.findBytelegramid(senderid);
	       System.out.println(L.size());
	       for(Token s:L) {
	    	   isallowed = s.getAllowed();
	    	   accountnumber= s.getaccount_number();
	    	   
	    	   System.out.println(s.getAllowed());
	       }
	       
	       if(isallowed.equals("yes")) {
	    	   System.out.println(accountnumber);
		       List<Balance> bal = brep.findBytelegramid(accountnumber);
		       System.out.println(bal);
               for(Balance b:bal) {
            	   balance = b.getBalance();
            	   date = b.getDate();
            	   
            	   v = new BalanceData(balance,date);

               }
	       }
	       else {
	    	   v = new BalanceData("-1","-1");
	       }
	    	
	     
    	   return v;

	       
	       
			
		}
}

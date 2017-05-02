package com.obego.Controller;

import com.obego.Entity.Location;
import com.obego.Service.AccountService;
import com.obego.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */

@CrossOrigin(origins = "http://localhost:4200",methods = {RequestMethod.POST,RequestMethod.DELETE,RequestMethod.GET})
@RestController
@RequestMapping("/account")
public class AccountContorller {

    @Autowired
    private AccountService accountService;


    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public Collection<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }



    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") long id){
        return accountService.getAccountById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void removeAll(){
        System.out.println("Element deleted");
        accountService.removeAll();
    }


    @RequestMapping(value = "/{userName}",method = RequestMethod.DELETE)
    public void removeAccountById(@PathVariable("userName") String userName){
        accountService.removeAccountById(userName);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateAccount(@RequestBody Account account){

        accountService.updateAccount(account);
    }
    @RequestMapping(value = "/updateLocation",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateLocation(@RequestBody Location location){
        accountService.updateLocation(location);
    }


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertAccount(@RequestBody Account account){
        accountService.insertAccount(account);
    }
}

package com.obego.Service;

import com.obego.Dao.AccountDao;
import com.obego.Entity.Account;
import com.obego.Entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Service
public class AccountService {

    @Autowired
    @Qualifier("mongodb")
    private AccountDao accountDao;
    public Collection<Account> getAllAccounts(){
        return accountDao.getAllAccounts();
    }
    public Account getAccountById(long id){
        return accountDao.getAccountById(id);
    }
    public void removeAccountById(String id){
        accountDao.removeAccountById(id);
    }
    public void updateAccount(Account account){
        accountDao.updateAccount(account);
    }
    public void insertAccount(Account account){
        accountDao.insertAccount(account);
    }
    public void updateLocation(Location location){
        accountDao.updateLocation(location);
    }
    public void removeAll(){
        accountDao.removeAll();
    }
}

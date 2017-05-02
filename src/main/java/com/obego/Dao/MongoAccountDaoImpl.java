package com.obego.Dao;

import com.obego.Entity.Account;
import com.obego.Entity.AccountRepository;
import com.obego.Entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Repository
@Qualifier("mongodb")
public class MongoAccountDaoImpl implements AccountDao {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Collection<Account> getAllAccounts() {

        Calendar cal = Calendar.getInstance();
        cal.set(1993, 11,1);
        return accountRepository.findAll();
    }

    @Override
    public void removeAll(){
        accountRepository.deleteAll();
    }

    @Override
    public Account getAccountById(long id) {
        return null;
    }

    @Override
    public void removeAccountById(String userName) {
        accountRepository.removeByUserName(userName);
    }

    @Override
    public void updateAccount(Account account) {
        Account userAccount=accountRepository.findOneByUserName(account.getUserName());
        account.setId(userAccount.getId());
        accountRepository.save(account);
    }

    @Override
    public void updateLocation(Location location) {
        Account userAccount=accountRepository.findOneByUserName(location.getUserName());
        userAccount.setLongitude(location.getLongitude());
        userAccount.setLatitude(location.getLatitude());
        accountRepository.save(userAccount);
    }

    @Override
    public void insertAccount(Account account) {
        accountRepository.save(account);
    }
}

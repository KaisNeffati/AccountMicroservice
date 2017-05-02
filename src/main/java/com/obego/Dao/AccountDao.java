package com.obego.Dao;


import com.obego.Entity.Account;
import com.obego.Entity.Location;

import java.util.Collection;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
public interface AccountDao {
    Collection<Account> getAllAccounts();

    Account getAccountById(long id);

    void removeAccountById(String userName);

    void updateAccount(Account account);

    void insertAccount(Account account);

    void updateLocation(Location location);

    void removeAll();
}

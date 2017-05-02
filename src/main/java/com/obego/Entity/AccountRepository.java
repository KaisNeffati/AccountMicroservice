package com.obego.Entity;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Kais NEFFATI on 1/29/2017.
 */
public interface AccountRepository extends MongoRepository<Account, String> {
    List<Account> removeByUserName(String userName);
    Account findOneByUserName(String userName);
}

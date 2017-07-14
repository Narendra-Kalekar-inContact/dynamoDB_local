package com.incontact.narendra.dynamoDB_Demo1.dao;

import com.incontact.narendra.dynamoDB_Demo1.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Narendra Kalekar on 7/11/2017.
 */
@EnableScan
@Repository
public interface UserRepository extends CrudRepository<User,String> {
}

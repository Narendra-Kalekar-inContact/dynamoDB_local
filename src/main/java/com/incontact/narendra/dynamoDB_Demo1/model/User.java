package com.incontact.narendra.dynamoDB_Demo1.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@DynamoDBTable(tableName = "NK_USER_1")
@Component
public class User {

	@DynamoDBHashKey
	private String userName;

	@DynamoDBAttribute
	private String firstName;

	@DynamoDBAttribute
	private String lastName;

	@DynamoDBAttribute
	private String email;

	@DynamoDBAttribute
	private String mobile;

	@DynamoDBAttribute
	private String password;
}

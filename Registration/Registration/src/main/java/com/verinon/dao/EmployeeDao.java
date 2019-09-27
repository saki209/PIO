package com.verinon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verinon.entity.Employee;

@Repository


// For one DAO interface we can pass only one Entity class and we can perform the transaction to that entity table only.

// Employee is the entity class and Interger is the primary key column data type.

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	// Click on Ctrl + space , you can see the predefined methods which are available in JpaRepository interface.
	// We can perform basic operation on db using JpaRepository without writing the code in Dao interface
	
	//If we want to perform some more operations on db which are not available in JpaRepository we will create the 
	//method we will @Query annotation at the method level and write the query in the annotation. I will do Monday one
	//example for @Query annotation, Named Parameters and Relation ships

}




 /*public interface EmployeeDao extends JpaRepository<T, ID> {
 
	 T - Entity class [ Employee ]
     ID -Integer   [ primary key column datatype of Employee]
	 
 }*/
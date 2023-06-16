package org.tnsif.respository;
//Program to demonstrate CRUD Operation 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.entities.Student;

public interface StudentRepo {

	Statement makeStatement();
	PreparedStatement createPrepareStatement(String query);
	
	public int addQuery(String query, Student student);
	public int updateQuery(String query, Student student);
	public int deleteQuery(String query);
	public ResultSet retrieveQuery(String query);
	
}

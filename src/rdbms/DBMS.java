package rdbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBMS {

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	
	private String url = "jdbc:mysql://localhost/wnd_ariya_db";
	private String username = "root";
	private String password = "root";
	
	private static DBMS dbms = null;
	
	public static DBMS getDBMSObject() throws ClassNotFoundException {
		if (dbms == null) {
			dbms = new DBMS();
		}
		
		return dbms;
	}
	
	private DBMS() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	public int retrieveLatestId() {
		
		int id = -1;
		String sql = "SELECT * FROM wnd_ariya_db.ig_gen;";
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				id = resultSet.getInt("next_id");
			}
			
		} catch (SQLException e) {
			System.err.println("Unable to create record");
		}
		finally {
			statement = null;
			connection = null;
		}
		
		return id;
	}
	
	public void createStudentEntry(Student student) {
		
		String sql = "INSERT INTO `wnd_ariya_db`.`student` (`id`, `name`, `roll`, `standard`) VALUES (" + student.getId() + ", '" + student.getName() + "', " + student.getRoll() + ", " + student.getStandard() + ");";
		String sql2 = "UPDATE `wnd_ariya_db`.`ig_gen` SET `next_id` = " + IDGen.getCurrentId() + ";";
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			statement.executeUpdate(sql2);
		} catch (SQLException e) {
			System.err.println("Unable to create record");
		}
		finally {
			statement = null;
			connection = null;
		}
	}
	
	public void createTeacherEntry(Teacher teacher) {
		
		String sql = "INSERT INTO `wnd_ariya_db`.`teacher` (`id`, `name`, `subject`) VALUES (" + teacher.getId() + ", '" + teacher.getName() + "', '" + teacher.getSubject() + "');";
		String sql2 = "UPDATE `wnd_ariya_db`.`ig_gen` SET `next_id` = " + IDGen.getCurrentId() + ";";
	
		List<String> sql_statements = new ArrayList<String>();
		for (Student student : teacher.getStudents()) {
			sql_statements.add("INSERT INTO `wnd_ariya_db`.`teacher_student` (`t_id`, `s_id`) VALUES (" + teacher.getId() + ", " + student.getId() + ");");
		}
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			statement.executeUpdate(sql2);
			for (String sql_statement : sql_statements) {
				statement.executeUpdate(sql_statement);
			}
		} catch (SQLException e) {
			System.err.println("Unable to create record");
		}
		finally {
			statement = null;
			connection = null;
		}
	}

	public Student getStudentEntry(int id) {
		String sql = "SELECT * FROM wnd_ariya_db.student WHERE id = " + id + ";";
		Student student = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				student = new Student(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getInt("roll"),
						resultSet.getInt("standard")
						);
			}
			
		} catch (SQLException e) {
			System.err.println("Unable to create record");
		}
		finally {
			statement = null;
			connection = null;
		}
		
		return student;
	}

}

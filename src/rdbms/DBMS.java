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
	
	private final String url = "jdbc:mysql://localhost/wnd_ariya_db";
	private final String username = "root";
	private final String password = "root";
	
	
	// SINGLETON CLASS bcz we have implemented SINGLETON DESIGN PATTERN
	
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
	
	
	// ---------- DB CRUD START HERE ----------- //
	
	
	// ----------------- Create -----------------//
	
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
	

	// ---------------- Retrieve ----------------//
		
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
			System.err.println("Unable to fetch record");
		}
		finally {
			statement = null;
			connection = null;
		}
		
		return id;
	}
	
	public Student retrieveStudentEntry(int id) {
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
			System.err.println("Unable to fetch record");
		}
		finally {
			statement = null;
			connection = null;
		}
		
		return student;
	}

	public List<Student> retrieveAllStudentEntries() {
		String sql = "SELECT * FROM wnd_ariya_db.student;";
		List<Student> students = new ArrayList<Student>();
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				students.add( new Student( resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("roll"), resultSet.getInt("standard") ));
			}
			
		} catch (SQLException e) {
			System.err.println("Unable to fetch record");
		}
		finally {
			statement = null;
			connection = null;
		}
		
		return students;
	}
	
	
	// ----------------- Update -----------------//
	
	public void updateStudentEntry(Student student) {
		
		String sql = "UPDATE `wnd_ariya_db`.`student` SET `name` = '" + student.getName() + "', `roll` = " + student.getRoll() + ", `standard` = " + student.getStandard() + " WHERE `id` = " + student.getId() + ";";
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("Unable to update record");
		}
		finally {
			statement = null;
			connection = null;
		}
	}
	
	// ----------------- Delete -----------------//
	
	public void deleteStudentEntry(int id) {
		// backticks
		String sql = "DELETE FROM wnd_ariya_db.student WHERE (id = '" + id + "');";
		try {
			connection = DriverManager.getConnection(url, username, password);
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("Unable to update record");
		}
		finally {
			statement = null;
			connection = null;
		}
	}
}

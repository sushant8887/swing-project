package com.operations;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connector.GetConnection;
import com.mysql.jdbc.ResultSet;

public class Implemations implements EmpOperations {

	@Override
	public void addEmp(Emp emp) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("insert into student values(?,?,?)");

			preparedStatement.setInt(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setDouble(3, emp.getSalary());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmp(Emp emp) {

		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("delete from student where id=?");

			preparedStatement.setInt(1, emp.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateEmp(Emp emp) {

		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection()
					.prepareStatement("update student set salary = ? where id = ?");

			preparedStatement.setDouble(1, emp.getSalary());
			preparedStatement.setInt(2, emp.getId());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String[] searchEmp(Emp emp) {
		PreparedStatement preparedStatement = null;
		String[] data = new String[3];

		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("select * from student where id =?");
			preparedStatement.setInt(1, emp.getId());
			java.sql.ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				data[0] = resultSet.getString(1);
				data[1] = resultSet.getString(2);
				data[2] = resultSet.getString(3);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

	@Override
	public List<String[]> showEmp() {

		List<String[]> data = new ArrayList<>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("select * from student");

			java.sql.ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String[] row = new String[3];
				row[0] = resultSet.getString(1);
				row[1] = resultSet.getString(2);
				row[2] = resultSet.getString(3);

				data.add(row);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}

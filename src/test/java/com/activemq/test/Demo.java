package com.activemq.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.activemq.utils.DBHelper;

public class Demo {

	static String sql = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;

	public static void main(String[] args) {

		try {
			Connection conn = DBHelper.getConnection();

			String sql = "INSERT INTO demo(`name`,add_time) VALUES(?,?)";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, "acc");
			ptmt.setString(2, sdf.format(new Date()));
			ptmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
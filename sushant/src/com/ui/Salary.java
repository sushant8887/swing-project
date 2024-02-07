package com.ui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Salary extends JFrame {
	JTable tb;
	JScrollPane sp;

	public Salary() {
		String[][] data = { { "101", "Megha", "23000" }, { "102", "Sudha", "43000" }, { "103", "Jatin", "65000" },
				{ "104", "Arjun", "85000" } };
		String[] heading = { "Id", "Name", "Salary" };
		tb = new JTable(data, heading);
		sp = new JScrollPane(tb);
		add(sp);

		setSize(500, 500);
		setVisible(true);
		setTitle("Show Student Salary");
	}
}

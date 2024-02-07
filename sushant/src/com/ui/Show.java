package com.ui;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.operations.Implemations;

public class Show extends JFrame {
	JTable t1;
	JScrollPane sp;

	public Show() {
		setLayout(new FlowLayout());

		Implemations implemations = new Implemations();
		List<String[]> e_data = implemations.showEmp();

		String[][] data = new String[e_data.size()][];

		for (int i = 0; i < data.length; i++) {
			data[i] = e_data.get(i);

		}

		String[] heading = { "Id", "Name", "Salary"};

		t1 = new JTable(data, heading);

		sp = new JScrollPane(t1);
		add(sp);

		setTitle("Show Students");
		setSize(500, 500);
		setVisible(true);

	}
}

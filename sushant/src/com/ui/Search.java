package com.ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operations.Emp;
import com.operations.Implemations;

public class Search extends JFrame {
	JLabel l1, l2;
	JTextField t1;
	JButton b1;

	public Search() {
		l1 = new JLabel("Enter id");
		l2 = new JLabel();
		t1 = new JTextField(10);
		b1 = new JButton("Search");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(t1.getText()));
				Implemations implemations = new Implemations();
				String[] e_data = implemations.searchEmp(emp);
				String new_str = "";
				for (String string : e_data) {
					new_str = new_str + " " + string;
				}
				l2.setText(new_str);

			}
		});

		add(l1);
		add(t1);
		add(b1);
		add(l2);

		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		setTitle("Search Employee");

	}
}

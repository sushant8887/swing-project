package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operations.Emp;
import com.operations.Implemations;

public class Add extends JFrame {
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;

	public Add() {
		l1 = new JLabel("Id");
		l2 = new JLabel("Name");
		l3 = new JLabel("Salary");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		b1 = new JButton("Save");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Data Saved Successfully");
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(t1.getText()));
				emp.setName(t2.getText());
				emp.setSalary(Double.parseDouble(t3.getText()));

				Implemations implemations = new Implemations();
				implemations.addEmp(emp);
				dispose();
			}
		});

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);

		l1.setBounds(90, 50, 60, 30);
		t1.setBounds(160, 50, 150, 30);
		l2.setBounds(90, 100, 60, 30);
		t2.setBounds(160, 100, 150, 30);
		l3.setBounds(90, 150, 60, 30);
		t3.setBounds(160, 150, 150, 30);
		b1.setBounds(150, 200, 100, 30);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setTitle("Add Student");
	}
}

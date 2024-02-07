package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.operations.Emp;
import com.operations.Implemations;

public class Delete extends JFrame {
	JLabel l1;
	JTextField t1;
	JButton b1;

	public Delete() {
		l1 = new JLabel("Id");
		t1 = new JTextField(10);
		b1 = new JButton("Delete");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Data Deleted Successfully");
				Emp emp = new Emp();
				emp.setId(Integer.parseInt(t1.getText()));

				Implemations implemations = new Implemations();
				implemations.deleteEmp(emp);

				dispose();
			}
		});

		add(l1);
		add(t1);
		add(b1);

		l1.setBounds(130, 50, 60, 30);
		t1.setBounds(170, 50, 90, 30);
		b1.setBounds(150, 100, 100, 30);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setTitle("Delete Student");
	}
}

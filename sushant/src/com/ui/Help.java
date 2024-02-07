package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Help extends JFrame {

	JButton b1, b2, b3, b4, b5, b6;

	public Help() {
		b1 = new JButton("Add Student");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Add();
				dispose();
			}
		});
		b2 = new JButton("Update Student");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
				dispose();
			}
		});
		b3 = new JButton("Delete Student");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
				dispose();
			}
		});
		b4 = new JButton("Show Student");
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Show();
				dispose();
			}
		});
		b5 = new JButton("Search Student");
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
				dispose();
			}
		});
		b6 = new JButton("Show Student Salary");
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Salary();
				dispose();
			}
		});

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b4);
		add(b5);
		add(b6);

		b1.setBounds(120, 50, 200, 30);
		b2.setBounds(120, 100, 200, 30);
		b3.setBounds(120, 150, 200, 30);
		b4.setBounds(120, 200, 200, 30);
		b5.setBounds(120, 250, 200, 30);
		b6.setBounds(120, 300, 200, 30);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setTitle("Help");
	}
}

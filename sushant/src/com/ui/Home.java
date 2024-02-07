package com.ui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home extends JFrame {
	JMenuBar bar;
	JMenu m1, m2, m3, m4;
	JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9;

	public Home() {
		bar = new JMenuBar();
		m1 = new JMenu("Student");
		m2 = new JMenu("Student Details");
		m3 = new JMenu("Accounts");
		m4 = new JMenu("Utilities");
		item1 = new JMenuItem("Add");
		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Add();
			}
		});
		item2 = new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Update();
			}
		});
		item3 = new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
			}
		});
		item4 = new JMenuItem("Show Students");
		item4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Show();
			
			}
		});
		item5 = new JMenuItem("Search Student");
		item5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
			}
		});
		item6 = new JMenuItem("Show student Salary");
		item6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Salary();
			}
		});
		item7 = new JMenuItem("Help");
		item7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Help();
			}
		});
		item8 = new JMenuItem("Thought of the day");
		item8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thought();
			}
		});
		item9 = new JMenuItem("Exit");
		item9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		add(bar);
		bar.add(m1);
		bar.add(m2);
		bar.add(m3);
		bar.add(m4);
		m1.add(item1);
		m1.add(item2);
		m1.add(item3);
		m2.add(item4);
		m2.add(item5);
		m3.add(item6);
		m4.add(item7);
		m4.add(item8);
		m4.add(item9);

		bar.setBounds(70, 10, 300, 30);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Home();
	}
}

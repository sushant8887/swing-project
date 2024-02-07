package com.ui;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Thought extends JFrame {
	JLabel l1, l2;

	public Thought() {
		l1 = new JLabel("While You're Alive, You Need A Reason For Your Existence. Being Unable To Find One Is The Same As Being Dead.");
		l2 = new JLabel("-Naruto");
		add(l1);
		add(l2);

		l1.setBounds(20, 50, 500, 50);
		l2.setBounds(250, 100, 100, 30);
		setLayout(null);
		setSize(500, 800);
		setVisible(true);
		setTitle("Thought of the day");
	}
}

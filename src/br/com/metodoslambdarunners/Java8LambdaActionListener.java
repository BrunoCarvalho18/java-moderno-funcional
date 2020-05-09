package br.com.metodoslambdarunners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Java8LambdaActionListener {

	public static void main(String[] args) {

		// JAVA 8: FUN��ES LAMBDA

		JButton jButton = new JButton();
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			   System.out.println("Ol� mundo sem Java 8!");
             }});
		
		JButton jButton2 = new JButton();
		jButton2.addActionListener(e-> System.out.println("Ol� mundo com Java 8!"));
		
		
	}

}

package com.dg.client;

import javax.swing.JFrame;

import com.dg.client.components.frames.ApplicationShell;

public class Main {
	
	private static ApplicationShell mainShell;
	
	private static void initializeApplicationShell() {
		mainShell = new ApplicationShell();		
		
		configureApplicationShell();
	}
	
	private static void configureApplicationShell() {
		mainShell.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeApplicationShell();
	}

}

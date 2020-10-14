package com.dg.client;

import javax.swing.JFrame;

//Custom Packages
import com.dg.client.components.frames.ApplicationShell;
import com.dg.utilities.constants.AppInformation;

public class Main {
	
	private static ApplicationShell mainShell;
	
	private static void initializeApplicationShell() {
		mainShell = new ApplicationShell();		
		
		configureApplicationShell();
	}
	
	private static void configureApplicationShell() {
		mainShell.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Set the closing operation that happens when this frame is closed
		mainShell.setSize(500, 500);
		mainShell.setTitle(AppInformation.appname);
		mainShell.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeApplicationShell();
	}

}

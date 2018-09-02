package com.vorjdux.autoclicker;

import java.awt.EventQueue;


public class App {

	public static String getGreeting() {
		return new String("Hey");
	}

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
			
            public void run() {

				try {
					
                    AutoClicker frame = new AutoClicker();
					frame.setVisible(true);
					frame.setLocationRelativeTo( null );

				} catch (Exception e) {
					
                    e.printStackTrace();

				}

			}

		});

    }
}

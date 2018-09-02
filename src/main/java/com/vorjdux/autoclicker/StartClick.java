package com.vorjdux.autoclicker;

import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.JOptionPane;


public class StartClick implements Runnable {
	
	private int nClick = 0;
	private int interval = 0;
	private int button = 1;
	private Robot robot;
	private AutoClicker autoClicker;
	
	public StartClick(AutoClicker autoClicker, int nClick, int interval, int button) {
		
        try {
			
            robot = new Robot();
			
			this.nClick = nClick;
			this.interval = interval;
			this.button = button;
			this.autoClicker = autoClicker;

		} catch(Exception e) {
			
            e.printStackTrace();

		}
	}

	@Override
	public void run() {

		try {
			
            autoClicker.setProgressState( false );
			
            Thread.sleep(3000);

			for (int i=0; i < nClick; i++) {
				robot.mousePress( this.button == 1 ? InputEvent.BUTTON1_MASK : InputEvent.BUTTON3_MASK );
				robot.mouseRelease( this.button == 1 ? InputEvent.BUTTON1_MASK : InputEvent.BUTTON3_MASK );
				Thread.sleep( interval );
			}
			
			autoClicker.setProgressState(true);
			JOptionPane.showMessageDialog(null, "Done.");

		} catch (InterruptedException e) {
			
            e.printStackTrace();

		}

	}
    
}
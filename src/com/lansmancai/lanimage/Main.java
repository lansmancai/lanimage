package com.lansmancai.lanimage;

import javax.swing.JFrame;


public class Main {
	public static void main(String[] args) {
		ImageFrame f = new ImageFrame();
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
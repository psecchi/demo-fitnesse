package com.psecchi.demofitnesse.main;

import fitnesseMain.FitNesseMain;

public class LaunchFitnesse {

	public static void main(String[] args) throws Exception {
		String port = "8082";
        if (args.length != 0) {
            port = args[0];
        }
        FitNesseMain.main(new String[] {"-p", port, "-e", "0"});
	}
}

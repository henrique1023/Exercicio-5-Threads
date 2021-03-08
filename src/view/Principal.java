package view;

import controller.ThreadCinco;

public class Principal {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		for(int op = 0; op <=4; op++ ) {
			ThreadCinco tCinco = new ThreadCinco(a, b, op);
			tCinco.start();
		}
	}

}

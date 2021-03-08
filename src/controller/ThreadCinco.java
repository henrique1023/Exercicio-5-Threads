package controller;

public class ThreadCinco extends Thread {
private int a,b,op;
	
	
	public ThreadCinco(int a, int b, int op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}
	@Override
	public void run() {
		calc();
	}
	private void calc() {//esse modulo não pode ser chamado por outra classe
		int tempo = 1000;
		try {
			sleep(op*tempo); // faz os threads darem uma pausa programada
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int res = 0;
		switch (op) {
		case 0:
			res = 1;
			break;
		case 1:
			res = 2;
			break;
		case 2:
			res = 3;
			break;
		case 3:
			res = 4;
			break;
		case 4:
			res = 5;
			break;
		}
		System.out.println("TID #" + getId() + " Thread " + res);
	}
}

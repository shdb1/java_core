/**
 * 
 */
package com.shadab.java.core.threads.communication;

/**
 * @author mshadab
 *
 *
 *         Lets say there is abridge with two ends called , EastEnd and WestEnd
 *         . People are standing both side of the bridge always. we need to
 *         propose a solution thru which each side people get equal chances to
 *         cross the bridge.
 */
public class BridgeCrossingProblem {

	public static void main(String[] args) {

		ControlTravellers controlTravellers = new ControlTravellers();

		EastEnd eastEnd = new EastEnd(controlTravellers);
		Thread eastThread = new Thread(eastEnd);
		eastThread.setName("EastTravelService");
		WestEnd westEnd = new WestEnd(controlTravellers);
		Thread westThread = new Thread(westEnd);
		westThread.setName("WestTravelService");
		westThread.start();
		eastThread.start();

	}

}

class EastEnd extends Thread {
	ControlTravellers controlTravellers;

	public EastEnd(ControlTravellers controlTravellers) {
		// TODO Auto-generated constructor stub
		super();
		this.controlTravellers = controlTravellers;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			synchronized (controlTravellers) {

				while (controlTravellers.turnForEastTraveller) {
					System.out.println("From East End Traveller Started !!!");

					try {
						for (int steps = 0; steps <= 9; steps++) {
							System.out.print("__  ");
							Thread.sleep(1000);
						}

					} catch (InterruptedException exception) {
						// TODO Auto-generated catch block
						exception.printStackTrace();
					}

					System.out.println();
					System.out.println();
					System.out.println("East End Traveller Has Crossed Bridge");
					System.out.println();

					controlTravellers.turnForEastTraveller = false;

					controlTravellers.notifyAll();

				}
				try {

					controlTravellers.wait();

				} catch (InterruptedException exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}

			}
		}

	}

}

class WestEnd extends Thread {
	ControlTravellers controlTravellers;

	public WestEnd(ControlTravellers controlTravellers) {
		// TODO Auto-generated constructor stub
		super();
		this.controlTravellers = controlTravellers;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			synchronized (controlTravellers) {

				while (!controlTravellers.turnForEastTraveller) {
 					System.out.println("From West End Traveller Started !!!");
					try {
						for (int steps = 0; steps <= 9; steps++) {
							System.out.print("__  ");
							Thread.sleep(1000);
						}

					} catch (InterruptedException exception) {
						// TODO Auto-generated catch block
						exception.printStackTrace();
					}
					System.out.println("");
					System.out.println("");
					System.out.println("West End Traveller Has Crossed Bridge");
					System.out.println();
					controlTravellers.turnForEastTraveller = true;

					controlTravellers.notifyAll();

				}
				try {

					controlTravellers.wait();
				} catch (InterruptedException exception) {
					// TODO Auto-generated catch block
					exception.printStackTrace();
				}

			}
		}

	}

}
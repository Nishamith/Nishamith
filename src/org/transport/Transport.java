package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
 private void transportForm() {
System.out.println("Transport Form: 3Types");
	}
public static void main(String[] args) {
		Transport t=new Transport();
		t.transportForm();
		 
		Road r=new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.lorry();
		
		Air a=new Air();
		a.aeroplane();
		a.helicopter();
		
	    Water w=new Water();
	    w.boat();
	    w.ship();
	}
	}


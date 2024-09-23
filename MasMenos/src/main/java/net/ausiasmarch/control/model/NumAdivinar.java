package net.ausiasmarch.control.model;

import java.util.Random;

public class NumAdivinar {
	Random numeroRandom = new Random();
	int numAdivinar = numeroRandom.nextInt(100) + 1;	

	public NumAdivinar() {
		this.numAdivinar = numeroRandom.nextInt(100) + 1;	
	}
	public int getNumAdivinar() {
		return numAdivinar;
	}
}

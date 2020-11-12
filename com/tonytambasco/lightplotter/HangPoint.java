package com.tonytambasco.lightplotter;

public class HangPoint {
	
	private int hpNumber;	// a number for each hang point in the plot
	private String name;	// the name of the HP
	private String notes;	// Misc notes about the HP
	private int pos_x;		// The X position of the HP
	private int pos_y;		// The Y position of the HP
	private int pos_z;		// The Z position of the HP
	private int height;		// The height in inches of the HP 
  
  public HangPoint(int hpNumber) {
    /* The only thing we need to define when creating a new HP is its number. This should
       be a UNIQUE integer that is tracked, incremented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    this.hpNumber = hpNumber;
  }
  
  /* Methods for setting and getting values go here */

}

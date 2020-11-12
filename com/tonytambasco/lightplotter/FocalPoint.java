package com.tonytambasco.lightplotter;

public class FocalPoint {

	private int fpNumber;  // a number for each focal point in the plot
	private String name;   // the name of the Focal Point
	private String notes;  // Misc notes about the FP
	private int pos_x;     // The X position of the FP
	private int pos_y;     // The Y position of the FP
	private int pos_z;     // The Z position of the FP
	private int height;    // The height in inches of the focal point. 
  
  public FocalPoint(int fpNumber) {
    /* The only thing we need to define when creating a new focal point is its number. This should
       be a UNIQUE integer that is tracked, incremented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    this.fpNumber = fpNumber;
  }
  
  /* Methods for setting and getting values go here */

}

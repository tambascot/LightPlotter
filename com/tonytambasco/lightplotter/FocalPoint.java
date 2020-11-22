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

public int getFpNumber() {
	return fpNumber;
}

public void setFpNumber(int fpNumber) {
	this.fpNumber = fpNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
}

public int getPos_x() {
	return pos_x;
}

public void setPos_x(int pos_x) {
	this.pos_x = pos_x;
}

public int getPos_y() {
	return pos_y;
}

public void setPos_y(int pos_y) {
	this.pos_y = pos_y;
}

public int getPos_z() {
	return pos_z;
}

public void setPos_z(int pos_z) {
	this.pos_z = pos_z;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}
  
  
  
  /* Methods for setting and getting values go here */

}

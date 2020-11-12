package com.tonytambasco.lightplotter;

public class FocalPoint {

  int pointNumber;  // a number for each focal point in the plot
  String name;      // the name of the Focal Point
  String notes;     // Misc notes about the FP
  int pos_x;        // The X position of the FP
  int pos_y;        // The Y position of the FP
  int pos_z;        // The Z position of the FP
  int height;       // The height in inches of the focal point. 
  
  private FocalPoint(int number) {
    /* The only thing we need to define when creating a new focal point is its number. This should
       be a UNIQUE integer that is tracked, incrimented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    pointNumber = number;
  }
  
  /* Methods for setting and getting values go here */

}

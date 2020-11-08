package com.tonytambasco.lightplotter

private class HangPoint {

  int pointNumber;  // a number for each hang point in the plot
  String name;      // the name of the HP
  String notes;     // Misc notes about the HP
  int pos_x;        // The X position of the HP
  int pos_y;        // The Y position of the HP
  int pos_z;        // The Z position of the HP
  int height;       // The height in inches of the HP 
  
  private HangPoint(int number) {
    /* The only thing we need to define when creating a new HP is its number. This should
       be a UNIQUE integer that is tracked, incrimented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    pointNumber = number;
  }
  
  /* Methods for setting and getting values go here */

}

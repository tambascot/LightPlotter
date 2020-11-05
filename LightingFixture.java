package com.tonytambasco.lightplotter

private class LightingFixture {

  int fixtureNumber;  // a number for each lighting fixture in the plot.
  String make;        // The manufacturer of the fixture
  String model;       // The manufacturer's name for the fixture
  int beamAngle;      // The angle of the beam, the narrower, brighter cone of light
  int fieldAngle;     // The angle of the field, the wider cone of light that is the standard meaure 
  int watts;          // The power draw of the lighting fixture
  int volts;          // The voltage of the lighting fixture
  float weight;       // The weight of the lighting fixture
  String color;       // The gel color(s) of a lighting fixture, if any
  String colorFrame;  // The size of the color frame of the fixture
  String pattern;     // The pattern(s) used in the fixture, if any
  String patternSize; // The pattern size of fixture, or the pattern to be used in the fixture
  String accessory;   // Any accessory used with the fixture (top hats, donuts, &c). 
  String symbol;      // The symbol used to represent the fixture in drawings.
  FocalPoint focus;   // The focal point the fixture targets.
  MountPoint point;   // The place the lighting fixture is attached to (i.e. 1E, Box Boom L)
  String notes;       // Misc notes about the fixture.
  int pos_x;          // The X position of the fixture.
  int pos_y;          // The Y position of the fixture.
  int pos_z;          // The Z position of the fixture.
  
  private LightingFixture(int number) {
    /* The only thing we need to define when creating a new lighting fixture is its number. This should
       be a UNIQUE integer that is tracked, incrimented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    fixtureNumber = number;
  }
  
  /* Methods for setting and getting values go here */

}

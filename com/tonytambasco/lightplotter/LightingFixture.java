package com.tonytambasco.lightplotter;

class LightingFixture {

  int fixtureNumber  = 0;    // a number for each lighting fixture in the plot.
  String make 		 = null; // The manufacturer of the fixture
  String model 		 = null; // The manufacturer's name for the fixture
  int beamAngle 	 = 0;    // The angle of the beam, the narrower, brighter cone of light
  int fieldAngle 	 = 0;    // The angle of the field, the wider cone of light that is the standard meaure 
  int watts 		 = 0;    // The power draw of the lighting fixture
  int volts 		 = 0;    // The voltage of the lighting fixture
  float weight 		 = 0;    // The weight of the lighting fixture
  String color 		 = null; // The gel color(s) of a lighting fixture, if any
  String colorFrame  = null; // The size of the color frame of the fixture
  String pattern 	 = null; // The pattern(s) used in the fixture, if any
  String patternSize = null; // The pattern size of fixture, or the pattern to be used in the fixture
  String accessory 	 = null; // Any accessory used with the fixture (top hats, donuts, &c). 
  String symbol 	 = null; // The symbol used to represent the fixture in drawings.
  FocalPoint fp 	 = null; // The focal point the fixture targets.
  HangPoint hp	 	 = null; // The place the lighting fixture is attached to (i.e. 1E, Box Boom L)
  String notes 	 	 = null; // Misc notes about the fixture.
  int pos_x 		 = 0;    // The X position of the fixture.
  int pos_y 		 = 0;    // The Y position of the fixture.
  int pos_z 		 = 0;    // The Z position of the fixture.
  
  public LightingFixture(int number) {
    /* The only thing we need to define when creating a new lighting fixture is its number. This should
       be a UNIQUE integer that is tracked, incrimented, and checked by the calling method. But, in
       practice, if the calling method wants to track a fixture in some other way, it can */
    fixtureNumber = number;
  }
  
  public int getFixtureNumber() {
	  return fixtureNumber;
  }
  
  public String getMake() {
	  return make;
  }
  
  public String getModel() {
	  return model;
  }
  
  public int getBeamAngle() {
	  return beamAngle;
  }
  
  public int getFieldAngle() {
	  return fieldAngle;
  }
  
  public int getWatts() {
	  return watts;
  }
  
  public int getVolts() {
	  return volts;
  }
  
  public float getWeight() {
	  return weight;
  }
  
  public String getColor() {
	  return color;
  }
  
  public String getColorFrame() {
	  return colorFrame;
  }
  
  public String getPattern() {
	  return pattern;
  }
  
  public String getPatternSize() {
	  return patternSize;
  }
  
  public String getAccessory() {
	  return accessory;
  }
  
  public String getSymbol() {
	  return symbol;
  }
  
  public FocalPoint getFP() {
	  return fp;
  }
  
  public HangPoint getHP() {
	  return hp;
  }
  
  public String getNotes() {
	  return notes;
  }
  
  public int getPos_x() {
	  return pos_x;
  }
  
  public int getPos_y() {
	  return pos_y;
  }
  
  public int getPos_z() {
	  return pos_z;
  }
  
  
  /* Methods for setting and getting values go here */

}

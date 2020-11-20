package com.tonytambasco.lightplotter;

class LightingFixture {

  private int fixtureNumber  = 0;    // a number for the lighting fixture. Intended to be unique.
  private String name		 = null; // a name for the lighting fixture.  Intended to be unique.
  private String make 		 = null; // The manufacturer of the fixture
  private String model 		 = null; // The manufacturer's name for the fixture
  private int beamAngle 	 = 0;    // The angle of the beam, the narrower, brighter cone of light
  private int fieldAngle 	 = 0;    // The angle of the field, the wider cone of light that is the standard meaure 
  private int watts 		 = 0;    // The power draw of the lighting fixture
  private int volts 		 = 0;    // The voltage of the lighting fixture
  private float weight 		 = 0;    // The weight of the lighting fixture
  private String color 		 = null; // The gel color(s) of a lighting fixture, if any
  private String colorFrame  = null; // The size of the color frame of the fixture
  private String pattern 	 = null; // The pattern(s) used in the fixture, if any
  private String patternSize = null; // The pattern size of fixture, or the pattern to be used in the fixture
  private String accessory 	 = null; // Any accessory used with the fixture (top hats, donuts, &c). 
  private String symbol 	 = null; // The symbol used to represent the fixture in drawings.
  private FocalPoint fp 	 = null; // The focal point the fixture targets.
  private HangPoint hp	 	 = null; // The place the lighting fixture is attached to (i.e. 1E, Box Boom L)
  private String notes 	 	 = null; // Misc notes about the fixture.
  private int pos_x 		 = 0;    // The X position of the fixture.
  private int pos_y 		 = 0;    // The Y position of the fixture.
  private int pos_z 		 = 0;    // The Z position of the fixture.
  
  /**
   * Returns a lighting fixture object with no parameters.
   */
  public LightingFixture() {
	  
  }
  
  /**
   * Returns a lighting fixture object with parameters available from the catalog page of most lighting fixtures. This will
   * allow us to more easily create a fixture library.
   * @param make
   * @param model
   * @param beamAngle
   * @param fieldAngle
   * @param watts
   * @param volts
   * @param weight
   * @param colorFrame
   * @param symbol
   */
  public LightingFixture(String make, String model, int beamAngle, int fieldAngle, int watts, int volts,
		  float weight, String colorFrame, String symbol) {
	  this.make 		 = make;
	  this.model 		 = model;
	  this.beamAngle 	 = beamAngle;
	  this.fieldAngle 	 = fieldAngle;
	  this.watts 		 = watts;
	  this.volts 		 = volts;
	  this.weight 		 = weight;
	  this.colorFrame 	 = colorFrame;
	  this.symbol 		 = symbol;
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
  
  public void setFixtureNumber(int fixtureNumber) {
	  this.fixtureNumber = fixtureNumber;
  }
  
  public void setMake(String make) {
	  this.make = make;
  }
  
  public void setModel(String model) {
	  this.model = model;
  }
  
  public void setBeamAngle(int beamAngle) {
	  this.beamAngle = beamAngle;
  }
  
  public void setFieldAngle(int fieldAngle) {
	  this.fieldAngle = fieldAngle;
  }
  
  public void setWatts(int watts) {
	  this.watts = watts;
  }
  
  public void setVolts(int volts) {
	  this.volts = volts;
  }
  
  public void setWeight(float weight) {
	  this.weight = weight;
  }
  
  public void setColor(String color) {
	  this.color = color;
  }
  
  public void setColorFrame(String colorFrame) {
	  this.colorFrame = colorFrame;
  }
  
  public void setPattern(String pattern) {
	  this.pattern = pattern;
  }
  
  public void setPatternSize(String patternSize) {
	  this.patternSize = patternSize;
  }
  
  public void setAccessory(String accessory) {
	  this.accessory = accessory;
  }
  
  public void setSymbol(String symbol) {
	  this.symbol = symbol;
  }
  
  public void setFP(FocalPoint fp) {
	  this.fp = fp;
  }
  
  public void setHP(HangPoint hp) {
	  this.hp = hp;
  }
  
  public void setNotes(String notes) {
	  this.notes = notes;
  }
  
  public void setPos_x(int pos_x) {
	  this.pos_x = pos_x;
  }
  
  public void setPos_y(int pos_y) {
	  this.pos_y = pos_y;
  }
  
  public void setPos_z(int pos_z) {
	  this.pos_z = pos_z;
  }

}

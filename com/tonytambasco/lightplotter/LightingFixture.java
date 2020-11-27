package com.tonytambasco.lightplotter;

import java.awt.geom.Point2D;

class LightingFixture {

  private int fixtureNumber  = 0;    // a number for the lighting fixture. Intended to be unique.
  private String name		 = null; // a name for the lighting fixture.  Intended to be unique.
  private String make 		 = null; // The manufacturer of the fixture
  private String model 		 = null; // The manufacturer's name for the fixture
  private Double beamAngle 	 = null; // The angle of the beam, the narrower, brighter cone of light
  private Double fieldAngle  = null; // The angle of the field, the wider cone of light that is the standard meaure 
  private int watts 		 = 0;    // The power draw of the lighting fixture
  private int volts 		 = 0;    // The voltage of the lighting fixture
  private Double weight 	 = null; // The weight of the lighting fixture
  private String color 		 = null; // The gel color(s) of a lighting fixture, if any
  private String colorFrame  = null; // The size of the color frame of the fixture
  private String pattern 	 = null; // The pattern(s) used in the fixture, if any
  private String patternSize = null; // The pattern size of fixture, or the pattern to be used in the fixture
  private String accessory 	 = null; // Any accessory used with the fixture (top hats, donuts, &c). 
  private String symbol 	 = null; // The symbol used to represent the fixture in drawings.
  private FocalPoint fp 	 = null; // The focal point the fixture targets.
  private HangPoint hp	 	 = null; // The place the lighting fixture is attached to (i.e. 1E, Box Boom L)
  private String notes 	 	 = null; // Misc notes about the fixture.
  private Double pos_x 		 = null; // The X position of the fixture.
  private Double pos_y 		 = null; // The Y position of the fixture.
  private Double pos_z 		 = null; // The Z position of the fixture.
  
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
  public LightingFixture(String make, String model, Double beamAngle, Double fieldAngle, int watts, int volts,
		  Double weight, String colorFrame, String symbol) {
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
  
  public Double getBeamAngle() {
	  return beamAngle;
  }
  
  public Double getFieldAngle() {
	  return fieldAngle;
  }
  
  public int getWatts() {
	  return watts;
  }
  
  public int getVolts() {
	  return volts;
  }
  
  public Double getWeight() {
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
  
  public double getPos_x() {
	  return pos_x;
  }
  
  public double getPos_y() {
	  return pos_y;
  }
  
  public double getPos_z() {
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
  
  public void setBeamAngle(Double beamAngle) {
	  this.beamAngle = beamAngle;
  }
  
  public void setFieldAngle(Double fieldAngle) {
	  this.fieldAngle = fieldAngle;
  }
  
  public void setWatts(int watts) {
	  this.watts = watts;
  }
  
  public void setVolts(int volts) {
	  this.volts = volts;
  }
  
  public void setWeight(Double weight) {
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
  
  public void setPos_x(double pos_x) {
	  this.pos_x = pos_x;
  }
  
  public void setPos_y(double pos_y) {
	  this.pos_y = pos_y;
  }
  
  public void setPos_z(double pos_z) {
	  this.pos_z = pos_z;
  }
  
  public double getFieldDiamater() throws FieldAngleNotDefinedException, FocalPointNotDefinedException {
	  if (fieldAngle == 0) {
		  throw new FieldAngleNotDefinedException(
				  "Field Angle not defined.");
	  }
	   
	  if (fp == null) {
		  throw new FocalPointNotDefinedException(
				  "Focal point not defined.");
	  }
	  
	  /*
	   * Need to define Exceptions for pos_x, y, and z not defined, ngkugjhgfhjfvhjv
	   */
	  
	  double leg_a = Point2D.distance(pos_x, pos_y, fp.getPos_x(), fp.getPos_y());
	  double hypot = Math.hypot(leg_a, this.pos_z - fp.getPos_z());
	  double diameter = 2 * (hypot * Math.tan(fieldAngle));
	  
	  return diameter;
  }

}

/*
 * Description: sketches a house that scales with screen size
 * Author: Edric
 */

import processing.core.PApplet;

public class Sketch extends PApplet {

  /*
   * called once
   * inital settings
   */
  public void settings() {
	  // screen size
    size(700, 500);
  }

  /*
   * called once
   * initial setup values
   */
  public void setup() {
    // background color
    background(40, 35, 65);

    // initializes screen window variables
    float fltWidth = (float) width;
    float fltHeight = (float) height;

    // initializes door variables
    float fltDoorWidth = fltWidth / 18.00f;
    float fltDoorHeight = fltHeight / 6.00f;
    float fltDoorXCoords = fltWidth / 2.00f - fltDoorWidth / 2.00f;
    float fltDoorYCoords = fltHeight - fltDoorHeight;

    // initializes window variables
    float fltWindowDiameter = fltWidth / 15.0f;
    float fltWindow1XCoords = fltWidth / 2.00f + fltWidth / 10.00f;
    float fltWindow2XCoords = fltWidth / 2.00f - fltWidth / 10.00f;
    float fltWindowYCoords = fltHeight / 1.20f;
    
    // draws moon
    fill(200,200,200);
    ellipse(fltWidth / 5.00f, fltHeight / 2.50f, fltWidth / 5.00f, fltWidth / 5.00f);

    // draws hill
    fill (20,120,20);
    ellipse(fltWidth / 2.00f, fltHeight / 0.75f, fltWidth, fltHeight);

    // draws wood
    fill(110,60,60);
    rect(fltWidth / 3.00f, fltHeight / 1.50f, fltWidth / 3.00f, fltHeight / 3.00f);
    rect(fltWidth / 1.75f, fltHeight / 2.25f, fltWidth / 15.00f, fltHeight / 5.00f);
    triangle(fltWidth / 3.00f, fltHeight / 1.50f, fltWidth / 2.00f, fltHeight / 2.50f, fltWidth / 1.50f, fltHeight / 1.50f);

    // draws wood details
    fill(180,110,80);
    rect(fltWidth / 3.00f, fltHeight / 1.05f, fltWidth / 3.00f, fltHeight / 21.00f);
    rect(fltWidth / 3.00f, fltHeight / 1.50f, fltWidth / 3.00f, fltHeight / 21.00f);

    // draws windows
    fill(190,200,220);
    ellipse(fltWindow1XCoords, fltWindowYCoords, fltWindowDiameter, fltWindowDiameter);
    ellipse(fltWindow2XCoords, fltWindowYCoords, fltWindowDiameter, fltWindowDiameter);

    // draws door
    fill(60,40,50);
    rect(fltDoorXCoords, fltDoorYCoords, fltDoorWidth, fltDoorHeight);
  }

  /*
   * called repeatedly
   * looped program
   */
  public void draw() {
    // not necessary
  }

}
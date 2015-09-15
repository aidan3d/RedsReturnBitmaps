/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mass.necc.processing;

import processing.core.PApplet;   // Used by the Processing language after port
/**
 * The RedsReturnBitmaps class will become
 * "RedsReturnBitmaps.pde" when we manually
 * port this project to the Processing language.
 * We are using NetBeans for Java instead of
 * the Processing ide for the enhanced tools
 * and debugging power.
 */
public class RedsReturnBitmaps extends PApplet {
    /**
     * This method is home to the Processing
     * language's size() method
     */
    @Override
    public void settings(){
        // create the game window
        size( 360, 480 );
    }
    
    /**
     * All initial housekeeping/setup is done
     * in this method. It is also needed by
     * the Processing engine.
     * .
     */
    @Override
    public void setup() {
        // throw a little gray paint on the canvas
        background( 125, 125, 125 );
        
        // run at a slower 30 frames per second to allow for redraws, etc
        frameRate(30);
    }

    /**
     * This method is run every frame by the
     * Processing language's animation "engine."
     */
    @Override
    public void draw() {
    }
}

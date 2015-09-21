/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mass.necc.processing;

import processing.core.PApplet;   // Used by the Processing language after port
/**
 * The RedsReturnBitmaps class will become
 * <i>"RedsReturnBitmaps.pde"</i> when we manually
 * port this project to the <i>Processing</i> language.
 * We are using <i>NetBeans</i> for Java instead of
 * the <i>Processing</i> IDE for the enhanced tools
 * and debugging power.
 */
public class RedsReturnBitmaps extends PApplet
{
    /**
     * Holds the buttons or keys for our calculator.
     */
    private Rug keypad;


    /**
     * Constructor #1 (default).
     */
    public RedsReturnBitmaps()
    {
        keypad = new Rug(this, 48, 48, 384, 384, 3, 3, "night", "mnemonic" );
    }


    /**
     * This method is home to the Processing
     * language's size() method. Placement inside
     * the setup() method has been deprecated in
     * Processing version 3.x.
     */
    @Override
    public void settings()
    {
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
    public void setup()
    {
        // Throw a little gray paint on the canvas.
        background( 125, 125, 125 );
        
        // Run at a slower 30 frames per second to
        // allow for redraws, etc.
        frameRate( 30 );

    } // end method setup


    /**
     * This method is run every frame by the
     * Processing language's animation "engine."
     */
    @Override
    public void draw()
    {
        // Draw the key pad.
        keypad.draw();
 
    } // end draw method

} // end class RedsReturnBitmaps

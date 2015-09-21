/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mass.necc.processing;

import java.util.ArrayList;             // Used for our list of buttons
                                        // (Crate objects)

import processing.core.PApplet;         // Used by the Processing engine

/**
 * This simulates the keypad's limits. The keypad (a list
 * of <b>Crate</b> objects) sits on this "rug." A <b>Rug</b>
 * object is a class which manages keys, or "crates." When
 * this game is ported to the <i>Processing</i> language,
 * this file will be named <i>Rug.pde</i>.
 * 
 */
public class Rug
{
    private int xOrigin;                // The x-ordinate of the top-left
                                        // point of the keypad
    
    private int yOrigin;                // The y-ordinate of the top-left
                                        // point of the keypad
    
    private int width;                  // The keypads's width, in pixels
    private int height;                 // The keypad's height, in pixels
    
    private int numCratesWide;          // The horizontal button count
    private int numCratesHigh;          // The vertical button count
    
    private String colorScheme;
    private String symbolicScheme;      // "numeric," "alphabetic," or
                                        // "mnemonic"
    
    private PApplet parent;             // Used by the Processing engine.
                                        // Basically, the central calling
                                        // class has a peg into the engine,
                                        // and all classes composed within
                                        // that central (i.e.,
                                        // RedsReturnBitmaps) class need an
                                        // explicit reference to it to use
                                        // the Processing engine's
                                        // functionality
    
    private ArrayList<Crate> buttons;
    
    
    /**
     * The Rug class represents a calculator's keypad,
     * holding all nine or twelve data entry buttons.
     * @param inputParent Reference to the class "composing"
     * the current Rug object upon instantiation
     * @param inputXOrigin X-ordinate of the top-left point of the keypad
     * @param inputYOrigin Y-ordinate of the top-left point of the keypad
     * @param inputWidth Width of the keypad
     * @param inputHeight Height of the keypad
     * @param inputNumCratesWide Number of buttons horizontally
     * @param inputNumCratesHigh Number of buttons vertically
     * @param inputColorScheme Color scheme or "skin"
     * @param inputSymbolicScheme  Button types: numeric, alphabetic or mnemonic
     */
    public Rug(PApplet inputParent, int inputXOrigin, int inputYOrigin,
            int inputWidth, int inputHeight, int inputNumCratesWide,
            int inputNumCratesHigh, String inputColorScheme,
            String inputSymbolicScheme)
    {
        parent = inputParent;           // Point parent in the right "direction"
        
        xOrigin = inputXOrigin;
        yOrigin = inputYOrigin;
        width = inputWidth;
        height = inputHeight;
        numCratesWide = inputNumCratesWide;
        numCratesHigh = inputNumCratesHigh;
        colorScheme = inputColorScheme;
        symbolicScheme = inputSymbolicScheme;
        
        // Load the calculator's buttons.
        ArrayList<Crate> buttons = new ArrayList();
    }
    
    /**
     * Paint the calculator's keypad (a list of
     * buttons) to screen.
     */
    public void draw()
    {
        // Draw the rubber think behind the
        // calculator's buttons.
        parent.rect(48, 208, 24, 24);
        
    } // end method draw
    
} // end class Rug

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mass.necc.processing;

import processing.core.PApplet;   // Used by the Processing language after port
/**
 *
 * The RedsReturnBitmaps class will become
 * "RedsReturnBitmaps.pde" when we manually
 * export this project to the Processing language.
 */
public class RedsReturnBitmaps extends PApplet
{
    @Override
    public void settings()
    {
        // Create the game window.
        size(360, 480);
    }
    
    @Override
    public void setup()
    {
    }

    @Override
    public void draw()
    {
        // Draw a rectangle at the mouse pointer's
        // position in the game window.
        rect(mouseX,mouseY, 20, 20);
    }

}

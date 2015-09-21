//************************************************************
//                R E D ' S   R E T U R N                    *
//                                                           *
// Author:        Aidan Hegarty                              *
//                                                           *
// Last modified: September 20, 2015                         *
//                                                           *
//************************************************************
package edu.mass.necc.processing;


/**
 * The Main class is needed to use the <i>Processing</i>
 * engine in <i>NetBeans</i>.
 */
public class Main {
    /**
     * The <b>Red's Return</b> application starts here.
     * It will be ported to the Processing language at
     * a later date.
     * @param args An array, used when this program is called by the
     * command line or another program.
     */
    public static void main(String[] args) {
        // fire up the fully qualified class for what will be our Processing "sketch"
        RedsReturnBitmaps.main("edu.mass.necc.processing.RedsReturnBitmaps");
    }
}

/**
 * 
 */
package edu.cnm.deepdive.hi.world;

/**
 * Simple class that displays the Hi world message
 *
 */
public class HiWorld {
	

  /**
	 * Prints hi world
	 * @param args Command-line parameters (ignored)
   * @param target 
	 * 
	 */
	public static void main(String[] args ) {
	String target; String message;
	if (args.length>0){
	  target=args[0];
	} else {
	  target="World";
	}
	message=String.format("Hello %s!", target);
	    emitMessage(message); 
	
	}

	private static void emitMessage (String message) {
	  System.out.printf(message); 
	}
}

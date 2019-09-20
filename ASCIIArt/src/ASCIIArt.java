/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :)              

public class ASCIIArt {
	public static void topofFlute() {
		System.out.println(" __________________\\______q_/_______,,______");
	}
	
	public static void fluteHeadjoint() {
		System.out.print("(__(_o_)_____");
	}
	
	public static void fluteBody() {
		System.out.print("|__|___o__qQQQ__QQQQQ_|");
	}
	public static void fluteFootjoint() {
		System.out.println("CluOOO__)");
	}
	
	public static void flute() {
		topofFlute();
		fluteHeadjoint();
		fluteBody();
		fluteFootjoint();
	}
	
	public static void topofStar() {
		System.out.print("_\\/_");
	}
	
	public static void bottomofStar() {
		System.out.print("/\\");
	}
	
	public static void aboveFlute() {
		System.out.print("      ");
		topofStar();
		System.out.print("          ___  ___\n       ");
		bottomofStar();
		System.out.println("          /   \\/   \\");
	}
	
	public static void belowFlute() {
		System.out.println("                     \\    /");
		System.out.print("                      \\  /            ");
		topofStar();
		System.out.print("\n                       \\/              ");
		bottomofStar();
	}
	
	public static void main(String[] args) {
		aboveFlute();
		flute(); 
		belowFlute();
		System.out.println("\n\nA flute sparks joy in a one's heart.");
	}
}
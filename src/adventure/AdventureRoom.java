package adventure;

import java.util.Scanner;

//import java.util.Scanner;

public class AdventureRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response1 = null;
		String response2 = null;
		String response3 = null;
		String response4 = null;
		String response5 = null;
		String response6 = null;
		String response7 = null;

		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("You are in a creepy house!  Would you like to go upstairs or into the kitchen?");
		Scanner scan1 = new Scanner(System.in);
		response1 = scan1.nextLine();
        
	    //while answer is not kitchen and is not upstairs, continue prompt and get response
		while (!response1.equalsIgnoreCase("kitchen")&&!response1.equalsIgnoreCase("upstairs")){
	    	System.out.println("Error Message, choose between kitchen or uspstairs. Run the application over.");
	    	Scanner scan8= new Scanner(System.in);
	    	response1 = scan8.nextLine();
	    
	    // if kitchen, ask refrigerator or cabinet
		if(response1.equalsIgnoreCase("kitchen")) {
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side"
					+ "there is, as you'd expect, a refrigerator. You may open the refrigerator"
					+ "or look in a cabinet.");
			System.out.println("Choose between refrigerator or cabinet");
			Scanner scan2 = new Scanner(System.in);
			response2 = scan2.nextLine();
			// if refrigerator, ask yes or no
			if (response2.equalsIgnoreCase("refrigerator")) {
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty."
						+ "Would you like to eat some of the food? (yes or no)?");
				Scanner scan3 = new Scanner(System.in);
				response3 = scan3.nextLine();
				if (response3.equalsIgnoreCase("yes")) {
					System.out.println("You found the food!");

				}
				if (response3.equalsIgnoreCase("no")) {
					System.out.println("You die of starvation... eventually.");
				}

			}
			
			//if cabinet, ask yes or not
			if (response2.equalsIgnoreCase("cabinet")) {
				System.out.println("There are food in the cabinet.Do you want to eat? yes or no");
				Scanner scan4 = new Scanner(System.in);
				response4 = scan4.nextLine();
				if (response4.equalsIgnoreCase("yes")) {
					System.out.println("You found the food in the cabinet!");

				}
				if (response4.equalsIgnoreCase("no")) {
					System.out.println("You die of hunger... eventually.");
				}

			}
		}
        
		// if upstairs, ask bedroom or bathroom
		if (response1.equalsIgnoreCase("upstairs")) {
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master"
					+ "bedroom.  There is also a bathroom off the hallway.  Where would you like" + "to go?");
			System.out.println("Choose between bedroom or bathroom");
			Scanner scan5 = new Scanner(System.in);
			response5 = scan5.nextLine();
			// if bedroom, ask yes or no
			if (response5.equalsIgnoreCase("bedroom")) {
				System.out.println(" You are in a plush bedroom, with expensive-looking hardwood furniture."
						+ "The bed is unmade.  In the back of the room, the closet door is ajar."
						+ "Would you like to open the door? yes or no");
				Scanner scan6 = new Scanner(System.in);
				response6 = scan6.nextLine();
				if (response6.equalsIgnoreCase("yes")) {
					System.out.println("You will be surprised.");

				}
				if (response6.equalsIgnoreCase("no")) {
					System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing,.");
				}

			}
			// if bathroom, ask yes or no
			if (response5.equalsIgnoreCase("bathroom")) {
				System.out.println("Do you want to take a shower? choose yes or no.");
				Scanner scan7 = new Scanner(System.in);
				response7 = scan7.nextLine();
				if (response7.equalsIgnoreCase("yes")) {
					System.out.println("ooh,water is poisonous!");

				}
				if (response7.equalsIgnoreCase("no")) {
					System.out.println("You can relax.");
				}

			}
		}

	    }


	}
}


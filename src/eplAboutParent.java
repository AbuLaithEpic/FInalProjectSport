

public class eplAboutParent {
	String about;
	String runState;
	
	public String printAbout() {//inheritance
		 this.about="This is the Graphical User Interface of EPL.info."
		 		+ "\nHere, we will show you many information about English Premier League (EPL)"; 
		 return about;
	}
	
	String run() {//polymorphism
		System.out.println("This website is running!");
		return "This website is running!";
	}
	
	public String printContact() {//overriding
		return "Email : abulaithepic@gmail.com";
	}
	
}

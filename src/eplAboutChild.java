

public class eplAboutChild extends eplAboutParent{//inheritance method from class eplAboutParent
	
	String ownerName;
	String ownerAge;
	
	String run(){//polymorphism
		super.run();//polymorphism using keyword super
		this.runState="This website is running fine!";
		return runState;
	}
	
	public String owner(String a) {//overloading
		this.ownerName=a;
		return ownerName;
	}
	public String owner(String a,String b) {//overloading
		this.ownerName=a;
		this.ownerAge=b;
		return ownerAge;
	}
	
	public String printContact() {//overriding
		return "EMAIL  : abulaithepic@gmail.com"
				+"\nGITHUB : github.com/AbuLaithEpic";
	}
}

abstract class eplTop3Abstract {//abstraction

	abstract void setName();//Abstract method
	abstract String getName();//Abstract method
}

class Liverpool extends eplTop3Abstract{//Abstraction
	private String name;//Encapsulation
	Liverpool(){//Constructor
		this.name = "Liverpool F.C";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class ManU extends eplTop3Abstract{
	private String name;//Encapsulation
	ManU(){//Constructor
		this.name = "Manchester United F.C";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class Leicester extends eplTop3Abstract{
	private String name;//Encapsulation
	Leicester(){//Constructor
		this.name = "Leicester City F.C";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}

package test;
import java.util.Arrays;
public class Group {
	private String name;
	private Athlete[] athletes;
	
	public Group (String name, int len) {
		this.name = name;
		Athlete[] athletes = new Athlete[len];
	}
	
	public boolean addAthlete(Athlete a) {
		boolean x = false;
		for (int i = 0; i < athletes.length; i++) {
			if(x==false && athletes[i]==null) {
				x = true;
				athletes[i] = a;
			}
		}
		return x;
	}
	
	public boolean deleteAthlete(String n) {
		boolean x = false;
		for (int i = 0; i < athletes.length; i++) {
			if(x==false && athletes[i].getName()==n) {
				x = true;
				athletes[i] = null;
			}
		}
		return x;
	}
	
	public String getBestAthleteName() {
		double max = athletes[0].average();
		String name = athletes[0].getName();
		for (int i = 1; i < athletes.length; i++) {
			if(max<athletes[i].average()) {
				max = athletes[i].average();
				name = athletes[i].getName();
			}
		}
		return name;
	}
	
	public boolean addGrade (String name, String ap, double gr) {
		for (int i = 0; i < athletes.length; i++) {
			if(athletes[i].getName()==name) {
				if(athletes[i].addGrade(ap, gr))
					return true;
				else
					return false;
			}
		}
		return false;
	}
	public String toString() {
		return "Group [name=" + name + ", athletes=" + Arrays.toString(athletes) + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Athlete[] getAthletes() {
		return athletes;
	}
	public void setAthletes(Athlete[] athletes) {
		this.athletes = athletes;
	}

}

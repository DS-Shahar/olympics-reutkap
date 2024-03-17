package test;
public class Athlete {
	private String name;
	private Grade [] grades;
	private int count;
	public Athlete (String name,int count) {
		this.name = name;
		this.count = count;
		this.grades = new Grade[count];
	}
	public Athlete (Athlete a) {
		name = a.name;
		count = a.count;
		grades = new Grade [a.grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (a.grades[i] != null) {
				this.grades[i] = new Grade(a.grades[i].getApparatus(),a.grades[i].getScore());
			}
		}
	}
	public boolean addGrade (String ap, double gr) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == null) {
				grades[i] = new Grade (ap,gr);
				count ++;
				return true;
			}
		}
		return false;
	}
	public boolean deleteGrade (String apparatus) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i].getApparatus() == apparatus) {
				grades[i] = null;
				count --;
				return true;
			}
		}
		return false;
	}
	public double average () {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != null) {
				sum+=grades[i].getScore();
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum/count;
	}
	public boolean allGradesAbove (double num) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != null) {
				if (grades[i].getScore() < num) {
					return false;
				}
			}
		}
		return true;
	}
	public Boolean isBetter (Athlete a) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != null) {

			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade[] getGrades() {
		return grades;
	}
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String toString() {
		return "Athlete [name=" + name + ", grades=" + (grades) + ", count=" + count + "]";
	}

}

package test;
public class Grade {
	private String apparatus;
	private Double score;
	public Grade (String apparatus,Double score) {
		this.apparatus = apparatus;
		this.score = score;
	}
	public String getApparatus() {
		return apparatus;
	}
	public void setApparatus(String apparatus) {
		this.apparatus = apparatus;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String toString() {
		return "Grade [apparatus=" + apparatus + ", score=" + score + "]";
	}

}

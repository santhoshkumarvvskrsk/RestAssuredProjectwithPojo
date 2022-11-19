package jiraPojoClass;

public class FinalPojoClass {
	
	String sprint;
	BugClass bug;
	public FinalPojoClass(BugClass b,String sp) {
		this.bug=b;
		this.sprint=sp;
	}
	public String getSprint() {
		return sprint;
	}
	public void setSprint(String sprint) {
		this.sprint = sprint;
	}
	public BugClass getBug() {
		return bug;
	}
	public void setBug(BugClass bug) {
		this.bug = bug;
	}

}

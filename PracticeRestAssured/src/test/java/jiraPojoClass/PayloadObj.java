package jiraPojoClass;

public class PayloadObj {

//	public static void main(String[] args) {
//		
//
//	}
	public FinalPojoClass getObj(String summary, String description, String environment, String priority, String story, String assignee,String sprint) {
		BugClass bug = new BugClass(summary,description,environment,priority,story,assignee);
		
		FinalPojoClass fpj = new FinalPojoClass(bug,sprint);
		
		return fpj;
	}

}

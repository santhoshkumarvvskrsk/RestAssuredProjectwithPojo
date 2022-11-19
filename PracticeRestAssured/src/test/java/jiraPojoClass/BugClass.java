package jiraPojoClass;

public class BugClass {
	
	String summary,description,environment,priority,story,assignee;
	
	public BugClass(String s, String d, String e, String p, String st, String as) {
		this.summary=s;
		this.description=d;
		this.environment=e;
		this.priority=p;
		this.story=st;
		this.assignee=as;
		
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

}

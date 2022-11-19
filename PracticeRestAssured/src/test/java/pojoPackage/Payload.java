package pojoPackage;

public class Payload {

	String summary;
	String description;
	IssueType issuetype;
	Projects project;
	
	public Payload(String sum,String des,IssueType iss,Projects pro) {
		this.summary = sum;
		this.description= des;
		this.issuetype= iss;
		this.project = pro;
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
	public IssueType getIssuetype() {
		return issuetype;
	}
	public void setIssuetype(IssueType issuetype) {
		this.issuetype = issuetype;
	}
	public Projects getProject() {
		return project;
	}
	public void setProject(Projects project) {
		this.project = project;
	}
	
}

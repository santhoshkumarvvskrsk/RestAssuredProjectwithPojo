package pojoPackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayload {

	public static void main(String[] args) throws JsonProcessingException {
		
		IssueType issue = new IssueType("Task");
		Projects project = new Projects("REST");
		
		Payload p = new Payload("demo1","demo1 description",issue,project);
		Fields f = new Fields(p);
		
		ObjectMapper objMap = new ObjectMapper();
		String mydata = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(f);
		System.out.println(mydata);
		

	}

}

package RestAssured.PracticeRestAssured;

import org.testng.annotations.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import jiraPojoClass.PayloadObj;
import jiraPojoClass.FinalPojoClass;

import reusableClasses.ReadInputData;

public class dataDriven {
	
	@DataProvider(name="testdata")
	
	public Object[][] TestDataFeed()
	  {
		ReadInputData config = new ReadInputData("C:\\Users\\santhosh\\Documents\\ddtestdata.xlsx");
		  int rows = config.getRowCount(0);
//		  System.out.print(rows+"Rows count");
		  
		  Object[][] credentials = new Object[rows][7];
		  for(int i=1;i<rows;i++)
		  {
		  credentials[i][0] = config.getData(0, i, 0);
		  credentials[i][1] = config.getData(0, i, 1);
		  credentials[i][2] = config.getData(0, i, 2);
		  credentials[i][3] = config.getData(0, i, 3);
		  credentials[i][4] = config.getData(0, i, 4);
		  credentials[i][5] = config.getData(0, i, 5);
		  credentials[i][6] = config.getData(0, i, 6);

		  }
		  return credentials;
		  
	  }
	
	@Test(dataProvider="testdata")
	  public void f(String summary, String description,String environment,String priority, String story,String assignee,String sprint) throws InterruptedException, JsonProcessingException{
		
//		System.out.println(description + "==" + environment+"=="+priority+"=="+story+"=="+assignee+"=="+sprint);
		  if(summary == null && description == null && environment == null && priority == null && story == null && assignee == null && assignee == null && sprint == null ) {
			  
			  System.out.println(description + "==" + environment+"=="+priority+"=="+story+"=="+assignee+"=="+sprint);
		  }else {
			  PayloadObj p = new PayloadObj();
			  FinalPojoClass fp = p.getObj(summary, description, environment, priority, story, assignee, sprint);
			  ObjectMapper objMap = new ObjectMapper();
				String mydata = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(fp);
				System.out.println(mydata);
//			  System.out.println(description + "==" + environment+"=="+priority+"=="+story+"=="+assignee+"=="+sprint);
		  }
		
		
	}

}

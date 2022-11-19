package APIAutomationRestAssured.ApiRestAssured;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,temp1=0;
		HashMap<String,Integer> stock = new HashMap<String,Integer>();
		stock.put("day1",100);
		stock.put("day2",200);
		stock.put("day3",500);
		stock.put("day4",20);
		stock.put("day5",180);
		stock.put("day6",880);

		for(Entry<String, Integer> val: stock.entrySet() ) {
			temp1=val.getValue();
			if(temp<val.getValue()) {
				temp=val.getValue();
				
			}
		}
			
		
	

	}

}

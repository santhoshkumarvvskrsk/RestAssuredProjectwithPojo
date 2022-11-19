
public class SortNumerics {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
int[] input = new int [] {1,0,2,0,4,0,0};

for (int i = 0; i < input.length; i++) {   
	for(int j=i+1;j<input.length;j++) {
		if(input[i]>0) {
//			System.out.println("");
			
		}else {
			int x = input[i];
			input[i]= input[j];
			input[j]=x;
		}
	}
	
}

for (int z = 0; z < input.length; z++) {     
    System.out.println(input[z] + " ");    
}  


	}

}

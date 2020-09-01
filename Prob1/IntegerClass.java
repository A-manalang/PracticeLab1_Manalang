import java.util.ArrayList;
import java.util.Iterator;

public class IntegerClass {
	
	
	static int Add(ArrayList<Integer> nNum) 
	{
		
		
	
		int sum =0;
		
	for(int i = 0;i< nNum.size();i++) {
			
			if(i== 0) 
			{
				System.out.print(nNum.get(i) );
			} else
			{

				System.out.print(" + "+ nNum.get(i));
							
			}
		}
		
		 for(int i=0; i<nNum.size();i++) {
				 sum = sum + nNum.get(i);
		 }
		
		 return sum; 
		
	}
	
	
	
	
}
	

	



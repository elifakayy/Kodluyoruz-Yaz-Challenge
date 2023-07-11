
import java.util.Scanner;
		
public class Medium {

	public static void main(String[] args) {
		
		
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Please enter text :");
	        String text = scan.nextLine();
	        
	        int counter=0;
	        int temp=0;
	        int index=0;
	        
	        for(int i = 0; i < text.length(); i++)
	        {
	        	counter=0;
	            for	(int j=0; j < text.length(); j++ ) 
	            {
	        	
		            if(text.charAt(i) == text.charAt(j)) 
		                counter++;
	            
		            if(counter>temp) { 
		            	temp = counter;
		            	index = i; }  
	            }
	        }
	        
	        System.out.println("The most used letter is : "+text.charAt(index)); 
	        System.out.println("It is used "+temp +" times.");
	}
	    
	        
		       
	
		// TODO Auto-generated method stub
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Text: ");
		String text = scanner.next();
		scanner.close();
		
		        
		        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
		        
		        for (int i = 0; i < text.length(); i++) {
		            if(!hmap.containsKey(text.charAt(i)))
		            {
		                  hmap.put(text.charAt(i),1); 
		            }
		            else
		            {
		                int count= (int)hmap.get(text.charAt(i));
		                hmap.put(text.charAt(i),count+1);
		            }    
		        }
		        System.out.println(text);
		        System.out.println(hmap);
		    

	}
	*/

}


import java.io.*;
import java.util.*;
class Pattern {

	static void pattern(String str){
		//find length
	  int len = str.length();
	  //find middle 
	  int middle = (len + 1 )/ 2 ;
	  //reverse string based on middle value in string
	  String split = str.substring(middle -1,len);
	  String merge = split + str.substring(0,middle-1);
	  
	  for(int i =0 ;i < len ; i++ ){
          for(int j = 0 ; j < len - i - 1 ; j++){
             System.out.print(" ");
		  }
		  for(int j = 0 ; j <= i ; j++){
              System.out.print(merge.charAt(j)); 
		  }
		   System.out.println("");
	  }

	}

	// Main driver function
	public static void main(String[] args)
	{
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter text : ");
       String n = s.nextLine();
	   pattern(n);
	}
}

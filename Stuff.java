package AP;

import java.util.ArrayList;
import java.util.Arrays;

public class Stuff {

    private String style;
    private String color;
    private int price;
    private int sqFeet;
    private ArrayList digitList;
   

    	public static ArrayList<String> tuff(ArrayList<String> phrases)  
{  
     int i = 0;  
     for (String aPhrase : phrases)  
     {  
          if (aPhrase.indexOf("bad") >= 0)  
          {  
               phrases.set(i, "happy thoughts");  
          }  
          i++;  
     }  
     return phrases;  
}  

      

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stuff joe = new Stuff();
		 ArrayList <String> phrases = new ArrayList<String>();
		  phrases.add("good day");
		  phrases.add("bad hair");
		  phrases.add("cookies are good");
		  phrases.add("bad apples");
		  
		System.out.println(joe.tuff(phrases));

}
}
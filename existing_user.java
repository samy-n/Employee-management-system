 import java.time.format.DateTimeFormatter;  
 import java.time.LocalDateTime;    
public class existing_user 
{
      
      public static void main(String args[]) 
      { 
    	punch ob1=new punch();
        System.out.print("Punch in: ");
       ob1.punch_in();
       System.out.print("Punch out: ");
       ob1.punch_out();
       
       
      }
}  
      
 class punch
 {
    void punch_in()
    {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println(dtf.format(now));  
    }     

	void punch_out()
	{
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println(dtf.format(now));  
    }
 }
 
 
 
    
       

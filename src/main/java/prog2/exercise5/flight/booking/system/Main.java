package prog2.exercise5.flight.booking.system;

import java.util.Scanner;




/**
 * Hello world!
 *
 */
public class Main 
{
    
    public static void main( String[] args )
    {   FlightBooking fb = new FlightBooking();

        Scanner t = new Scanner(System.in);
        System.out.println("全名：");
        System.out.println("zlx"+"zzx"+"yyqx");
        fb.setPassengerFullName(0, null);
        fb.getpassengerFullName(0);

    t.close();
    
   

    

}
}


package prog2.exercise5.flight.booking.system;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Scanner;


public class FlightBooking {
    public static void main(String[ ] args){}
    static String flightCompany = "Flights-of-Fancy";
    public String flightID = "FOF0345IN";
    public TripSource tripSource;
    public SourceAirport sourceAirport;
    public TripDestination tripDestination;
    public DestinationAirport destinationAirport;
    public LocalDate departingDate;
    public LocalDate returnDate;
    public int childPassengers;
    public int adultPassengers;
    public int totalPassengers;
    public double departingTicketPrice;
    public double returnTicketPrice;
    public double totalTicketPrice;
    public BookingClass bookingClass;
    private TripType tripType;
    public Array PassengerFullName;
    public Array PassengerGender;
    public Array PassengerAge;
    public Array TicketNumber;
    int size = 3;
    FlightBooking fb = new FlightBooking();

    enum BookingClass {
        FIRST,BUSINESS,ECONOMY
    }
    enum TripType{
        ONE_WAY,RETURN
    }
    enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport,OuluAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport
    }
    enum DestinationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport,OuluAirport,HelsinkiAirport,ParisCharlesdeGaulleAirport
    }
  
    String[]passengerFullName = {"zlx","yyqx","cici"};
    String[]passengerGender = {"woman"+"man"};
    int[]passengerAge = {18,19,20};
    String[]ticketNumber = {"12345"};
    {
    for(int i = 0; i<passengerFullName.length; i++) {
            System.out.println(i);
            
            
    }
    for(int i = 0; i<passengerGender.length; ++i) {
        System.out.println(i);
        
    }
    for(int i = 0; i<passengerAge.length; ++i) {
        System.out.println(i);
        
    }
    for(int i = 0; i<ticketNumber.length; ++i) {
        System.out.println(i);
        
    }
    }
    public String[] getpassengerFullName(int i){
        return passengerFullName;}
    public String[] getpassengerGender(int i){
            return passengerGender;}
    public int[] getpassengerAge(int i){
            return passengerAge;}
    public String[] getticketNumber(int i){
            return ticketNumber;
    }
    
    public void setPassengerFullName(int i,String passengerFullName){};
    public void setPassengerGender(int i,String passengerGender){};
    public void setPassengerAge(int i,int passengerAge){};
    public void setTicketNumber(int i){};


    
    
    
    public void reserveTickets(){
        
        Scanner t = new Scanner(System.in);
        System.out.println("全名：");
        System.out.println("zlx"+"zzx"+"yyqx");
        

        Scanner y = new Scanner(System.in);
        System.out.println("性别:");
        System.out.println("woman"+"man"+"woman");
        

        Scanner u = new Scanner(System.in);
        System.out.println("年龄:");
        System.out.println("18"+"19"+"20");
        
        
        Scanner c = new Scanner(System.in);
        System.out.println("请选择出发地：");
        System.out.println("1. Nanjing" + "\n" +"2.Beijing" + "\n" + "3. Oulu" + "\n" + "4.Helsinki" + "\n" );
        int g = c.nextInt();
    
    
    String ee = new String();
    
    
    switch(g){
        case 1 : ee = "1"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 2 : ee = "2"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 3 : ee = "3"; fb.setTripSource(ee);break;
    }
    switch(g){
        case 4 : ee = "4"; fb.setTripSource(ee);break;
    }
    System.out.println("1");
    
    Scanner d = new Scanner(System.in);
    System.out.println("请选择目的地：");
    System.out.println("1. Nanjing" + "\n" +"2.Beijing" + "\n" + "3. Oulu" + "\n" + "4.Helsinki" + "\n");
    int h = d.nextInt();
    
    String ff = new String();
    
    switch(h){
        case 1 : ff = "1"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 2 : ff = "2"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 3 : ff = "3"; fb.setTripDestination(ff);break;
    }
    switch(h){
        case 4 : ff = "4"; fb.setTripDestination(ff);break;
    }
    System.out.println("4");

    Scanner e = new Scanner(System.in);
    System.out.println("请选择方式:");
    System.out.println("1. One way" + "\n" + "2. Return" + "\n");
    int f = e.nextInt();
    
    String ww = new String();
   
    switch(f){
        case 1 : ww = "1"; fb.setTripType(ww);break;
    }
    switch(f){
        case 2 : ww = "2"; fb.setTripType(ww);break;
    }
    System.out.println("1");

    Scanner a = new Scanner(System.in);
    System.out.println("请输入你想要的舱：");
    System.out.println("1. First "+"\n" + "2.Business" + "\n" +"3. Economy ");
    int b = a.nextInt();
    String qq = new String();
   
    switch(b){
        case 1 : qq = "1"; fb.setBookingClass(qq);break;
    }
    switch(b){
        case 2 : qq = "2"; fb.setBookingClass(qq);break;
    }
    switch(b){
        case 3 : qq = "3"; fb.setBookingClass(qq);break;
    }
    System.out.println("1");

    Scanner i = new Scanner(System.in);
    System.out.println("出发时间：");
    String departingDate = "2023-03-06";
    LocalDate df = LocalDate.parse(departingDate);
    fb.setDepartureDate(df);
    fb.getDepartureDate();
    

    Scanner j = new Scanner(System.in);
    System.out.println("返程时间：");
    String returnDate = "2023-03-08";
    LocalDate rf = LocalDate.parse(returnDate);
    fb.setReturnDate(rf);
    fb.getReturnDate();

    Scanner l = new Scanner(System.in);
    System.out.println("总票价为：");
    
    
    

    Scanner k = new Scanner(System.in);
    System.out.println("票号是什么：");
    
    

    a.close();
    c.close();
    d.close();
    e.close();
    i.close();
    j.close();
    k.close();
    l.close();
    t.close();
    y.close();
    u.close();
    }

    
    
    public String displayTripDetails(){
        return "Thank you for booking your flight with " + flightCompany + "You reserved a total of 3 tickets. " + "\n" + 
        "Here are the trip details for Passenger NO.3" +"\n" +
        "Passenger's Ticket Number: " + ticketNumber + "\n" + 
        "Passenger's Full Name: " + passengerFullName + "\n" +
        "Passenger's Age" + passengerAge + "\n" +
        "Passenger's Gender" + passengerGender + "\n" +
        "From " + tripSource + " to " + tripDestination + "\n" +
        "The flight departs on:" + departingDate + "\n" +
        "And the return flight is on:" + returnDate + "\n" +
        "The total ticket price is:" + totalTicketPrice + "\n" + 
        "IMPORTANT NOTICE:As per our policy, the return date was changed because it was less than two days apart from your departure date" ;


    } 
    

    public BookingClass getBookingClass(){
        return this.bookingClass;
    }
   
    
    public void setBookingClass(String q){
          if(q.equals("1")){
            this.bookingClass = BookingClass.FIRST;
          }
          if(q.equals("2")){
            this.bookingClass = BookingClass.BUSINESS;
          }
          if(q.equals("3")){
            this. bookingClass = BookingClass.ECONOMY;
          }
    }
    public TripType getTripType(){
        return this.tripType;}
    
    public void setTripType(String w){
        if(w.equals("1")){
            this.tripType = TripType.ONE_WAY;
          }
        if(w.equals("2")){
            this.tripType = TripType.RETURN;
    }
        
}
    
    

    public TripSource getTripSource(){
         return this.tripSource;
    }
    public void setTripSource(String e){
        if(e.equals("1")){
            this.tripSource = TripSource.NANJING;
        }
        if(e.equals("2")){
            this.tripSource = TripSource.BEIJING;
        }
        if(e.equals("3")){
            this.tripSource = TripSource.OULU;
        }
        if(e.equals("4")){
            this.tripSource = TripSource.HELSINKI;
        }
    }

    public TripDestination getTripDestination(){
        return this.tripDestination;}
   public void setTripDestination(String ff){
       if(ff.equals("1")){
           this.tripDestination = TripDestination.NANJING;
       }
       if(ff.equals("2")){
           this.tripDestination = TripDestination.BEIJING;
       }
       if(ff.equals("3")){
           this.tripDestination = TripDestination.OULU;
       }
       if(ff.equals("4")){
           this.tripDestination = TripDestination.HELSINKI;
       }
   }
   
   


public LocalDate getDepartureDate(){
    return this.departingDate;}
public LocalDate getReturnDate(){
    return this.returnDate;}
public void setDepartureDate(LocalDate ll){
    this.departingDate = ll;
}
public void setReturnDate(LocalDate returnDate){
    
    int result = returnDate.compareTo(departingDate);
    if(result >= 2){
        this.returnDate=returnDate;
    
    }
    if(result ==1){
        this.returnDate=returnDate.plusDays(1);
    
    }
    if(result ==0){
        this.returnDate=returnDate.plusDays(2);
    
    }
   



}



    
    
}



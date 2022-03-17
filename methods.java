
//Capgemini Car Pooling A Para Constructor Code
class Ride{
    private String
            rideId,fromLocation,toLocation,seatsLeft,totalSeats,isStarted,startTime,e
    ndTime,finished;
    private User rideProvider;
    public Ride(){
        super();
    }
    public Ride(String r,String fl,String tl,String s,String t,String
            st,String et,String is,String f,User rp){
        this.rideId = r;
        this.fromLocation = fl;
        this.toLocation = tl;
        this.seatsLeft =s;
        this.totalSeats = t;
        this.startTime = st;
        this.endTime = et;
        this.isStarted = is;
        this.finished = f;
        this.rideProvider = rp;
    }
    public String getFromLocation(){
        return this.fromLocation;
    }
    public void setFromLocation(String u){
        this.fromLocation=u;
    }
    public String getRideId(){
        return this.rideId;
    }
    public void setRideId(String u){
        this.rideId=u;
    }
    public String getToLocation(){
        return this.toLocation;
    }
    public void setToLocation(String u){
        this.toLocation=u;
    }
    public String getSeatsLeft(){
        return this.seatsLeft;
    }
    public void setSeatsLeft(String u){
        this.seatsLeft=u;
    }
    public String getTotalSeats(){
        return this.totalSeats;
    }
    public void setTotalSeats(String u){
        this.totalSeats=u;
    }
    public String getStartTime(){
        return this.startTime;
    }
    public void setStartTime(String u){
        this.startTime=u;
    }
    public String getEndTime(){
        return this.endTime;
    }
    public void setEndTime(String u){
        this.endTime=u;
    }
    public String getIsStarted(){
        return this.isStarted;
    }
    public void setIsStarted(String u){
        this.isStarted=u;
    }
    public String getFinished(){
        return this.finished;
    }
    public void setFinished(String u){
        this.finished=u;
    }
    public User getRideProvider(){
        return this.rideProvider;
    }
    public void setRideProvider(User u){
        this.rideProvider=u;
    }
    @Override
    public String toString(){
        return "Ride [rideId="+getRideId()+",
        fromLocation="+getFromLocation()+", toLocation="+getToLocation()+",
                seatsLeft="+getSeatsLeft()+", totalSeats="+getTotalSeats()+",
                startTime="+getStartTime()+", endTime="+getEndTime()+",
                isStared="+getIsStarted()+", finished="+getFinished()+",
                rideProvider="+getRideProvider();
    }
}
class User extends Ride{
    int userId, phoneNumber;
    String emailId, password,firstname,lastname,city,gender;
    Address a;
    public User(){
        super();
    }
    public User(int userId,String emailId,String password,String
            firstname,String lastname,String city,String gender,int
                        phoneNumber,Address a){
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstname=firstname;
        this.lastname = lastname;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.a = a;
    }
    public int getuserId(){
        return this.userId;
    }
    public void setuserId(int u){
        this.userId=u;
    }
    public String getemailId(){
        return this.emailId;
    }
    public void setemailId(String u){
        this.emailId=u;
    }
    public String getpassword(){
        return this.password;
    }
    public void setpassword(String u){
        this.password=u;
    }
    public String getfirstname(){
        return this.firstname;
    }
    public void setfirstname(String u){
        this.firstname=u;
    }
    public String getlastname(){
        return this.lastname;
    }
    public void setlastname(String u){
        this.lastname=u;
    }
    public String getcity(){
        return this.city;
    }
    public void setcity(String u){
        this.city=u;
    }
    public String getgender(){
        return this.gender;
    }
    public void setgender(String u){
        this.gender=u;
    }
    public int getphoneNumber(){
        return this.phoneNumber;
    }
    public Address geta(){
        return this.a;
    }
    public void seta(Address u){
        this.a=u;
    }
    public void setphoneNumber(int u){
        this.phoneNumber=u;
    }
    @Override
    public String toString(){
        return "User [userId="+getuserId()+", emailId="+getemailId()+",
        password="+getpassword()+", firstName="+getfirstname()+",
                lastName="+getlastname()+", city="+getcity()+", gender="+getgender()+",
                phoneNumber="+getphoneNumber()+", address="+geta();
    }
}
class Address extends User{
    public String city,state,co;
    public int zip;
    public Address(){
        super();
    }
    public Address(String city,String state,int zip,String co){
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.co = co;
    }
    public String getcity(){
        return this.city;
    }
    public void setcity(String u){
        this.city=u;
    }
    public String getstate(){
        return this.state;
    }
    public void setstate(String u){
        this.state=u;
    }
    public String getco(){
        return this.co;
    }
    public void setco(String u){
        this.co=u;
    }
    public int getzip(){
        return this.zip;
    }
    public void setzip(int u){
        this.zip=u;
    }
    @Override
    public String toString(){
        return "Address [city="+getcity()+", state="+getstate()+",
        zip="+getzip()+", country="+getco()+"]]]";
    }
}
class Source{
    public static void main(String []args){
        Address address = new
                Address("Bangaloar","Karnataka",1234567,"India");
        User user=new
                User(1002,"priya@gmail.com","password@123","Priya","Rani","Bangaloar","Fe
                male",1234567890,address);
                Ride ride = new
                Ride("R7890","Delhi","Bangaloar","5","75","9:45AM","4:30PM","Yes","Yes",u
                ser);
        System.out.println(ride);
    }
}

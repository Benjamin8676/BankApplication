package bankapp;

public class Client {
    private String fname,lname, address;
    private long ssn;
    private long phoneNumber;
    private Account acc;

    public Client(String fname, String lname, String address, long ssn, long phoneNumber) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void printClientInfo(){
        System.out.println("Client fname: " + fname + "Last name: " + lname + " Address: " + address);
    }        
    
    public boolean openAccount(){
        acc = new Account(100,1);
        return true;
    }
}

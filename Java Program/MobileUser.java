interface Sim{
    String dialCall(long mobile_No);
    String sendSms(long mobile_no,String msg);
}
class Airtel implements Sim{
    public String dialCall(long mobile_No){
      return "Airtel No busy pls try again";
    }
    public String sendSms(long mobile_no, String msg) {
        return "Airtel massage sent by "+mobile_no;
    }
}
class Vi implements Sim{
    public String dialCall(long mobile_No){
        return "Vi No busy pls try again";
    }
    public String sendSms(long mobile_no, String msg) {
        return "Vi massage sent by "+mobile_no;
    }
}
class Mobile{
    public Sim s;
    public void insertSim(Sim s){
        this.s=s;
    }
    public String dailCallCall(long mobile_No){
        return s.dialCall(mobile_No);
    }
    public String sendSms(long mobile_no, String msg) {
        return s.sendSms(mobile_no,msg);
    }
}
public class MobileUser {
    public static void main(String[] args) {
        Mobile iphone=new Mobile();
        iphone.insertSim(new Vi());
        String res=iphone.sendSms(936066423,"Hello everyone");
        System.out.println(res);
    }
}

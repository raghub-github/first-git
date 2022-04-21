package com.company;
interface camara{
    void camaraOn();
    void videoRecord();
    private void greed(){  // we cannot access the privet method in the sub or main class through object but access by the default method in the same interface
        System.out.println("good morning");
    }
    /*
    we can add any method in the interface and no need to add in class if they are default
    and if we want to ovewride then we can
     */
    default void record4kVideo(){
        greed();
        System.out.println("recording in 4k mode...");
    }
}
interface wifi{
    String[] connectInternet();
    void hotspot(String network);
}
class cellPhone implements camara{
    void callNumber(int number){
        System.out.println("calling number is : "+number);
    }
//   public  void record4kVideo(){
//        System.out.println("recording in 4k ");
//    }
    public void camaraOn(){
        System.out.println("camara on koro...");
    }
    public void videoRecord(){
        System.out.println("video record koro...");
    }
}
class mySmartPhone extends cellPhone implements wifi,camara{
    public String[] connectInternet(){
        System.out.println("Your internet connection is very good");
        String[] netWorkList={"airtel","idea","vi"};
        return netWorkList;
    }
    public void hotspot(String network){
        System.out.println("password bolo...");
    }
}
public class default_method {
    public static void main(String[] args) {  // main method or main class
      mySmartPhone ms = new mySmartPhone();
      ms.record4kVideo();
      // ms.greed();  // we cannot access the method here as they are private
      String[] smp = ms.connectInternet();
        for (String item : smp){
            System.out.println(item);
        }
    }
}

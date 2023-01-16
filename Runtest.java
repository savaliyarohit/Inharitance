package Inharitance;


public class Runtest {
    public static void main (String[] args){
        TV T = new TV();
        T.Switchontv();
        T.PressAVRemoteSwitch();
        T.changechanel();
        T.Switchofftv();
        T.chanelfees();


        System.out.println("SamsungTV");
        SamsungTV S=new SamsungTV();
        S.Switchontv();
        S.PressAVRemoteSwitch();
        S.changechanel();
        S.Switchofftv();
        S.quality();


        System.out.println("Panasonic");
        Panasonic P =new Panasonic();
        P.Switchontv();
        P.PressAVRemoteSwitch();
        P.changechanel();
        P.Switchofftv();
        P.sizeoftv();
        P.quality();

        System.out.println("SonyTV");
        SonyTV s =new SonyTV();
        s.Switchontv();
        s.PressAVRemoteSwitch();
        s.changechanel();
        s.Switchofftv();
        s.chanelfees();
    }
}

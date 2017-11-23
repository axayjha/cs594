import java.util.*;
import java.io.*;

class Smartphone
{
        String maker;
        double speed, camera;
        int RAM, ROM;
        Smartphone(String maker, int RAM, int ROM, double speed, double camera)
        {
                this.maker = maker;
                this.RAM = RAM;
                this.ROM =ROM;
                this.speed = speed;
                this.camera = camera;
        }
        public String get_maker() {return maker;}
        public int get_RAM(){return RAM;}
        public int get_ROM(){return ROM;}
        public double get_speed(){return speed;}
        public double get_camera(){return camera;}
        public static void main(String args[])
        {
                iPhone ip1 = new iPhone("Apple", 2, 32, 2.5, 12.0);
                System.out.println(ip1.get_maker()+ " has fingerprint sensor: "+ ip1.hasFingerprint());
                ip1.display();
        }
}

class iPhone extends Smartphone
{
        iPhone(String s, int m, int r, double sp, double c)
        {
                super(s,m,r,sp,c);
        }
        boolean hasFingerprint()
        {
                return false;
        }
        void display()
        {
                System.out.println("Maker's name: "+ this.get_maker());
                System.out.println("Speed "+ this.get_speed() + " GHz");
                System.out.println("Memory: "+ this.get_RAM());
                System.out.println("ROM: "+ this.get_ROM());
                System.out.println("Camera: "+ this.get_camera()+ " megapixel");
                System.out.println("Fingerprint: "+ this.hasFingerprint());

        }

}
class Samsung_Galaxy extends Smartphone
{
        Samsung_Galaxy(String s, int m, int r, double sp, double c)
        {
                super(s, m, r, sp, c);
        }
        boolean hasDualSIM()
        {
                return true;        
        }
}

class Motorola extends Smartphone
{
        Motorola(String s, int m, int r, double sp, double c)
        {
                super(s, m, r, sp, c);
        }
        boolean hasStylus()
        {
                return true;        
        }

}

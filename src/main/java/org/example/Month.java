package org.example;

public class Month {
}

class WinterMonth extends Month {}
class AutumnMonth extends Month {}
class SpringMonth extends Month {}
class SummerMonth extends Month {

    public void swim(){
        System.out.println("Пойдем купаться!");
    }

}

package pl.edu.ur.oopl6.zad2;

import java.util.Random;
/*
Tworzona jest tablica 10 elementowa objektu punkt i objekt generujacy leczbu losowe.
w petli przypisywane sa losowe wartosci w przedziale 0-999 do wartosci obiektu
nastepnie wyswietlane sa ostatnie przypisane wartosci do obiektu
*/
public class ObjectCounter {
    public static void main(String[] args){
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
}

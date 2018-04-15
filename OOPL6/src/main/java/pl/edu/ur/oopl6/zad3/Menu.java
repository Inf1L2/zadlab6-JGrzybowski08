package pl.edu.ur.oopl6.zad3;

public class Menu {
    public static void main(String[] args){

        System.out.println("Modul: "+Complex.modul(2,5));

        System.out.println("Sprzezenie: 2+("+Complex.sprzezenie(-2)+"i)");

        Complex.zamianaAnaW(2,5);

        Complex.zamianaWnaA(2, 0.5);

        Complex.dodawanie(2, 3, 4, 5);
    }
}

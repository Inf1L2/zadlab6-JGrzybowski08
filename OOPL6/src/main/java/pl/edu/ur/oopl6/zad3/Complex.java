package pl.edu.ur.oopl6.zad3;

public class Complex {

    public static double modul(double x, double y){
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
    }

   public static double sprzezenie(double y){
        return -y;
   }

   public static void zamianaAnaW(double x, double y){
        double mod=modul(x,y);
        double cos = x/mod;
        double sin = y/mod;
        double tg = sin/cos;
        double kat = Math.atan(tg);
        System.out.println("Algebraiczna: "+x+"+("+y+"i)");
        System.out.println("Wykladnicza: "+mod+"*e^"+kat+"i");
        }

   public static void zamianaWnaA(double mod, double katrad){
        double kat=Math.toDegrees(katrad);
        double x=mod*Math.cosh(kat);
        double y=mod*Math.sinh(kat);
        System.out.println("Wykladnicza: "+mod+"*e^"+kat+"i");
        System.out.println("Algebraiczna: "+x+"+("+y+"i)");
   }

    public static void dodawanie(double x, double y, double a, double b){
        double wa=x+a;
        double wb=y+b;
        System.out.println("Suma: "+wa+"+("+wb+"i)");
    }
}

package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }

    public static double PoleKwadratu(double bok){
        return Math.pow(bok,2);
    }

    public static double ObowodKwadratu(double bok){
        return 4*bok;
    }

    public static double PoleProstokata(double krbok, double dlbok){
        return krbok*dlbok;
    }

    public static double ObowdProstokata(double krbok, double dlbok){
        return (2*krbok)+(2*dlbok);
    }

    public static double ObjetoscStozka(double pr, double H){
        return (1/3)*Math.PI*Math.pow(pr,2)*H;
    }

    public static double PCalkowiteStozka(double pr, double l){
        return Math.PI*pr*(pr+l);
    }

    public static double ObejtoscWalca(double r, double H){
        return Math.PI*Math.pow(r,2)*H;
    }

    public static double PCalkowiteWalca(double r, double H){
        return (2*Math.PI*Math.pow(r, 2))+(2*Math.PI*r*H);
    }
}

package ejecutable;

import modelo.Fecha;

public class Test{
    public static void main(String[] args) {
        
        Fecha f = new Fecha(2,10,1970);
                
        System.out.println("dia: " + f.getdia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnio());
        System.out.println(f);   



    }
}
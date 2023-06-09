package ejecutable;

import modelo.Fecha;
import modelo.FechaDetallada;
import modelo.FechaHora;
import modelo.MostrarConjunto;

public class Test 
{
    public static void main(String[] args) 
    {
        Fecha miFecha = new Fecha(null);

        miFecha.setDia(12);
        miFecha.setMes(11);
        miFecha.setAnio(2022);

        System.out.println(miFecha.toString());

        Fecha miOtraFecha = new Fecha(10, 8, 2010);

        System.out.println(miOtraFecha.toString());

        if (miFecha.equals(miOtraFecha)) {
            System.out.println("Las fechas SÍ son iguales!");
        } else {
            System.out.println("Las fechas NO son iguales!");
        }

        System.out.println("---------------------");
        miFecha.addDias(180);
        System.out.println(miFecha.toString());

        System.out.println("---------------------");

        System.out.println("+++++++++++++++++++++++");

        FechaDetallada miFechaDetallada = new FechaDetallada(19, 11 , 2022);
        
        System.out.println(miFechaDetallada.toString());

        System.out.println(miFechaDetallada.fechaDetallada());

        System.out.println("---------------------");
        
        Object[] arr = {new Fecha(2,10,1970),new FechaDetallada(23,12,1948),new String("Esto es una cadena"), new String("34")};
        MostrarConjunto.mostrar(arr);

        FechaHora miFechaHora = new FechaHora("25/2/2006", 14, 30, 10);
        System.out.println(miFechaHora.toString());


    }
}
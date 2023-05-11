package modelo;

public class Fecha {

    //----------------------
    // Atributos
    //----------------------
    private int dia;
    private int mes;
    private int anio;
    
    //----------------------
    // Métodos
    //----------------------

    // Constructor
    public Fecha(int d, int m, int a ){

        this.dia = d;
        this.mes = m;
        this.anio = a;

    }
    
    // Getters y Setters
    public int getdia() {
        return getDia();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setdia(int dia) {
        this.setDia(dia);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString(){
        
        return getDia() + "/" + mes + "/" + anio;

    }

    public boolean equals(Object o){

        Fecha otra = (Fecha)o;
        return (getDia() == otra.getDia()) && (mes == otra.mes) && (anio == otra.anio);

    }


    



    
}

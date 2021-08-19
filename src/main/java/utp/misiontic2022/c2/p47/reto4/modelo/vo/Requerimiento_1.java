package utp.misiontic2022.c2.p47.reto4.modelo.vo;

import GUI_Vista.Bienvenida;

public class Requerimiento_1 {
    // Su código
    private String nombre;
    private String primer_Apellido;
    private String segundo_Apellido;
    private double Salario;

    public Requerimiento_1(String nombre, String primer_Apellido, String segundo_Apellido, double Salario) {
        this.nombre = nombre;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
        this.Salario = Salario;
        
    }

    public Requerimiento_1(Bienvenida aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(int salario) {
        Salario = salario;
    }
    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }
}

package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private String ciudad;
    private double salario;
    public Requerimiento_3(String ciudad, double salario) {
        this.ciudad = ciudad;
        this.salario = salario;
            
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public double getSalario() {
        return  salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

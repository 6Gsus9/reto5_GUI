package utp.misiontic2022.c2.p47.reto4.vista;

import java.text.DecimalFormat;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
            ArrayList<Requerimiento_1> nombres=controlador.consultarRequerimiento1();
            System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");
            System.out.println("Nombre Primer_apellido Segundo_apellido Salario");
            for (Requerimiento_1 nombre : nombres) {
                System.out.println(nombre.getNombre() + " " + nombre.getPrimer_Apellido() + " " + nombre.getSegundo_Apellido() + " "+ nombre.getSalario());
                
                
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            // Su código
            ArrayList<Requerimiento_2> nombres=controlador.consultarRequerimiento2();
            System.out.println("Transformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");
            System.out.println("Nombre");
            for (Requerimiento_2 nombre : nombres) {
                System.out.println(nombre.getNombre());
                
                
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            // Su código
            ArrayList<Requerimiento_3> nombres=controlador.consultarRequerimiento3();
            DecimalFormat formato1 = new DecimalFormat("#.000000");
            System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia");
            System.out.println("Cargo Salario");
            for (Requerimiento_3 nombre : nombres) {
                System.out.println(nombre.getCiudad()+" "+formato1.format(nombre.getSalario()));
            }
        } catch (Exception e) {
            System.err.println(e);
        }}
    

    
}

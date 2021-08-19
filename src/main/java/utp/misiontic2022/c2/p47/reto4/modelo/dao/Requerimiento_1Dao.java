package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    //Obtener personas por apellido ortiz
    
    public static ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> respuesta=new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();
       
        
        String consulta = "SELECT Nombre , Primer_Apellido , Segundo_Apellido , Salario "+ "FROM Lider "+  "WHERE  Segundo_Apellido  = " + "'Ortiz'";

        
        PreparedStatement stmt = conexion.prepareStatement(consulta);
        ResultSet resultSet = stmt.executeQuery();
        while(resultSet.next()){
            Requerimiento_1 requerimiento_1 = new Requerimiento_1(resultSet.getString("Nombre"), resultSet.getString("Primer_Apellido"), resultSet.getString("segundo_Apellido"), resultSet.getDouble("Salario"));
            //Se agrega cada resgistros como un objeto del ArrayList que contiene la consulta
            respuesta.add(requerimiento_1);
      
            }      
        
        
        
        // Su código
        
        
        

        return respuesta;
    }
}
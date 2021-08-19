package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public static ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta=new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
       
        
        String consulta = "SELECT   Ciudad_Residencia, sum(Salario) FROM Lider  group by Ciudad_Residencia";

        
        PreparedStatement stmt = conexion.prepareStatement(consulta);
        ResultSet resultSet = stmt.executeQuery();
        while(resultSet.next()){
            Requerimiento_3 requerimiento_3 = new Requerimiento_3(resultSet.getString("Ciudad_Residencia"),resultSet.getDouble("sum(Salario)"));
            //Se agrega cada resgistros como un objeto del ArrayList que contiene la consulta
            respuesta.add(requerimiento_3);
      
            }
        return respuesta;
    }
}
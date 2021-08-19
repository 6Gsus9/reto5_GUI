package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public static ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> respuesta=new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
       
        
        String consulta = "SELECT LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) FROM Lider";

        
        PreparedStatement stmt = conexion.prepareStatement(consulta);
        ResultSet resultSet = stmt.executeQuery();
        while(resultSet.next()){
            Requerimiento_2 requerimiento_1 = new Requerimiento_2(resultSet.getString("LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre)))"));
            //Se agrega cada resgistros como un objeto del ArrayList que contiene la consulta
            respuesta.add(requerimiento_1);
      
            }
        return respuesta;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.model.database;

import java.sql.Connection;

/**
 *
 * @author luis
 */
public interface DataBase {

    public Connection conectar();

    public void desconectar(Connection conn);

}
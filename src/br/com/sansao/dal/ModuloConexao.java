package br.com.sansao.dal;

import java.sql.*;

/**
 *
 * @author Vinícius
 */
public class ModuloConexao {

    //Método responsável por estabelecer conexão com o banco
    public static Connection conector() {
        Connection conexao = null;
        //A linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbsansao?characterEncoding=utf-8";
        String user = "dba";
        String password = "admin";
        //Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}

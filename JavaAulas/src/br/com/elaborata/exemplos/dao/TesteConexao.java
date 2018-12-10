package br.com.elaborata.exemplos.dao;

import java.sql.*;
import javax.sql.*;

public class TesteConexao {

	public static void main(String[] args) {
		String strDriver = "com.mysql.cj.jdbc.Driver";//"com.mysql.jdbc.Driver";//"org.postgresql.Driver";
		
		Connection con = null;
		ResultSet rs = null;
		int x = -1;
		
		try {
			Class.forName(strDriver);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","elaborata");
			
			PreparedStatement st = con.prepareStatement("INSERT INTO cliente (nm_cliente,cpf) VALUES(?,?)");
			
			st.setString(1, "NOME ECLIPSE");
			st.setString(2, "421.534.920-68");
			
			x = st.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

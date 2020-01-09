package sql_aula7_conexao;
//import java.sql.DriverManager;
import java.sql.*;//import geral solucionar problemas
//em bibliotecas driver JDBC do MySQL adicionar com botao direito
public class Conexao {
    public static Connection conexao(){
        Connection conexao=null;//toda variavel precisa ter um valor atribuido nem q seja 0
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost/aula07";
        String usuario="root";
        String senha="";
            try{
                Class.forName(driver);
                conexao=DriverManager.getConnection(url, usuario, senha);
                return conexao;
            }catch(Exception e){
                return null;
            }
    }
}
package mysqlconnectiontest;

public class MySqlConnectionTest {

    public static void main(String[] args)throws Exception{
        System.out.println(JdbcUtil.getConnection());
        AlunoDAO alunodao = new AlunoDAO(JdbcUtil.getConnection());
        alunodao.insere((new Aluno("Vitor")));
        alunodao.insere((new Aluno("Henrique")));
        alunodao.insere((new Aluno("Caio")));
        alunodao.listar();
        
        
        
        //alunodao.update();
    }
    
}

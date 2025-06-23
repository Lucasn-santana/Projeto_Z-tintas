/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

/**
 *
 * @author Matheus
 */
import com.mycompany.z_tintas.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
     public void inserirCliente(String nome, String email) {
        Connection conn = Conexao.conectar();

        if (conn != null) {
            try {
                String sql = "INSERT INTO tb_funcionario (nome, email) VALUES (?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setString(2, email);
                stmt.executeUpdate();
                System.out.println("Cliente inserido com sucesso!");
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao inserir cliente: " + e.getMessage());
            }
        } else {
            System.out.println("Conexão falhou.");
        }
    }
     
}

/*ATENCAO PRECISO EDITAR OS COMANDOS DESSE ARQUIVO POIS A TABELA ESTÁ ERRADA, PRECISO INCLUIR OS DADOS RELATIVOS A FUNCIONARIO NA LINHA23 E ALTERAR AS LINHAS DEPOIS*/
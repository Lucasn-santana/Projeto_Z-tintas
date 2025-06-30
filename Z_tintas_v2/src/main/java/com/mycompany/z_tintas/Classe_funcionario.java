/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Matheus
 */
public class Classe_funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private String senha;

    public Classe_funcionario(String nomeFuncionario, String cargoFuncionario, String senha) {
        /*this.idFuncionario = idFuncionario;*/
        this.nomeFuncionario = nomeFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.senha = senha;
    }
        
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static void inserirFuncionario(Classe_funcionario funcionario){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco.");
            return;
        }
        String sql = "INSERT INTO tb_funcionario (nome , cargo , senha) VALUES (? , ? , ?)";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setString(2, funcionario.getCargoFuncionario());
            stmt.setString(3, funcionario.getSenha());
            
            int linhaId = stmt.executeUpdate();
            //O metodo GeneratedKeys busca valores auto_increment do banco de dados e usamos ele para retornar o valor da propria consula
            if(linhaId > 0){
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if(generatedKeys.next()){
                        int id = generatedKeys.getInt(1);// isso aqui vai garantir que o codigo retorne a primeira coluna
                        JOptionPane.showMessageDialog(null, " CADASTRO DE FUNCIONÁRIO REALIZADO!\nO ID CORRESPONDENTE: " + id);
                    }
            }else{
                JOptionPane.showMessageDialog(null, "FALHA AO REALIZAR O CADASTRO ");
            }                                                         
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public static void buscarFuncionario(int id,JTextField NomeFuncionario,JTextField CargoFuncionario){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco.");
            return;
        }
        
        String sql = "SELECT nome,cargo FROM tb_Funcionario WHERE id_funcionario = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet busca = stmt.executeQuery();
            
            if(busca.next()){
                NomeFuncionario.setText(busca.getString("nome"));
                CargoFuncionario.setText(busca.getString("cargo"));                
            }
            else{
                JOptionPane.showMessageDialog(null, "FUNCIONARIO NÃO ENCONTRADO");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR O FUNCIONARIO");
        }catch(NumberFormatException r){
            r.printStackTrace();
            JOptionPane.showMessageDialog(null, "O CAMPO DE MATRICULA É OBRIGATORIO");
        }
        
    }
    
    public static void excluirFuncionario(int id){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco");
            return;
        }
        
        String sql = "DELETE FROM tb_funcionario WHERE id_funcionario = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            
            int linhasAfetadas =stmt.executeUpdate();
            
            if(linhasAfetadas > 0){
                //sucesso
                JOptionPane.showMessageDialog(null,"FUNCIONARIO APAGADO COM SUCESSO!!!");
            }else{
                //erro
                JOptionPane.showMessageDialog(null,"FUNCIONARIO NÃO ENCONTRADO!!!");
                }
            
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"FALHA AO EXCLUIR O FUNCIONARIO!!!");
        }                
    }
    
    public static void salvarAlteracoes (int id,JTextField NomeFuncionario,JTextField CargoFuncionario){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco!!!");
            return;
        }
        
        String sql = "UPDATE tb_funcionario SET nome = ? , cargo = ? WHERE id_funcionario = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,NomeFuncionario.getText());
            stmt.setString(2, CargoFuncionario.getText());
            stmt.setInt(3, id);
            
           int linhasApagadas = stmt.executeUpdate();
           
           if(linhasApagadas > 0){
                JOptionPane.showMessageDialog(null,"ALTERAÇÕES FEITAS COM SUCESSO!!!");
           }else{
                JOptionPane.showMessageDialog(null,"FUNCIONARIO NÃO ENCONTRADO BY:alteraçoes");
           }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"FALHA AO ALTERAR DADOS DO FUNCIONARIO!!!");

        }
        
    }
    public static void listarFuncionarios(JTable tabela_funcionario_java){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        try{
            conn = Conexao.getConexao();
            
            String sql = "SELECT * FROM tb_funcionario;";
            stmt = conn.prepareStatement(sql);
            resultado = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel)tabela_funcionario_java.getModel();
            modelo.setRowCount(0);
            
            while(resultado.next()){
                int id = resultado.getInt("id_funcionario");
                String nome = resultado.getString("nome");
                String cargo = resultado.getString("cargo");
                String senhaBanco = resultado.getString("senha");
                modelo.addRow(new Object[]{id,nome,cargo,senhaBanco} );
            }                        
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception ee){
            ee.printStackTrace();
        }
        finally{
            try{
                if(resultado != null)resultado.close();
                if(stmt != null)stmt.close();
                if(conn != null)conn.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }                            
    }
    
    public static void verificarLogin(JFrame telaAtual,JTextField matricula_login,JPasswordField senha_login){
       Connection conn = Conexao.getConexao();
       String senha = new String(senha_login.getPassword());
       
       try{
           String sql = "SELECT nome,senha FROM tb_funcionario WHERE id_funcionario = ? AND senha =  ?";
           PreparedStatement stmt = conn.prepareStatement(sql);
           stmt.setString(1,matricula_login.getText());
           stmt.setString(2,senha);
           
           ResultSet resultado = stmt.executeQuery();
           if(resultado.next()){
                TELA_MENU_PRINCIPAL menu = new TELA_MENU_PRINCIPAL();
                menu.setVisible(true);               
                telaAtual.dispose();
           }else{
                JOptionPane.showMessageDialog(null,"MATRICULA OU SENHA INCORRETAS!!!");
           }                      
       }catch(SQLException e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"ERRO AO CONECTAR PARA O LOGIN!");
           
       }
       
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
            PreparedStatement stmt = conn.prepareStatement(sql); 
            
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setString(2, funcionario.getCargoFuncionario());
            stmt.setString(3, funcionario.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "CADASTRO DE FUNCIONARIO REALIZADO!!!");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}

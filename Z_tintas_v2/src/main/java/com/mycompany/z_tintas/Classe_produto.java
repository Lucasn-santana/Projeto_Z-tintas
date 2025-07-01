/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Classe_produto {
  private int idProduto;
  private String nomeProduto;
  private String tamanho;
  private String codHex;
  private String marca;
  private int quantidade;
  private double preco;

    public Classe_produto( String nomeProduto, /*String tamanho,*/ String codHex, String marca, int quantidade, double preco) {
        /*this.idProduto = idProduto;*/
        this.nomeProduto = nomeProduto;
        /*this.tamanho = tamanho;*/
        this.codHex = codHex;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
    }
        
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCodHex() {
        return codHex;
    }

    public void setCodHex(String codHex) {
        this.codHex = codHex;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
public static void inserirProduto(Classe_produto produto){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco.");
            return;
        }
        String sql = "INSERT INTO tb_produto (nome_produto , cod_hex , marca, quantidade , preco) VALUES (? , ? , ? ,? , ?)";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getCodHex());
            stmt.setString(3, produto.getMarca());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setDouble(5, produto.getPreco());
            
            int linhaId = stmt.executeUpdate();
            //O metodo GeneratedKeys busca valores auto_increment do banco de dados e usamos ele para retornar o valor da propria consula
            if(linhaId > 0){
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if(generatedKeys.next()){
                        int id = generatedKeys.getInt(1);// isso aqui vai garantir que o codigo retorne a primeira coluna
                        JOptionPane.showMessageDialog(null, " CADASTRO DE FUNCIONÁRIO REALIZADO!\nO ID CORRESPONDENTE AO PRODUTO: " + id);
                    }
            }else{
                JOptionPane.showMessageDialog(null, "FALHA AO REALIZAR O CADASTRO ");
            }                                                         
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    } 
    
  
}

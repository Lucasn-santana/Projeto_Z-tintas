/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
public class Classe_cliente {
    private int id_cliente;
    private String nome;
    private String dt_nascimento;
    private String cpf;
   /* private String cnpj;*/
    private String cep;
    private String uf;
    private String cidade;
    private String rua;
    private String numero;
    private String bairro;

    public Classe_cliente(String nome, String dt_nascimento, String cpf, String cep, String uf, String cidade, String rua, String numero, String bairro) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        /*this.cnpj = cnpj;*/
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }*/

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public static void inserirCliente(Classe_cliente cliente){
        Connection conn = Conexao.getConexao();
    if (conn == null) {
        System.out.println("Falha ao conectar ao banco.");
        return;
    }
        String sql = "INSERT INTO cliente (nome, dt_nascimento,cpf ,cep ,uf ,cidade ,rua ,numero, bairro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getDt_nascimento());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getCep());
            stmt.setString(5, cliente.getUf());
            stmt.setString(6, cliente.getCidade());
            stmt.setString(7, cliente.getRua());
            stmt.setString(8, cliente.getNumero());
            stmt.setString(9, cliente.getBairro());
                               
            stmt.executeUpdate(); 
            System.out.println("Cadastro realizado!!");
        }catch(SQLException e){
             e.printStackTrace();
        }
            
        
    }
}

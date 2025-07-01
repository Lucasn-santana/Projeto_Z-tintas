/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


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
        this.bairro = bairro;
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
    public static void listarClientes(JTable tabela_cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        try{
            conn = Conexao.getConexao();
            
            String sql = "SELECT * FROM cliente;";
            stmt = conn.prepareStatement(sql);
            resultado = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel)tabela_cliente.getModel();
            modelo.setRowCount(0);
            
            while(resultado.next()){
                int id_cli = resultado.getInt("id_cliente");
                String nome_cli = resultado.getString("nome");
                String dt_nasc = resultado.getString("dt_nascimento");
                String cpf_cli = resultado.getString("cpf");
                String cep_cli = resultado.getString("cep");
                String uf_cli = resultado.getString("uf");
                String cidade_cli = resultado.getString("cidade");
                String rua_cli = resultado.getString("rua");
                String numero_cli = resultado.getString("numero");
                String bairro_cli = resultado.getString("bairro");
                modelo.addRow(new Object[]{id_cli,nome_cli,dt_nasc,cpf_cli,cep_cli,uf_cli,cidade_cli,rua_cli,numero_cli,bairro_cli} );
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

        public static void buscarCliente(String cpf,JTextField nomeCompleto,JTextField dt_nasc,JTextField cpf_texto,JTextField telefone,JTextField cep,JTextField rua,JTextField uf,JTextField cidade,JTextField bairro,JTextField numero_Casa){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco.");
            return;
        }
        
        String sql = "SELECT nome,dt_nascimento,cep,uf,cidade,rua,numero,bairro FROM cliente WHERE cpf = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            ResultSet busca = stmt.executeQuery();
            
            if(busca.next()){
                nomeCompleto.setText(busca.getString("nome"));
                dt_nasc.setText(busca.getString("dt_nascimento"));
                cpf_texto.setText(busca.getString("cpf"));
                telefone.setText(busca.getString("telefone"));
                cep.setText(busca.getString("cep"));
                rua.setText(busca.getString("uf"));
                uf.setText(busca.getString("cidade"));
                cidade.setText(busca.getString("rua"));
                bairro.setText(busca.getString("numero"));
                numero_Casa.setText(busca.getString("bairro"));
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
    
    
    
    
    
    
    }
        
        
    


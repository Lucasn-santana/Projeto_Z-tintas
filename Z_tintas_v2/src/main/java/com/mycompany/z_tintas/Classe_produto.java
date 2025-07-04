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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
  /*private int quantidade;*/
  private double preco;

    public Classe_produto( String nomeProduto, /*String tamanho,*/ String codHex, String marca/*, int quantidade*/, double preco) {
        /*this.idProduto = idProduto;*/
        this.nomeProduto = nomeProduto;
        /*this.tamanho = tamanho;*/
        this.codHex = codHex;
        this.marca = marca;
       /* this.quantidade = quantidade;*/
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

   /* public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }*/

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
        String sql = "INSERT INTO tb_produto (nome_produto , cod_hex , marca, preco) VALUES (? , ? , ? ,?  )";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getCodHex());
            stmt.setString(3, produto.getMarca());
            /*stmt.setInt(4, produto.getQuantidade());*/
            stmt.setDouble(4, produto.getPreco());
            
            int linhaId = stmt.executeUpdate();
            //O metodo GeneratedKeys busca valores auto_increment do banco de dados e usamos ele para retornar o valor da propria consula
            if(linhaId > 0){
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if(generatedKeys.next()){
                        int id = generatedKeys.getInt(1);// isso aqui vai garantir que o codigo retorne a primeira coluna
                        JOptionPane.showMessageDialog(null, " CADASTRO DO PRODUTO REALIZADO!\nO ID CORRESPONDENTE AO PRODUTO: " + id);
                    }
            }else{
                JOptionPane.showMessageDialog(null, "FALHA AO REALIZAR O CADASTRO ");
            }                                                         
        }catch(SQLException e){
            e.printStackTrace();
        }catch(NumberFormatException z){
            JOptionPane.showMessageDialog(null, "O PREÇO DEVE USAR [.]");
        }
        
    }

    public static void buscarProduto(JTextField idProduto,JTextField nomeProduto,JTextField marcaProduto, JTextField codHex, JTextField PrecoProduto){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco.");
            return;
        }
        
        String sql = "SELECT * FROM tb_produto WHERE id_produto = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(idProduto.getText()));
            
            ResultSet busca = stmt.executeQuery();
            
            if(busca.next()){
/*----->>>>*/   idProduto.setText(busca.getString("id_produto"));
                nomeProduto.setText(busca.getString("nome_produto"));
                marcaProduto.setText(busca.getString("marca"));                
                codHex.setText(busca.getString("cod_hex"));
                PrecoProduto.setText(busca.getString("preco"));
            }
            else{
                JOptionPane.showMessageDialog(null, "PRODUTO NÃO ENCONTRADO");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR O PRODUTO");
        }catch(NumberFormatException r){
            r.printStackTrace();
            JOptionPane.showMessageDialog(null, "O CAMPO DE CODIGO É PRODUTO");
        }
        
    }
    
    public static void salvarAlteracoesProdutos (JTextField idProduto,JTextField nomeProduto,JTextField marcaProduto, JTextField codHex, JTextField PrecoProduto){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco!!!");
            return;
        }
        
        String sql = "UPDATE tb_produto SET nome_produto = ? , cod_hex = ? , marca = ? , preco = ? WHERE id_produto = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,nomeProduto.getText());
            stmt.setString(2, codHex.getText());
            stmt.setString(3, marcaProduto.getText());
            stmt.setDouble(4, Double.parseDouble(PrecoProduto.getText().replace(",", ".")));            
            stmt.setInt(5, Integer.parseInt(idProduto.getText()));
            
           int linhasApagadas = stmt.executeUpdate();
           
           if(linhasApagadas > 0){
                JOptionPane.showMessageDialog(null,"ALTERAÇÕES FEITAS COM SUCESSO!!!");
           }else{
                JOptionPane.showMessageDialog(null,"PRODUTO NÃO ENCONTRADO BY:alteraçoes PRODUTO");
           }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"FALHA AO ALTERAR DADOS DO PRODUTO!!!");

        }
        
    }
        public static void excluirProduto(int idProduto){
        Connection conn = Conexao.getConexao();
        
        if(conn == null){
            System.out.println("Falha ao conectar ao banco");
            return;
        }
        
        String sql = "DELETE FROM tb_produto WHERE id_produto = ?";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,idProduto);
            
            int linhasAfetadas =stmt.executeUpdate();
            
            if(linhasAfetadas > 0){
                //sucesso
                JOptionPane.showMessageDialog(null,"PRODUTO APAGADO COM SUCESSO!!!");
            }else{
                //erro
                JOptionPane.showMessageDialog(null,"PRODUTO NÃO ENCONTRADO!!!");
                }
            
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"FALHA AO EXCLUIR O PRODUTO!!!");
        }                
    }
        
       public static void listarProdutos(JTable tabela_produto){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        try{
            conn = Conexao.getConexao();
            
            String sql = "SELECT * FROM tb_produto;";
            stmt = conn.prepareStatement(sql);
            resultado = stmt.executeQuery();
            
            DefaultTableModel modelo = (DefaultTableModel)tabela_produto.getModel();
            modelo.setRowCount(0);
            
            while(resultado.next()){
                int CODIGO = resultado.getInt("id_produto");
                String NOME = resultado.getString("nome_produto");
                String COD_HEX = resultado.getString("cod_hex");
                String MARCA = resultado.getString("marca");
                Double PRECO = resultado.getDouble("preco");
                modelo.addRow(new Object[]{CODIGO,NOME,MARCA,COD_HEX,PRECO} );
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
    
}

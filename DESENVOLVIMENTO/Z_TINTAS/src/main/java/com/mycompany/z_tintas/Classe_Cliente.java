/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.z_tintas;

/**
 *
 * @author Matheus
 */
public class Classe_Cliente {
 

    private int id_cliente;
    private String nome;
    private String dt_nascimento;
    private String cpf;
    private String cnpj;
    private String cep;
    private String uf;
    private String cidade;
    private String rua;
    private String numero;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

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
    
    /*AÇÕES*/
    public void cadastrarCliente(String nome,String dt_nascimento,String cpf,String cnpj,String cep,String uf,String cidade,String rua,String numero){
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf ;
        this.cnpj = cnpj;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
    
}
   


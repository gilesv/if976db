/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Augusto
 */
public class Employee {
    
    String cpf;
    String rg;
    String nome;
    String sexo;
    Integer salario;
    String gerente_cpf;

    public String getCPF() {
        return cpf;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getRG() {
        return rg;
    }
    public void setRG(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Integer getSalario() {
        return salario;
    }
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    
    public String getGerenteCpf() {
        return gerente_cpf;
    }
    public void setGerenteCpf(String cpf_gerente) {
        this.gerente_cpf = cpf_gerente;
    }
}

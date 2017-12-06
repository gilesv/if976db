/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vinícius Giles
 */
public class Client {
    private String cpf;
    private String rg;
    private String nome;
    
    public String getCPF() {
        return this.cpf;
    }
    public void setCPF(String newCpf) {
        this.cpf = newCpf;
    }
    
    public String getRG() {
        return this.rg;
    }
    public void setRG(String newRg) {
        this.rg = newRg;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String newNome) {
        this.nome = newNome;
    }
}

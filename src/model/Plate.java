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
public class Plate {
    
    int numero;
    int preco;
    String nome;
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public int getPreco(){
        return this.preco;
    }
    
    public void setPreco(int preco){
        this.preco = preco;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
}

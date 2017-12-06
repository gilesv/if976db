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
public class Invoice {
    
   String nome_cliente;
   int total;
   
   public String getNomeCliente(){
       return this.nome_cliente;
   }
   
   public void setNomeCliente(String nome){
       this.nome_cliente = nome;
   }
   
   public int getTotal(){
       return this.total;
   }
   
   public void setTotal(){
       this.total = total;
   }
   
    
}

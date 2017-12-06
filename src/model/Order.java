/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.Date;


/**
 *
 * @author Vinícius Giles
 */
public class Order {
    Timestamp data;
    String cpf_garcom;
    String cpf_cliente;
    int numero_prato;
    
    public Timestamp getData(){
        return this.data;
    }
    
    public void setData(Timestamp data){
        this.data = data;
    }
    
    public String getCpfGarcom(){
        return this.cpf_garcom;
    }
    
    public void setCpfGarcom(String cpf_garcom){
        this.cpf_garcom = cpf_garcom;
    }
    
    public String getCpfCliente(){
        return this.cpf_cliente;
    }
    
    public void setCpfCliente(String cpf_cliente){
        this.cpf_cliente = cpf_cliente;
    }
    
    public int getNumeroPrato(){
        return this.numero_prato;
    }
    
    public void setNumeroPrato(int numero_prato){
        this.numero_prato = numero_prato;
    }
}

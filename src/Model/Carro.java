/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Carro {
        private int veiculoid;
        private String cadastro, placa, cor, modelo;
        
        
public void setID(int veiculoid){
              this.veiculoid = veiculoid;
}
    
    
public int getID(){
              return this.veiculoid;
} 
    
    
public void setCadastro(String cadastro){
              this.cadastro = cadastro;
    }
    
    public String getCadastro(){
              return this.cadastro;
    }         
 
    public void setPlaca(String placa){
              this.placa = placa;
    }
    
    public String getPlaca(){
              return this.placa;
    }   
    
    public void setCor(String cor){
              this.cor = cor;
    }
    
    public String getCor(){
              return this.cor;
    }  

    public void setModelo(String modelo){
                this.modelo = modelo;
    }
    
    public String getModelo(){
              return this.modelo;
    }  
    }   
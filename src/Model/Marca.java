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
public class Marca {
         private int marcaid;
         private String nome;
         
    public void setID(int marcaid){
              this.marcaid = marcaid;
        }
          
    public int getID(){
              return this.marcaid;
        } 
    
    public void setNome(String nome){
              this.nome = nome;
        }
          
    public String getNome(){
              return this.nome;
        } 
        }

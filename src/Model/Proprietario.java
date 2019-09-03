/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Proprietario {
        private int usuarioid;
        private String cpf, endereco, telefone;
        
        public void setID(int usuarioid){
              this.usuarioid = usuarioid;
        }
          
        public int getID(){
              return this.usuarioid;
        } 
        
        public void setcpf(String cpf){
              this.cpf = cpf;
        }
          
        public String cpf(){
              return this.cpf;
        } 
        
        public void setEndereco(String endereco){
              this.endereco = endereco;
        }
          
        public String endereco(){
              return this.endereco;
        } 
        
        public void settelefone(String telefone){
              this.telefone = telefone;
        }
          
        public String telefone(){
              return this.telefone;
        } 
        
}

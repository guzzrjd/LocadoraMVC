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
public class Clientes {
    private int clientesid;
    private String rg, cpf, estado, cidade, cep, telefone;
    private String nome;
    private String codcarro;
    private String dtentrega;
    private String diaria;
    private String dias;

    public String getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(String dtentrega) {
        this.dtentrega = dtentrega;
    }

    public String getDiaria() {
        return diaria;
    }

    public void setDiaria(String diaria) {
        this.diaria = diaria;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    public void setID(int clientesid){
              this.clientesid = clientesid;
}
    
    
public int getID(){
              return this.clientesid;
}

public void setRG(String rg){
              this.rg = rg;
}
    
    
public String getRG(){
              return this.rg;
}

public void setNOME(String nome){
              this.nome = nome;
}
    
    
public String getNOME(){
              return this.nome;
}

public void setCPF(String cpf){
              this.cpf = cpf;
}
    
    
public String getCPF(){
              return this.cpf;
} 

public void setEstado(String estado){
              this.cpf = cpf;
}
    
    
public String getEstado(){
              return this.estado;
}

public void setTelefone(String telefone){
              this.telefone = telefone;
}
    
    
public String getTelefone(){
              return this.telefone;
}

    public void setCODCARRO(String codcarro) {
         this.codcarro = codcarro;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author riqui
 */
public class Combustivel {
    
     private int Codigo;
     private String Descricao;
     private float Quantidade;
     private Combustivel proximo;

   
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }    
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }    
    public float getQuantidade() {
        return Quantidade;
    }    
    public void setQuantidade(float Quantidade) {
        this.Quantidade = Quantidade;
    }
    public Combustivel getProximo() {
        return proximo;
    }
    public void setProximo(Combustivel proximo) {
        this.proximo = proximo;
    }
    
    public void Combustivel(){
    Quantidade = 0;    
        
    }
    
    
    
    
}

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
    
     private int codigo;
     private String descricao;
     private float quantidade;
     private Combustivel proximo;

   
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int Codigo) {
        this.codigo = Codigo;
    }    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }    
    public float getQuantidade() {
        return quantidade;
    }    
    public void setQuantidade(float Quantidade) {
        this.quantidade = Quantidade;
    }
    public Combustivel getProximo() {
        return proximo;
    }
    public void setProximo(Combustivel proximo) {
        this.proximo = proximo;
    }
    
    public void Combustivel(){
    quantidade = 0;   
    proximo = null;
    }
    
    
    
    
}

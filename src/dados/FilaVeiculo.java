/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;
import dominio.Veiculo;
/**
 *
 * @author riqui
 */
public class FilaVeiculo {
    private Veiculo primeiro;
    private Veiculo ultimo;
    private int quantidade;
    

    public Veiculo getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Veiculo primeiro) {
        this.primeiro = primeiro;
    }
    public Veiculo getUltimo() {
        return ultimo;
    }
    public void setUltimo(Veiculo ultimo) {
        this.ultimo = ultimo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public FilaVeiculo(){
    primeiro = null;
    ultimo = null;
    quantidade = 0;
    }
    
    public void Incluir(Veiculo veiculo){//incluir um carro na fila
    if(primeiro == null){
    primeiro = veiculo;
    }else{
        ultimo.setAnterior(veiculo);        
    }
    
    quantidade++;
    ultimo = veiculo;
    }
    
    public void Abastecer(){// ele vai "liberara' o primeiro da fila, pois já abasteceu, assim excluindo ele
    primeiro = primeiro.getAnterior();    
    }
    
    //Criar Alterar
    
    
    //criar a listagem  
    
    
    
    
}

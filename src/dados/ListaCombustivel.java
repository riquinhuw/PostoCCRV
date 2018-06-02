
package dados;
import dominio.Combustivel;

public class ListaCombustivel {
    
    private Combustivel inicio;
    private Combustivel fim;
    private int quantidade;
    
    public Combustivel getInicio() {
        return inicio;
    }
    public void setInicio(Combustivel inicio) {
        this.inicio = inicio;
    }
    public Combustivel getFim() {
        return fim;
    }
    public void setFim(Combustivel fim) {
        this.fim = fim;
    }
        public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public ListaCombustivel(){
        inicio = null;
        fim = null;
        quantidade = 0;
        
    }
    
    public void Incluir(Combustivel combustivel){
        if(combustivel == null){//nao tem incio ainda, ele vai se setar como primeiro
        inicio = combustivel;
        }else{// já tem alguem na lista
        fim.setProximo(combustivel);
        }
        fim = combustivel;
        quantidade++;
    
    }
    
    public void CriarCombustiveis(){// para facilitar o uso da aplicação, vamos criar um botão para criar os combustiveis
    Combustivel combustivel = new Combustivel();
    combustivel.setCodigo(1);
    combustivel.setDescricao("Gasolina");
    Incluir(combustivel);
    combustivel.setCodigo(2);
    combustivel.setDescricao("Alcool");
    Incluir(combustivel);
    combustivel.setCodigo(3);
    combustivel.setDescricao("Diesel");
    Incluir(combustivel);
    combustivel.setCodigo(4);
    combustivel.setDescricao("Gas");
    Incluir(combustivel);    
    }



    
    
}

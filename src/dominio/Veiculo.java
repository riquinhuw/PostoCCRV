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
public class Veiculo {
    
    private String Placa;
    private int TipoCombustivel;
    private float Litros;
    private Veiculo anterior;
    
    public Veiculo(){}

    public String getPlaca() {
        return Placa;
    }   
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }    
    public int getTipoCombustivel() {
        return TipoCombustivel;
    }    
    public void setTipoCombustivel(int TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }
    public float getLitros() {
        return Litros;
    }
    public void setLitros(float Litros) {
        this.Litros = Litros;
    }
    public Veiculo getAnterior() {
        return anterior;
    }
    public void setAnterior(Veiculo anterior) {
        this.anterior = anterior;
    }
    
    
    
}

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

    public ListaCombustivel() {
        inicio = null;
        fim = null;
        quantidade = 0;

    }

    public void Incluir(Combustivel combustivel) {
        if (combustivel == null) {//nao tem incio ainda, ele vai se setar como primeiro
            inicio = combustivel;
        } else {// já tem alguem na lista
            fim.setProximo(combustivel);
        }
        fim = combustivel;
        quantidade++;

    }

    public void CriarCombustiveis() {// para facilitar o uso da aplicação, vamos criar um botão para criar os combustiveis
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

    // sei que tem uma forma de automizar isso, criando uma variavel "codigo", contendo o .getProximo()
    // Que vai seguindo um While até achar o certo, enquanto não, ele vai concatenando .getProximo até acha-lo
    public String Consultar(int codigo) {
        String retorno = new String();
        if (inicio.getCodigo() == codigo) {
            retorno = inicio.getCodigo() + "-" + inicio.getDescricao() + " - Vendeu:" + inicio.getQuantidade() + "L";
        } else {
            if (inicio.getProximo().getCodigo() == codigo) {
                retorno = inicio.getProximo().getCodigo() + "-" + inicio.getProximo().getDescricao() + " - Vendeu:" + inicio.getProximo().getQuantidade() + "L";
            } else {
                if (inicio.getProximo().getProximo().getCodigo() == codigo) {
                    retorno = inicio.getProximo().getProximo().getCodigo() + "-" + inicio.getProximo().getProximo().getDescricao() + " - Vendeu:" + inicio.getProximo().getProximo().getQuantidade() + "L";
                } else {
                    if (inicio.getProximo().getProximo().getProximo().getCodigo() == codigo) {
                        retorno = inicio.getProximo().getProximo().getProximo().getCodigo() + "-" + inicio.getProximo().getProximo().getProximo().getDescricao() + " - Vendeu:" + inicio.getProximo().getProximo().getProximo().getQuantidade() + "L";
                    } else {
                        retorno = "Numero invalido, tente novamente";
                    }
                }
            }
        }

        return retorno;
    }

    public void Limpar() {//Zera o valor que foi vendido de Litros
        inicio.setQuantidade(0);
        inicio.getProximo().setQuantidade(0);
        inicio.getProximo().getProximo().setQuantidade(0);
        inicio.getProximo().getProximo().getProximo().setQuantidade(0);

    }

    public void Abastecer(int codigoAbastecer, float litros) {

        if (inicio.getCodigo() == codigoAbastecer) {
            inicio.setQuantidade(litros);
        } else {
            if (inicio.getProximo().getCodigo() == codigoAbastecer) {
                inicio.getProximo().setQuantidade(litros);
            } else {
                if (inicio.getProximo().getProximo().getCodigo() == codigoAbastecer) {
                    inicio.getProximo().getProximo().setQuantidade(litros);
                } else {
                    if (inicio.getProximo().getProximo().getProximo().getCodigo() == codigoAbastecer) {
                        inicio.getProximo().getProximo().getProximo().setQuantidade(litros);
                    } else {
                        // Criar popup de errro de nao por o tipo certo
                    }
                }

            }

        }
    }
}

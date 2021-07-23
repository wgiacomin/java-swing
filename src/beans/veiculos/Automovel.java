package beans.veiculos;

import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.veiculos.modelos.ModeloAutomovel;

public class Automovel extends VeiculoAbstract {

    private final ModeloAutomovel modelo;

    public Automovel(ModeloAutomovel modelo, Estado estado, Marca marca, Categoria categoria, String placa, int ano, double valorDeCompra) {
        super(estado, marca, categoria, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloAutomovel getModelo() {
        return this.modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 100;
            case INTERMEDIARIO:
                return 300;
            case LUXO:
                return 450;
            default:
                return 0;
        }
    }

}

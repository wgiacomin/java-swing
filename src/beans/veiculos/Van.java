package beans.veiculos;

import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.veiculos.modelos.ModeloVan;

public class Van extends VeiculoAbstract {

    private final ModeloVan modelo;

    public Van(ModeloVan modelo, Estado estado, Marca marca, Categoria categoria, String placa, int ano, double valorDeCompra) {
        super(estado, marca, categoria, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloVan getModelo() {
        return this.modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 200;
            case INTERMEDIARIO:
                return 400;
            case LUXO:
                return 600;
            default:
                return 0;
        }
    }
}

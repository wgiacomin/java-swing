package beans.veiculos;

import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.veiculos.modelos.ModeloMotocicleta;

public class Motocicleta extends VeiculoAbstract {

    private final ModeloMotocicleta modelo;

    public Motocicleta(ModeloMotocicleta modelo, Estado estado, Marca marca, Categoria categoria, String placa, int ano, double valorDeCompra) {
        super(estado, marca, categoria, placa, ano, valorDeCompra);
        this.modelo = modelo;
    }

    public ModeloMotocicleta getModelo() {
        return this.modelo;
    }

    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 70;
            case INTERMEDIARIO:
                return 200;
            case LUXO:
                return 350;
            default:
                return 0;
        }
    }

}

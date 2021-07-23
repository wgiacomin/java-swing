package beans.veiculos;

import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.cliente.Cliente;
import java.util.Calendar;

public interface VeiculoInterface {
    
    public void locar(int dias, Calendar data, Cliente cliente);

    public void vender();

    public void devolver();

    public Estado getEstado();

    public Marca getMarca();

    public Categoria getCategoria();

    public Locacao getLocacao();

    public String getPlaca();

    public int getAno();

    public double getValorParaVenda();

    public double getValorDiariaLocacao();
    
}

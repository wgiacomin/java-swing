package beans.veiculos;

import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.cliente.Cliente;
import java.util.Calendar;

public abstract class VeiculoAbstract implements VeiculoInterface {

    private Estado estado;
    private final Marca marca;
    private final Categoria categoria;
    private Locacao locacao = null;
    private final String placa;
    private final int ano;
    private final double valorDeCompra;

    public VeiculoAbstract(Estado estado, Marca marca, Categoria categoria, String placa, int ano, double valorDeCompra) {
        this.estado = estado;
        this.marca = marca;
        this.categoria = categoria;
        this.placa = placa;
        this.ano = ano;
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        if (this.estado == Estado.VENDIDO) {
            return;
        }
        this.locacao = new Locacao(dias, getValorDiariaLocacao(), data, cliente);
        this.estado = Estado.LOCADO;
    }

    @Override
    public void vender() {
        this.estado = Estado.VENDIDO;
    }

    @Override
    public void devolver() {
        this.estado = Estado.DISPONIVEL;
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public Marca getMarca() {
        return this.marca;
    }

    @Override
    public Categoria getCategoria() {
        return this.categoria;
    }

    @Override
    public Locacao getLocacao() {
        return this.locacao;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public double getValorParaVenda() {
        double valorDeVenda = this.valorDeCompra - (Calendar.getInstance().get(Calendar.YEAR) - ano) * 0.15 * this.valorDeCompra;
        if (valorDeVenda < 0.1 * valorDeCompra) {
            return 0.1 * valorDeCompra;
        }
        return valorDeVenda;
    }

    @Override
    public abstract double getValorDiariaLocacao();

}

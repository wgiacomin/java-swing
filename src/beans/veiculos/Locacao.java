package beans.veiculos;

import beans.cliente.Cliente;
import java.util.Calendar;

public class Locacao {
    private final int dias;
    private final double valor;
    private final Calendar data;
    private final Cliente cliente;

    public Locacao(int dias, double valor, Calendar data, Cliente cliente) {
        this.dias = dias;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getDias(){
        return this.dias;
    }
    
    public Calendar getData(){
        return this.data;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
}

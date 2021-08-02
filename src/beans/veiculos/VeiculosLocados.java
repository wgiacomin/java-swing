package beans.veiculos;

import beans.cliente.Cliente;
import beans.veiculos.Locacao;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Calendar;

public class VeiculosLocados extends VeiculosTabela {
    
    public VeiculosLocados(){
       colunas = new String[]{"#", "Cliente", "Placa", "Marca", "Modelo", "Ano", "Data Locação", "Diária", "Dias", "Valor"};
    }

    @Override
    public Object getValueAt(int row, int col) {
        VeiculoAbstract veiculo = listaDeVeiculos.get(row);
        switch (col) {
            case 6:
                return formatterData.format(veiculo.getLocacao().getData().getTime());
            case 7:
                return formatter.format(veiculo.getValorDiariaLocacao());
            case 8:
                return veiculo.getLocacao().getDias();
            case 9:
                return formatter.format((veiculo.getValorDiariaLocacao())*(veiculo.getLocacao().getDias()));
            default:
                return super.getValueAt(row,col);
        }
    }

      
}
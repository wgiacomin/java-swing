package beans.veiculos;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class TabelaVenda extends VeiculosTabela {
    
    public TabelaVenda(){
       colunas = new String[]{"#", "Placa", "Marca", "Modelo", "Ano", "Valor de venda"};
    }

    @Override
    public Object getValueAt(int row, int col) {
        VeiculoAbstract veiculo = listaDeVeiculos.get(row);
        switch (col) {
            case 0:
                return row;
            case 1:
                return veiculo.getPlaca();
            case 2:
                return veiculo.getMarca();
            case 3:
                if (veiculo instanceof Automovel) {
                    return ((Automovel) veiculo).getModelo();
                }
                if (veiculo instanceof Motocicleta) {
                    return ((Motocicleta) veiculo).getModelo();
                }
                if (veiculo instanceof Van) {
                    return ((Van) veiculo).getModelo();
                }
                return null;
            case 4:
                return veiculo.getAno();
            case 5:
                return formatter.format(veiculo.getValorParaVenda());
            default:
                return null;
        }
    }

}

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
    
       private final String[] colunas = new String[]{"#", "Cliente", "Placa", "Marca", "Modelo", "Ano", "Data Locação", "Diária", "Dias", "Valor"};
       List<VeiculoAbstract> listaDeVeiculos = new ArrayList();
       private final NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
       private final SimpleDateFormat formatterData = new SimpleDateFormat("dd/MM/yyyy");
       
        @Override
    public int getRowCount() {
        return listaDeVeiculos.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public Object getValueAt(int row, int col) {
        VeiculoAbstract veiculo = listaDeVeiculos.get(row);
        switch (col) {
            case 0:
                return row;
            case 1: 
                return veiculo.getLocacao().getCliente().getNome();
            case 2:
                return veiculo.getPlaca();
            case 3:
                return veiculo.getMarca();
            case 4:
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
            case 5:
                return veiculo.getAno();
            case 6:
                return formatterData.format(veiculo.getLocacao().getData().getTime());
            case 7:
                return formatter.format(veiculo.getValorDiariaLocacao());
            case 8:
                return veiculo.getLocacao().getDias();
            case 9:
                return formatter.format((veiculo.getValorDiariaLocacao())*(veiculo.getLocacao().getDias()));
            default:
                return null;
        }
    }

       @Override
    public VeiculoAbstract getVeiculo(int linha) {
        return listaDeVeiculos.get(linha);
    }

       @Override
    public void addVeiculo(VeiculoAbstract veiculo) {
        this.listaDeVeiculos.add(veiculo);
        this.fireTableRowsInserted(listaDeVeiculos.size() - 1, listaDeVeiculos.size() - 1);
    }

       @Override
    public boolean removeVeiculo(int linha) {
        boolean result = this.listaDeVeiculos.remove(this.listaDeVeiculos.get(linha));
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }

       @Override
    public void refreshTabela(List<VeiculoAbstract> lista) {
        this.listaDeVeiculos = new ArrayList();
        this.listaDeVeiculos.addAll(lista);
        this.fireTableDataChanged();
    }
}
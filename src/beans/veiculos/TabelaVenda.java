package beans.veiculos;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class TabelaVenda extends VeiculosTabela {

    private final String[] colunas = new String[]{"#", "Placa", "Marca", "Modelo", "Ano", "Valor de venda"};
    List<VeiculoAbstract> listaDeVeiculos = new ArrayList();
    private final NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

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

    public VeiculoAbstract getVeiculo(int linha) {
        return listaDeVeiculos.get(linha);
    }

    public void addVeiculo(VeiculoAbstract veiculo) {
        this.listaDeVeiculos.add(veiculo);
        this.fireTableRowsInserted(listaDeVeiculos.size() - 1, listaDeVeiculos.size() - 1);
    }

    public boolean removeVeiculo(int linha) {
        boolean result = this.listaDeVeiculos.remove(this.listaDeVeiculos.get(linha));
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }

    public void refreshTabela(List<VeiculoAbstract> lista) {
        this.listaDeVeiculos = new ArrayList();
        this.listaDeVeiculos.addAll(lista);
        this.fireTableDataChanged();
    }

}

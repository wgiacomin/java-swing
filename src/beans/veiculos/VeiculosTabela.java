package beans.veiculos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VeiculosTabela extends AbstractTableModel {

private final String[] colunas = new String[]{"#", "Tipo", "Placa", "Marca", "Modelo", "Preço da diária", "Ano"};
    private List<VeiculoAbstract> listaDeVeiculos = new ArrayList();

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
                if (veiculo instanceof Automovel) { return "Automovel"; }
                if (veiculo instanceof Motocicleta) { return "Motocicleta"; }
                if (veiculo instanceof Van) { return "Van"; }
            case 2:
                return veiculo.getPlaca();
            case 3:
                return veiculo.getMarca();
            case 4:
                if (veiculo instanceof Automovel) { return((Automovel) veiculo).getModelo(); }
                if (veiculo instanceof Motocicleta) { return((Motocicleta) veiculo).getModelo(); }
                if (veiculo instanceof Van) { return((Van) veiculo).getModelo(); }
            case 5:
                return veiculo.getValorDiariaLocacao();
            case 6:
                return veiculo.getAno();
            default:
                return null;
        }
    }

    public VeiculoAbstract getCliente(int linha) {
        return listaDeVeiculos.get(linha);
    }

    public void addCliente(VeiculoAbstract veiculo) {
        this.listaDeVeiculos.add(veiculo);
        this.fireTableRowsInserted(listaDeVeiculos.size() - 1, listaDeVeiculos.size() - 1);
    }
    
    public boolean removeCliente(int linha){
        boolean result = this.listaDeVeiculos.remove(this.listaDeVeiculos.get(linha));
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }
    
    public void refreshTabela(List<VeiculoAbstract> lista){
        this.listaDeVeiculos = new ArrayList();
        this.listaDeVeiculos.addAll(lista);
        this.fireTableDataChanged();
    }
    
}

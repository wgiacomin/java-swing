package beans.cliente;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ClientesTabela extends AbstractTableModel {

    private final String[] colunas = new String[]{"#", "Nome", "Sobrenome", "RG", "CPF", "Endereço"};
    private List<Cliente> listaDeClientes = new ArrayList();

    @Override
    public int getRowCount() {
        return listaDeClientes.size();
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
        Cliente cliente = listaDeClientes.get(row);
        switch (col) {
            case 0:
                return row;
            case 1:
                return cliente.getNome();
            case 2:
                return cliente.getSobrenome();
            case 3:
                return cliente.getRg();
            case 4:
                return cliente.getCpf();
            case 5:
                return cliente.getEndereco();
            default:
                return null;
        }
    }

    public Cliente getCliente(int linha) {
        return listaDeClientes.get(linha);
    }

    public void addCliente(Cliente cliente) {
        this.listaDeClientes.add(cliente);
        this.fireTableRowsInserted(listaDeClientes.size() - 1, listaDeClientes.size() - 1);
    }
    
    public boolean removeCliente(int linha){
        if (this.listaDeClientes.get(linha).getVeiculosLocados() > 0){
            return false;
        }
        boolean result = this.listaDeClientes.remove(this.listaDeClientes.get(linha));
        this.fireTableRowsDeleted(linha, linha);
        return result;
    }
    
    public void refreshTabela(List<Cliente> lista){
        this.listaDeClientes = new ArrayList();
        this.listaDeClientes.addAll(lista);
        this.fireTableDataChanged();
    }
}

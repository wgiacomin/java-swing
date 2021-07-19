package projetofinal.cliente;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ClientesTabela extends AbstractTableModel {

    private final String[] colunas = new String[]{"id", "Nome", "Sobrenome", "RG", "CPF", "Endereço"};
    private List<Cliente> lista = new ArrayList();

    @Override
    public int getRowCount() {
        return 100;
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
        return 1;
    }
}

package views;

import beans.veiculos.VeiculoAbstract;
import beans.veiculos.VeiculosTabela;
import java.util.List;


public class LocarVeiculo extends javax.swing.JInternalFrame {
    private VeiculosTabela veiculosTabela = new VeiculosTabela();
    
    public LocarVeiculo(List<VeiculoAbstract> veiculosTabela) {
        initComponents();
        TabelaLocacao.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.veiculosTabela.refreshTabela(veiculosTabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLocacao = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        TabelaLocacao.setModel(veiculosTabela);
        jScrollPane1.setViewportView(TabelaLocacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaLocacao;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

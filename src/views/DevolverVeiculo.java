package views;

import beans.cliente.Cliente;
import beans.veiculos.Automovel;
import beans.veiculos.Motocicleta;
import beans.veiculos.Van;
import beans.veiculos.VeiculoAbstract;
import beans.veiculos.VeiculosLocados;
import beans.veiculos.VeiculosTabela;
import views.LocarVeiculo;
import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.veiculos.atributos.Tipo;
import beans.veiculos.VeiculosTabela;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class DevolverVeiculo extends javax.swing.JInternalFrame {

    private VeiculosLocados veiculosLocados = new VeiculosLocados();
    private final List<Cliente> listaDeClientes;
    private List<VeiculoAbstract> listaDeVeiculos;
    private int linhaAtual = -1;
    
    public DevolverVeiculo(List<VeiculoAbstract> listaDeVeiculos, List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
        this.listaDeVeiculos = listaDeVeiculos;
        
        initComponents();
        TabelaExibe.getColumnModel().getColumn(0).setPreferredWidth(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaExibe = new javax.swing.JTable();
        botaoListar = new javax.swing.JButton();
        botaoDevolver = new javax.swing.JButton();

        setClosable(true);

        TabelaExibe.setModel(veiculosLocados);
        TabelaExibe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaExibe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaExibeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaExibe);

        botaoListar.setText("Listar Veiculos");
        botaoListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoListarMouseClicked(evt);
            }
        });

        botaoDevolver.setText("Devolver Veiculo");
        botaoDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoDevolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(botaoListar)
                .addGap(62, 62, 62)
                .addComponent(botaoDevolver)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListar)
                    .addComponent(botaoDevolver))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoListarMouseClicked
        if(listaDeVeiculos.isEmpty()){
            Dialog.main("Nenhum veículo locado!");
        }else
            veiculosLocados.refreshTabela(listaDeVeiculos);
    }//GEN-LAST:event_botaoListarMouseClicked

    private void TabelaExibeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaExibeMousePressed
        linhaAtual = TabelaExibe.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TabelaExibeMousePressed

    private void botaoDevolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDevolverMouseClicked
        if (linhaAtual != -1) {
            Object[] opcoes = {"Sim", "Não"};
            Object defaultChoice = opcoes[1];
            int input = JOptionPane.showOptionDialog(null, 
                    "Tem certeza que deseja devolver o veículo selecionado?", 
                    "Atenção!", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    opcoes, 
                    defaultChoice);
            if (input == 0) {
                VeiculoAbstract locado = veiculosLocados.getVeiculo(linhaAtual);
                if (veiculosLocados.removeVeiculo(linhaAtual)) {
                    locado.devolver();
                    Dialog.main("Veiculo devolvido!");
                } else {
                    Dialog.main("Erro ao devolver o veículo!");
                }
            }
        } else {
            Dialog.main("Nenhum objeto selecionado!");
        }
    }//GEN-LAST:event_botaoDevolverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaExibe;
    private javax.swing.JButton botaoDevolver;
    private javax.swing.JButton botaoListar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}

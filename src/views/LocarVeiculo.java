package views;

import beans.cliente.Cliente;
import beans.veiculos.Automovel;
import beans.veiculos.Motocicleta;
import beans.veiculos.Van;
import beans.veiculos.VeiculoAbstract;
import beans.veiculos.VeiculosTabela;
import beans.veiculos.VeiculosLocados;
import beans.veiculos.atributos.Categoria;
import beans.veiculos.atributos.Estado;
import beans.veiculos.atributos.Marca;
import beans.veiculos.atributos.Tipo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class LocarVeiculo extends javax.swing.JInternalFrame {

    private VeiculosTabela veiculosTabela = new VeiculosTabela();
    private VeiculosLocados veiculosLocados = new VeiculosLocados();
    private final List<Cliente> listaDeClientes;
    private List<VeiculoAbstract> listaDeVeiculos;
    private DefaultComboBoxModel cpf = new DefaultComboBoxModel();
    private DefaultComboBoxModel nome = new DefaultComboBoxModel();
    private DefaultComboBoxModel sobrenome = new DefaultComboBoxModel();
    private int linhaAtual = -1;

    public LocarVeiculo(List<VeiculoAbstract> listaDeVeiculos, List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
        this.listaDeVeiculos = listaDeVeiculos;

        listaDeClientes.forEach(e -> {
            cpf.addElement(e.getCpf());
            nome.addElement(e.getNome());
            sobrenome.addElement(e.getSobrenome());
        }
        );

        initComponents();
        TabelaLocacao.getColumnModel().getColumn(0).setPreferredWidth(20);
        gerarNovosResultados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLocacao = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        filtroNome = new javax.swing.JComboBox<>();
        filtroSobrenome = new javax.swing.JComboBox<>();
        filtroCpf = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        filtroTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        filtroMarca = new javax.swing.JComboBox<>();
        filtroMarcaIncluir = new javax.swing.JCheckBox();
        filtroTipoIncluir = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        filtroCategoria = new javax.swing.JComboBox<>();
        filtroCategoriaIncluir = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        boxDias = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxData = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        selectedRow = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        botaoLocar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Locar Veículo");

        TabelaLocacao.setModel(veiculosTabela);
        TabelaLocacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaLocacaoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaLocacao);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        filtroNome.setModel(nome);
        filtroNome.setSelectedItem(null);
        filtroNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroNomeItemStateChanged(evt);
            }
        });

        filtroSobrenome.setModel(sobrenome);
        filtroSobrenome.setSelectedItem(null);
        filtroSobrenome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroSobrenomeItemStateChanged(evt);
            }
        });

        filtroCpf.setModel(cpf);
        filtroCpf.setSelectedItem(null);
        filtroCpf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroCpfItemStateChanged(evt);
            }
        });

        jLabel1.setLabelFor(filtroNome);
        jLabel1.setText("Nome:");

        jLabel2.setLabelFor(filtroSobrenome);
        jLabel2.setText("Sobrenome:");

        jLabel3.setLabelFor(filtroCpf);
        jLabel3.setText("CPF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtroNome, 0, 264, Short.MAX_VALUE)
                    .addComponent(filtroSobrenome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filtroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar Veículo"));

        filtroTipo.setModel(new DefaultComboBoxModel(beans.veiculos.atributos.Tipo.values()));
        filtroTipo.setSelectedItem(null);
        filtroTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroTipoItemStateChanged(evt);
            }
        });

        jLabel4.setLabelFor(filtroTipo);
        jLabel4.setText("Tipo:");

        filtroMarca.setModel(new DefaultComboBoxModel(beans.veiculos.atributos.Marca.values()));
        filtroMarca.setSelectedItem(null);
        filtroMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroMarcaItemStateChanged(evt);
            }
        });

        filtroMarcaIncluir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroMarcaIncluirItemStateChanged(evt);
            }
        });

        filtroTipoIncluir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroTipoIncluirItemStateChanged(evt);
            }
        });

        jLabel5.setText("Marca:");

        filtroCategoria.setModel(new DefaultComboBoxModel(beans.veiculos.atributos.Categoria.values()));
        filtroCategoria.setSelectedItem(null);
        filtroCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroCategoriaItemStateChanged(evt);
            }
        });

        filtroCategoriaIncluir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroCategoriaIncluirItemStateChanged(evt);
            }
        });

        jLabel6.setText("Categoria:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtroCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroTipoIncluir)
                    .addComponent(filtroMarcaIncluir)
                    .addComponent(filtroCategoriaIncluir))
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(filtroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(filtroTipoIncluir))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filtroMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(filtroMarcaIncluir))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(filtroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(filtroCategoriaIncluir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        boxDias.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        boxDias.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setLabelFor(boxDias);
        jLabel7.setText("Qtde. de dias:");

        jLabel8.setText("dias.");

        try {
            boxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**********")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boxData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                boxDataFocusLost(evt);
            }
        });

        jLabel9.setLabelFor(boxData);
        jLabel9.setText("Data:");

        jLabel11.setText("Veículo selecionado:");

        botaoLocar.setText("Locar");
        botaoLocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoLocarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxDias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(selectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botaoLocar)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(boxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(boxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(selectedRow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(botaoLocar))
                .addGap(45, 45, 45))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtroTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroTipoItemStateChanged
        filtroTipoIncluir.setSelected(true);
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroTipoItemStateChanged

    private void filtroTipoIncluirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroTipoIncluirItemStateChanged
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroTipoIncluirItemStateChanged

    private void filtroMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroMarcaItemStateChanged
        filtroMarcaIncluir.setSelected(true);
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroMarcaItemStateChanged

    private void filtroMarcaIncluirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroMarcaIncluirItemStateChanged
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroMarcaIncluirItemStateChanged

    private void filtroCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroCategoriaItemStateChanged
        this.filtroCategoriaIncluir.setSelected(true);
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroCategoriaItemStateChanged

    private void filtroCategoriaIncluirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroCategoriaIncluirItemStateChanged
        this.gerarNovosResultados();
    }//GEN-LAST:event_filtroCategoriaIncluirItemStateChanged

    private void filtroNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroNomeItemStateChanged
        filtroSobrenome.setSelectedIndex(filtroNome.getSelectedIndex());
        filtroCpf.setSelectedIndex(filtroNome.getSelectedIndex());
    }//GEN-LAST:event_filtroNomeItemStateChanged

    private void filtroSobrenomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroSobrenomeItemStateChanged
        filtroNome.setSelectedIndex(filtroSobrenome.getSelectedIndex());
        filtroCpf.setSelectedIndex(filtroSobrenome.getSelectedIndex());
    }//GEN-LAST:event_filtroSobrenomeItemStateChanged

    private void filtroCpfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroCpfItemStateChanged
        filtroNome.setSelectedIndex(filtroCpf.getSelectedIndex());
        filtroSobrenome.setSelectedIndex(filtroCpf.getSelectedIndex());
    }//GEN-LAST:event_filtroCpfItemStateChanged

    private void TabelaLocacaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaLocacaoMousePressed
        linhaAtual = TabelaLocacao.rowAtPoint(evt.getPoint());
        if (linhaAtual != -1) {
            selectedRow.setText(String.valueOf(linhaAtual));
        }
    }//GEN-LAST:event_TabelaLocacaoMousePressed

    private void botaoLocarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLocarMouseReleased
        try {
            if (filtroCpf.getSelectedIndex() < 0 || filtroNome.getSelectedIndex() < 0 || filtroSobrenome.getSelectedIndex() < 0) {
                Dialog.main("O locatário não foi selecionado.");
                return;
            }

            if (boxDias.getText().isEmpty() || boxData.getText().isEmpty()) {
                Dialog.main("Verifique se todos os dados foram preenchidos.");
                return;
            }

            if (linhaAtual < 0) {
                Dialog.main("O veículo não foi selecionado");
                return;
            }

            VeiculoAbstract veiculo = veiculosTabela.getVeiculo(linhaAtual);
            int dias = Integer.parseInt(boxDias.getText());
            Calendar data = Calendar.getInstance();
            data.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(boxData.getText()));
            Cliente cliente = listaDeClientes.get(filtroNome.getSelectedIndex());
            veiculo.locar(dias, data, cliente);
            veiculosLocados.addVeiculo(veiculo);
            this.gerarNovosResultados();
            Dialog.main("O veículo de placa " + veiculo.getPlaca() + " foi reservado com sucesso para o cliente!");
        } catch (ParseException ex) {
            Dialog.main("Verifique se algum campo se encontra inválido.");
        }
    }//GEN-LAST:event_botaoLocarMouseReleased

    private void boxDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_boxDataFocusLost
        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        if (boxData.getText().matches(pattern)) {
            return;
        }
        boxData.setText("");
    }//GEN-LAST:event_boxDataFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaLocacao;
    private javax.swing.JButton botaoLocar;
    private javax.swing.JFormattedTextField boxData;
    private javax.swing.JFormattedTextField boxDias;
    private javax.swing.JComboBox<String> filtroCategoria;
    private javax.swing.JCheckBox filtroCategoriaIncluir;
    private javax.swing.JComboBox<String> filtroCpf;
    private javax.swing.JComboBox<String> filtroMarca;
    private javax.swing.JCheckBox filtroMarcaIncluir;
    private javax.swing.JComboBox<String> filtroNome;
    private javax.swing.JComboBox<String> filtroSobrenome;
    private javax.swing.JComboBox<String> filtroTipo;
    private javax.swing.JCheckBox filtroTipoIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectedRow;
    // End of variables declaration//GEN-END:variables

    private void gerarNovosResultados() {
        Iterator<VeiculoAbstract> i;
        List<VeiculoAbstract> veiculosFiltrados = new ArrayList<>();

        listaDeVeiculos.forEach(e -> {
            if (e.getEstado() == (Estado) Estado.DISPONIVEL) {
                veiculosFiltrados.add(e);
            }
        });

        if (filtroTipoIncluir.isSelected() && filtroTipo.getSelectedIndex() > -1) {
            i = veiculosFiltrados.iterator();
            while (i.hasNext()) {
                VeiculoAbstract veiculo = i.next();
                switch ((Tipo) filtroTipo.getSelectedItem()) {
                    case AUTOMOVEL:
                        if (!(veiculo instanceof Automovel)) {
                            i.remove();
                        }
                        break;
                    case MOTOCICLETA:
                        if (!(veiculo instanceof Motocicleta)) {
                            i.remove();
                        }
                        break;
                    case VAN:
                        if (!(veiculo instanceof Van)) {
                            i.remove();
                        }
                        break;
                }
            }
        }

        if (filtroMarcaIncluir.isSelected() && filtroMarca.getSelectedIndex() > -1) {
            i = veiculosFiltrados.iterator();
            while (i.hasNext()) {
                VeiculoAbstract veiculo = i.next();
                if (veiculo.getMarca() != (Marca) filtroMarca.getSelectedItem()) {
                    i.remove();
                }
            }
        }

        if (filtroCategoriaIncluir.isSelected() && filtroCategoria.getSelectedIndex() > -1) {
            i = veiculosFiltrados.iterator();
            while (i.hasNext()) {
                VeiculoAbstract veiculo = i.next();
                if (veiculo.getCategoria() != (Categoria) filtroCategoria.getSelectedItem()) {
                    i.remove();
                }
            }
        }

        this.veiculosTabela.refreshTabela(veiculosFiltrados);
        selectedRow.setText("");
        linhaAtual = -1;
    }

}

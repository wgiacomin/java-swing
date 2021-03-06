package views;

import views.Dialog;
import beans.cliente.ClientesTabela;
import beans.cliente.Cliente;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteManter extends javax.swing.JInternalFrame {

    private List<Cliente> listaDeClientes;
    private ClientesTabela clientesTabela = new ClientesTabela();
    private final String letras = "[^a-zA-Z]";
    private final String letrasEEspaco = "[^a-zA-Z ']";
    private final String numeros = "[^0-9]";
    private final String alfanumeric = "[^0-9a-zA-Z\\,\\.' ]";
    private int linhaAtual = -1;

    public ClienteManter(List<Cliente> listaDeClientes) {
        initComponents();
        TabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(10);
        this.listaDeClientes = listaDeClientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sobrenome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idNumber = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        cpf = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Clientes");

        TabelaClientes.setModel(clientesTabela);
        TabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabelaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabelaClientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaClientes);

        nome.setName(""); // NOI18N
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        jLabel1.setLabelFor(nome);
        jLabel1.setText("Nome:");

        sobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sobrenomeKeyReleased(evt);
            }
        });

        rg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rgKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rgKeyReleased(evt);
            }
        });

        endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enderecoKeyReleased(evt);
            }
        });

        jLabel2.setLabelFor(sobrenome);
        jLabel2.setText("Sobrenome:");

        jLabel3.setLabelFor(rg);
        jLabel3.setText("RG:");

        jLabel4.setLabelFor(cpf);
        jLabel4.setText("CPF:");

        jLabel5.setLabelFor(endereco);
        jLabel5.setText("Endere??o");

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setActionCommand("");
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseReleased(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.setActionCommand("");
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoEditarMousePressed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseReleased(evt);
            }
        });

        jLabel6.setText("As a????es abaixo ser??o aplicadas a linha:");

        idNumber.setText(" ");
        idNumber.setActionCommand("");
        idNumber.setOpaque(true);

        botaoListar.setText("Listar");
        botaoListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoListarMouseReleased(evt);
            }
        });

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###'.###'.###'-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(endereco)
                                .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rg)
                                .addComponent(cpf)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idNumber))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nome.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMousePressed
        linhaAtual = TabelaClientes.rowAtPoint(evt.getPoint());
        if (linhaAtual != -1) {
            idNumber.setText(String.valueOf(linhaAtual));
            Cliente cliente = clientesTabela.getCliente(linhaAtual);
            sobrenome.setText(cliente.getSobrenome());
            nome.setText(cliente.getNome());
            cpf.setText(cliente.getCpf());
            rg.setText(cliente.getRg());
            endereco.setText(cliente.getEndereco());
        }
    }//GEN-LAST:event_TabelaClientesMousePressed

    private void botaoAdicionarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAdicionarMouseReleased
        String c_nome = this.nome.getText();
        String c_endereco = this.endereco.getText();
        String c_cpf = this.cpf.getText();
        String c_rg = this.rg.getText();
        String c_sobrenome = this.sobrenome.getText();
        if (c_nome.isEmpty() || c_endereco.isEmpty() || c_cpf.replaceAll("\\D+", "").isEmpty() || c_rg.isEmpty() || c_sobrenome.isEmpty()) {
            Dialog.main("Um ou mais campos enocontram-se vazios.");
        } else {
            Cliente cliente = new Cliente(c_nome, c_sobrenome, c_rg, c_cpf, c_endereco);
            listaDeClientes.add(cliente);
            clientesTabela.addCliente(cliente);
            this.nome.setText("");
            this.endereco.setText("");
            this.cpf.setText("");
            this.rg.setText("");
            this.sobrenome.setText("");
            Dialog.main("O cliente foi cadastrado com sucesso!");
        }
    }//GEN-LAST:event_botaoAdicionarMouseReleased

    private void botaoRemoverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseReleased
        if (linhaAtual != -1) {
            Object[] opcoes = {"Sim", "N??o"};
            Object defaultChoice = opcoes[1];
            int input = JOptionPane.showOptionDialog(null, 
                    "Tem certeza que deseja remover o cliente selecionado?", 
                    "Aten????o!", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    opcoes, 
                    defaultChoice);
            if (input == 0) {
                if (clientesTabela.removeCliente(linhaAtual)) {
                    this.nome.setText("");
                    this.endereco.setText("");
                    this.cpf.setText("");
                    this.rg.setText("");
                    this.sobrenome.setText("");
                } else {
                    Dialog.main("Erro ao apagar! Verifique se o cliente n??o possui ve??culos locados.");
                }
            }
        } else {
            Dialog.main("Nenhum objeto selecionado!");
        }
    }//GEN-LAST:event_botaoRemoverMouseReleased

    private void enderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoKeyReleased
        endereco.setText(endereco.getText().replaceAll(alfanumeric, ""));
    }//GEN-LAST:event_enderecoKeyReleased

    private void botaoListarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoListarMouseReleased
        clientesTabela.refreshTabela(listaDeClientes);
    }//GEN-LAST:event_botaoListarMouseReleased

    private void sobrenomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sobrenomeKeyReleased
        sobrenome.setText(sobrenome.getText().replaceAll(letrasEEspaco, ""));
    }//GEN-LAST:event_sobrenomeKeyReleased

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        nome.setText(nome.getText().replaceAll(letras, ""));
    }//GEN-LAST:event_nomeKeyReleased

    private void rgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyReleased
        rg.setText(rg.getText().replaceAll(numeros, ""));
    }//GEN-LAST:event_rgKeyReleased

    private void rgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyPressed
        if (rg.getText().length() >= 14) {
            rg.setText(rg.getText().substring(0, 13));
        }
    }//GEN-LAST:event_rgKeyPressed

    private void botaoEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMousePressed
        if (linhaAtual != -1) {
            String c_nome = this.nome.getText();
            String c_endereco = this.endereco.getText();
            String c_cpf = this.cpf.getText();
            String c_rg = this.rg.getText();
            String c_sobrenome = this.sobrenome.getText();
            Cliente cliente = clientesTabela.getCliente(linhaAtual);
            if (c_nome.isEmpty() || c_endereco.isEmpty() || c_cpf.isEmpty() || c_rg.isEmpty() || c_sobrenome.isEmpty()) {
                Dialog.main("Um ou mais campos enocontram-se inv??lidos.");
            } else {
                cliente.setCpf(c_cpf);
                cliente.setRg(c_rg);
                cliente.setNome(c_nome);
                cliente.setSobrenome(c_sobrenome);
                cliente.setEndereco(c_endereco);
                clientesTabela.fireTableRowsUpdated(linhaAtual, linhaAtual);
                Dialog.main("Cliente editado com sucesso!");
            }
        } else {
            Dialog.main("A linha selecionada n??o ?? v??lida.");
        }

    }//GEN-LAST:event_botaoEditarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton idNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField sobrenome;
    // End of variables declaration//GEN-END:variables
}

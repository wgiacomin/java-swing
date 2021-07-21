package projetofinal.cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteManter extends javax.swing.JInternalFrame {
    private List<Cliente> listaDeClientes;
    private final ClientesTabela clientesTabela = new ClientesTabela();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sobrenome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
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

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Clientes");

        TabelaClientes.setAutoCreateRowSorter(true);
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

        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfKeyReleased(evt);
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
        jLabel5.setText("Endereço");

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setActionCommand("");
        botaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoAdicionarMouseReleased(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.setActionCommand("");

        botaoRemover.setText("Remover");
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseReleased(evt);
            }
        });

        jLabel6.setText("As ações abaixo serão aplicadas a linha:");

        idNumber.setText(" ");
        idNumber.setActionCommand("");
        idNumber.setOpaque(true);

        botaoListar.setText("Listar");
        botaoListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoListarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(196, 196, 196))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(endereco)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
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
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idNumber))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        nome.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaClientesMousePressed
        linhaAtual = TabelaClientes.rowAtPoint(evt.getPoint());
        if (linhaAtual != -1) {
            idNumber.setText(String.valueOf(linhaAtual));
            Cliente cliente = clientesTabela.getCliente(linhaAtual);
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
        Cliente cliente = new Cliente(c_nome, c_sobrenome, c_rg, c_cpf, c_endereco);
        listaDeClientes.add(cliente);
        clientesTabela.addCliente(cliente);
    }//GEN-LAST:event_botaoAdicionarMouseReleased

    private void botaoRemoverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseReleased
        if (linhaAtual != -1) {
            clientesTabela.removeCliente(linhaAtual);
        } else {
            DeleteError.main("ixi");
        }
    }//GEN-LAST:event_botaoRemoverMouseReleased

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        nome.setText(nome.getText().replaceAll(letras, ""));
    }//GEN-LAST:event_nomeKeyReleased

    private void sobrenomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sobrenomeKeyReleased
        sobrenome.setText(sobrenome.getText().replaceAll(letrasEEspaco, ""));
    }//GEN-LAST:event_sobrenomeKeyReleased

    private void rgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyReleased
        rg.setText(rg.getText().replaceAll(numeros, ""));
    }//GEN-LAST:event_rgKeyReleased

    private void cpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyReleased
        cpf.setText(cpf.getText().replaceAll(numeros, ""));
        cpf.setText(cpf.getText().replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4"));
        if (cpf.getText().length() > 14) {
            cpf.setText(cpf.getText().substring(0, 14));
        }
    }//GEN-LAST:event_cpfKeyReleased

    private void enderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoKeyReleased
        endereco.setText(endereco.getText().replaceAll(alfanumeric, ""));
    }//GEN-LAST:event_enderecoKeyReleased

    private void cpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyPressed
        if (cpf.getText().length() >= 14) {
            cpf.setText(cpf.getText().substring(0, 13));
        }
    }//GEN-LAST:event_cpfKeyPressed

    private void rgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rgKeyPressed
        if (rg.getText().length() >= 14) {
            rg.setText(rg.getText().substring(0, 13));
        }
    }//GEN-LAST:event_rgKeyPressed

    private void botaoListarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoListarMouseReleased
        clientesTabela.refreshTabela(listaDeClientes);
    }//GEN-LAST:event_botaoListarMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton idNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField sobrenome;
    // End of variables declaration//GEN-END:variables
}

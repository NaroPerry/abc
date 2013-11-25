/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lojadecalcados.view;

import br.com.lojadecalcados.controller.ClienteController;
import br.com.lojadecalcados.controller.EnderecoController;
import br.com.lojadecalcados.controller.FuncionarioController;
import br.com.lojadecalcados.model.Cliente;
import br.com.lojadecalcados.model.Endereco;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class ClienteInserirGUI extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    public ClienteInserirGUI(DefaultTableModel modelo) {
        super("Herp Derp Calçados");
        this.modelo = modelo;
        initComponents();

    }

    public ClienteInserirGUI(DefaultTableModel modelo, int linhaSelecionada, int idCliente) {
        super("Herp Derp Calçados"); 
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        initComponents();

        ClienteController fc = new ClienteController();
        Cliente f = fc.listById(idCliente);
        txId.setText(Integer.toString(f.getId()));
        txNome.setText(f.getNome());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(f.getDataNascimento());
        txData_Nascimento.setText(data);
        txCpf.setText(f.getCpf());
        txRg.setText(f.getRg());
        if (f.getSexo().equals("Feminino")) {
            rbFeminino.setSelected(true);
        } else if (f.getSexo().equals("Masculino")) {
            rbMasculino.setSelected(true);
        }
        txTelefone.setText(f.getFoneContato());
        txProfissao.setText((f.getProfissao()));
        txNomeEmpresa.setText(f.getNomeTrabalho());

        txIdEndereco.setText(Integer.toString(f.getEndereco().getId()));
        txRua.setText(f.getEndereco().getRua());
        txNumero.setText(Integer.toString(f.getEndereco().getNumero()));
        txBairro.setText(f.getEndereco().getBairro());
        txCidade.setText(f.getEndereco().getCidade());
        txEstado.setText(f.getEndereco().getEstado());
        txCep.setText(f.getEndereco().getCep());
        txComplemento.setText(f.getEndereco().getComplemento());



    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        txNome = new javax.swing.JTextField();
        txData_Nascimento = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txRg = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txProfissao = new javax.swing.JTextField();
        txNomeEmpresa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txIdEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txRua = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txEstado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txCep = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txNumero = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txComplemento = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Clientes", 0, 0, new java.awt.Font("Arial", 2, 18))); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("Data de Nascimento:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("CPF:");

        jLabel6.setText("RG:");

        jLabel7.setText("Pofissão:");

        jLabel8.setText("Nome da Empresa:");

        rbMasculino.setBackground(new java.awt.Color(204, 204, 204));
        grupoSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(new java.awt.Color(204, 204, 204));
        grupoSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel9.setText("Endereco:");

        txIdEndereco.setEditable(false);

        jLabel10.setText("Rua:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Cidade:");

        jLabel13.setText("Estado:");

        txEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEstadoActionPerformed(evt);
            }
        });

        jLabel14.setText("CEP:");

        txCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCepActionPerformed(evt);
            }
        });

        jLabel15.setText("Número:");

        txNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNumeroActionPerformed(evt);
            }
        });

        jLabel16.setText("Complemento:");

        txComplemento.setColumns(20);
        txComplemento.setRows(5);
        jScrollPane1.setViewportView(txComplemento);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btSalvar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btLimpar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel17.setText("Código Cliente:");

        txId.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNome)
                                    .addComponent(txProfissao)
                                    .addComponent(txNomeEmpresa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(83, 83, 83)
                                                .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbMasculino)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbFeminino))
                                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(600, 600, 600)
                                .addComponent(btSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar))
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(18, 18, 18)
                                            .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel14)
                                                .addGap(18, 18, 18)
                                                .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txData_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(483, 483, 483)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))))
                                .addGap(18, 18, 18)
                                .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txData_Nascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void txNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNumeroActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Endereco en = new Endereco();
        Cliente c = new Cliente();
        if (!(txId.getText().equals(""))
                || (txId.getText().equals(null))) {
            c.setId(Integer.parseInt(txId.getText()));
        }
        c.setNome(txNome.getText());
        try {
            String data = txData_Nascimento.getText();
            c.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro"
                    + " ao converter a data");
        }
        c.setCpf(txCpf.getText());
        c.setRg(txRg.getText());
        if (rbMasculino.isSelected()) {
            c.setSexo("Masculino");
        } else if (rbFeminino.isSelected()) {
            c.setSexo("Feminino");
        }
        c.setFoneContato(txTelefone.getText());
        c.setProfissao((txProfissao.getText()));
        c.setNomeTrabalho(txNomeEmpresa.getText());

        if (!(txIdEndereco.getText().equals(""))
                || (txIdEndereco.getText().equals(null))) {
            en.setId(Integer.parseInt(txIdEndereco.getText()));
        }
        en.setRua(txRua.getText());
        en.setNumero(Integer.parseInt(txNumero.getText()));
        en.setBairro(txBairro.getText());
        en.setCidade(txCidade.getText());
        en.setEstado(txEstado.getText());
        en.setCep(txCep.getText());
        en.setComplemento(txComplemento.getText());
        EnderecoController ec = new EnderecoController();
        en.setId(ec.salvar(en));
        c.setEndereco(en);
        ClienteController fc = new ClienteController();
        if (c.getId() == 0) {
            int id = fc.salvar(c);
            if (id > 0) {
                modelo.addRow(new Object[]{id,
                    c.getNome(),
                    c.getDataNascimento(),
                    c.getRg(),
                    c.getCpf()});
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com "
                        + "sucesso");
            }
        } else {
            int id = fc.salvar(c);
            if (id > 0) {
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{c.getId(),
                    c.getNome(),
                    c.getDataNascimento(),
                    c.getRg(),
                    c.getCpf()
                });
                JOptionPane.showMessageDialog(null, "Cliente "
                        + "atualizado com sucesso");
            }
        }

        dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEstadoActionPerformed

    private void txCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCepActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txId.setText("");
        txNome.setText("");
        txData_Nascimento.setText("");
        txCpf.setText("");
        txRg.setText("");
        grupoSexo.clearSelection();
        txTelefone.setText("");
        txCpf.setText("");
        txRg.setText("");
        txRua.setText("");
        txNumero.setText("");
        txBairro.setText("");
        txCidade.setText("");
        txEstado.setText("");
        txCep.setText("");
        txComplemento.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextArea txComplemento;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txData_Nascimento;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNomeEmpresa;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txProfissao;
    private javax.swing.JTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}

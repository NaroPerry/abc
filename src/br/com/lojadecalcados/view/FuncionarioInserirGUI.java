/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lojadecalcados.view;

import br.com.lojadecalcados.controller.EnderecoController;
import br.com.lojadecalcados.controller.FuncionarioController;
import br.com.lojadecalcados.model.Endereco;
import br.com.lojadecalcados.model.Funcionario;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionarioInserirGUI extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int linhaSelecionada;

    public FuncionarioInserirGUI(DefaultTableModel modelo) {
        super("Herp Derp Calçados");
        this.modelo = modelo;
        initComponents();
    }

    public FuncionarioInserirGUI(DefaultTableModel modelo, int linhaSelecionada, int idFuncionario) {
        super("Herp Derp Calçados"); 
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        initComponents();

        FuncionarioController fc = new FuncionarioController();
        Funcionario f = fc.listById(idFuncionario);
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
        txSalario.setText(Double.toString(f.getSalario()));
        txCargo.setText(f.getCargo());
        txCarteiraTrabalho.setText(f.getCarteiraTrabalho());
        txLogin.setText(f.getLogin());
        txSenha.setText(f.getSenha());

        txIdEndereco.setText(Integer.toString(f.getEndereco().getId()));
        txRua.setText(f.getEndereco().getRua());
        txNumero.setText(Integer.toString(f.getEndereco().getNumero()));
        txBairro.setText(f.getEndereco().getBairro());
        txCidade.setText(f.getEndereco().getCidade());
        txEstado.setText(f.getEndereco().getEstado());
        txCep.setText(f.getEndereco().getCep());
        txComplemento.setText(f.getEndereco().getComplemento());



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txData_Nascimento = new javax.swing.JTextField();
        txId = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txTelefone = new javax.swing.JTextField();
        txCarteiraTrabalho = new javax.swing.JTextField();
        txRg = new javax.swing.JTextField();
        txSalario = new javax.swing.JTextField();
        txCargo = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txComplemento = new javax.swing.JTextArea();
        txRua = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txEstado = new javax.swing.JTextField();
        txCep = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        txSenha = new javax.swing.JPasswordField();
        txNome = new javax.swing.JTextField();
        txIdEndereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(204, 204, 204));
        painelFundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 18))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de Nascimento:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Cargo:");

        jLabel7.setText("Carteira de Trabalho:");

        jLabel8.setText("RG:");

        jLabel9.setText("RG:");

        jLabel16.setText("Telefone:");

        jLabel17.setText("Salário:");

        jLabel10.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel10.setText("Endereço:");

        jLabel11.setText("Rua:");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Cidade:");

        jLabel14.setText("Estado:");

        jLabel15.setText("CEP:");

        jLabel18.setText("Complemento:");

        jLabel19.setText("Número:");

        txId.setEditable(false);
        txId.setBackground(new java.awt.Color(255, 255, 255));

        txCarteiraTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCarteiraTrabalhoActionPerformed(evt);
            }
        });

        txSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSalarioActionPerformed(evt);
            }
        });

        rbMasculino.setBackground(new java.awt.Color(204, 204, 204));
        grupoSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(new java.awt.Color(204, 204, 204));
        grupoSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        txComplemento.setColumns(20);
        txComplemento.setRows(5);
        jScrollPane1.setViewportView(txComplemento);

        txRua.setAlignmentX(10.0F);

        btSalvar.setBackground(new java.awt.Color(204, 204, 204));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btSalvar.setToolTipText("Salvar");
        btSalvar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(204, 204, 204));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpar.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        btLimpar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel21.setText("Login:");

        jLabel22.setText("Senha:");

        txIdEndereco.setEditable(false);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel8))
                            .addComponent(jLabel4)
                            .addComponent(jLabel16)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txLogin)
                                    .addComponent(txTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txCarteiraTrabalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txData_Nascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(rbMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbFeminino))
                                    .addComponent(txRg)
                                    .addComponent(txSalario)
                                    .addComponent(txCargo)
                                    .addComponent(txSenha))
                                .addGap(29, 29, 29))))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(55, 55, 55)
                                        .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFundoLayout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(50, 50, 50)
                                            .addComponent(txCidade))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFundoLayout.createSequentialGroup()
                                            .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painelFundoLayout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(50, 50, 50)
                                                    .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel15))
                                                .addGroup(painelFundoLayout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(5, 5, 5)
                                                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(painelFundoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(85, 85, 85)
                                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txData_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbMasculino)
                            .addComponent(rbFeminino))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(15, 15, 15)
                                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txIdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19)
                            .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar)))
        );

        getContentPane().add(painelFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSalarioActionPerformed

    private void txCarteiraTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCarteiraTrabalhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCarteiraTrabalhoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Endereco en = new Endereco();
        Funcionario f = new Funcionario();
        if (!(txId.getText().equals(""))
                || (txId.getText().equals(null))) {
            f.setId(Integer.parseInt(txId.getText()));
        }
        f.setNome(txNome.getText());
        try {
            String data = txData_Nascimento.getText();
            f.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(data));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro"
                    + " ao converter a data");
        }
        f.setCpf(txCpf.getText());
        f.setRg(txRg.getText());
        if (rbMasculino.isSelected()) {
            f.setSexo("Masculino");
        } else if (rbFeminino.isSelected()) {
            f.setSexo("Feminino");
        }
        f.setFoneContato(txTelefone.getText());
        f.setSalario(Double.parseDouble(txSalario.getText()));
        f.setCargo(txCargo.getText());
        f.setCarteiraTrabalho(txCarteiraTrabalho.getText());
        f.setLogin(txLogin.getText());
        f.setSenha(txSenha.getText());

        
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
        f.setEndereco(en);
        FuncionarioController fc = new FuncionarioController();
        if (f.getId() == 0) {
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.addRow(new Object[]{id,
                    f.getNome(),
                    f.getDataNascimento(),
                    f.getCargo(),
                    f.getSalario()});
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com "
                    + "sucesso");
            }
        } else {
            int id = fc.salvar(f);
            if (id > 0) {
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{f.getId(),
                    f.getNome(),
                    f.getDataNascimento(),
                    f.getCargo(),
                    f.getSalario()
                    });
                JOptionPane.showMessageDialog(null, "Usuário "
                        + "atualizado com sucesso");
            }
        }

        dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txId.setText("");
        txNome.setText("");
        txData_Nascimento.setText("");
        txCpf.setText("");
        txRg.setText("");
        grupoSexo.clearSelection();
        txTelefone.setText("");
        txSalario.setText("");
        txCargo.setText("");
        txCarteiraTrabalho.setText("");
        txLogin.setText("");
        txSenha.setText("");
        txRua.setText("");
        txNumero.setText("");
        txBairro.setText("");
        txCidade.setText("");
        txEstado.setText("");
        txCep.setText("");
        txComplemento.setText("");


    }//GEN-LAST:event_btLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCargo;
    private javax.swing.JTextField txCarteiraTrabalho;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextArea txComplemento;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txData_Nascimento;
    private javax.swing.JTextField txEstado;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdEndereco;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JTextField txSalario;
    private javax.swing.JPasswordField txSenha;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}

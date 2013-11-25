/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lojadecalcados.view;

import br.com.lojadecalcados.controller.CategoriaController;
import br.com.lojadecalcados.controller.ProdutoController;
import br.com.lojadecalcados.model.Categoria;
import br.com.lojadecalcados.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guest01
 */
public class ProdutoInserirGUI extends javax.swing.JFrame {

    private int linhaSelecionada;
    private DefaultTableModel modelo;

    public ProdutoInserirGUI(DefaultTableModel modelo) {
        super("Herp Derp Calçados");
        initComponents();
        this.modelo = modelo;
        carregarCombo();
    }

    public ProdutoInserirGUI(DefaultTableModel modelo, int linhaSelecionada, int codigoProduto) {
        super("Herp Derp Calçados");
        initComponents();
        this.modelo = modelo;
        this.linhaSelecionada = linhaSelecionada;
        ProdutoController pc = new ProdutoController();
        Produto edit = pc.listById(codigoProduto);
        txId.setText(String.valueOf(edit.getIdProduto()));
        txNome.setText(edit.getNome());
        txPreco.setText(String.valueOf(edit.getPreco()));
        txNumero.setText(String.valueOf(edit.getNumero()));
        txCor.setText(edit.getCor());
        carregarCombo(edit.getCategoria());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        txCor = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", 0, 0, new java.awt.Font("Arial", 2, 18))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Nome");

        jLabel3.setText("Número:");

        jLabel4.setText("Cor:");

        jLabel5.setText("Categoria:");

        txId.setEditable(false);
        txId.setBackground(new java.awt.Color(204, 204, 204));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Preço:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txCor)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSalvar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Produto p = new Produto();
        p.setNome(txNome.getText());
        p.setPreco(Double.parseDouble(txPreco.getText()));
        p.setNumero(Integer.parseInt(txNumero.getText()));
        p.setCor(txCor.getText());
        p.setCategoria((Categoria) cbCategoria.getSelectedItem());
        ProdutoController pc = new ProdutoController();
        if (txId.getText().equals("") || txId.getText().equals(null)) {
            int id = pc.salvar(p);
            if (id > 0) {
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                modelo.addRow(new Object[]{id, p.getNome(), p.getPreco(), p.getNumero(),
                    p.getCor()});
            }
        } else {
            p.setIdProduto(Integer.parseInt(txId.getText()));
            int id = pc.salvar(p);
            if (id > 0) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
                modelo.removeRow(linhaSelecionada);
                modelo.addRow(new Object[]{id, p.getNome(), p.getPreco(), p.getNumero(),
                    p.getCor()});
            }
        }
        dispose();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
    }//GEN-LAST:event_cbCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txCor;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txPreco;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo() {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCategoria.getModel();
        comboModel.removeAllElements();
        List<Categoria> categorias = new ArrayList<>();
        CategoriaController cc = new CategoriaController();
        categorias = cc.listAll();
        for (int linha = 0; linha < categorias.size(); linha++) {
            Categoria c = categorias.get(linha);
            comboModel.addElement(c);
        }

    }

    private void carregarCombo(Categoria categoria) {
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cbCategoria.getModel();
        comboModel.removeAllElements();
        List<Categoria> cursos = new ArrayList<>();
        CategoriaController cc = new CategoriaController();
        cursos = cc.listAll();
        for (int linha = 0; linha < cursos.size(); linha++) {
            Categoria c = cursos.get(linha);
            comboModel.addElement(c);
            if (categoria.getId() == c.getId()) {
                comboModel.setSelectedItem(c);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopwheels;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felipe
 */
public class PesquisaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisaProduto
     */
    public PesquisaProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisar Produto");
        setMaximumSize(new java.awt.Dimension(560, 450));
        setMinimumSize(new java.awt.Dimension(560, 450));
        setPreferredSize(new java.awt.Dimension(560, 450));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produto :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(21, 31, 70, 16);
        getContentPane().add(txtProduto);
        txtProduto.setBounds(91, 25, 227, 20);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/pesquisa.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(330, 25, 42, 27);

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(18, 79, 516, 335);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backGrounds/PesquisaProduto.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        
        
        String produto = txtProduto.getText();
        
        // Definindo modelo da tabela
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("NOME");
            modelo.addColumn("DESCRIÇÃO");
            modelo.addColumn("CATEGORIA");
            modelo.addColumn("VALOR UNITARIO");
            modelo.addColumn("QUANTIDADE EM ESTOQUE");
            tblProduto.setModel(modelo);

        
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT * FROM produto WHERE pro_nome LIKE '%" + produto +"%' OR pro_descricao LIKE '%" + produto + "%'");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("pro_id");
                linha[1] = resultadoTbl.getString("pro_nome");
                linha[2] = resultadoTbl.getString("pro_descricao");
                linha[3] = resultadoTbl.getString("pro_categoria");
                linha[4] = resultadoTbl.getString("pro_valor");
                linha[5] = resultadoTbl.getString("pro_qtd_est");
                modelo.insertRow(tblProduto.getRowCount(), linha);
            }
            
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Atualizar tabela Hoje " +e.getMessage());
            }
            
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}

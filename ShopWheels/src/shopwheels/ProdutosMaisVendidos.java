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
 * @author novais
 */
public class ProdutosMaisVendidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProdutosMaisVendidos
     */
    public ProdutosMaisVendidos() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoje = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAno = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos mais vendidos");
        setMaximumSize(new java.awt.Dimension(590, 380));
        setMinimumSize(new java.awt.Dimension(590, 380));
        setPreferredSize(new java.awt.Dimension(590, 380));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setOpaque(false);

        tblHoje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblHoje);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hoje", jPanel1);

        jPanel2.setOpaque(false);

        tblMes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblMes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mês", jPanel2);

        jPanel3.setOpaque(false);

        tblAno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblAno);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ano", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 560, 343);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backGrounds/ProdutosMaisVendidos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        // Atualizar tabelas
            atualizarTabelaHoje();
            atualizarTabelaMes();
            atualizarTabelaAno();
            
    }//GEN-LAST:event_formComponentShown

public void atualizarTabelaHoje(){
    
// Definindo modelo da tabela
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOME");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("DESCRIÇÃO");
        modelo.addColumn("QUANTIDADE VENDIDA");
        tblHoje.setModel(modelo);

        
    // Conectando com o DB
        try {
            Connection conexaoDB = ConexaoDB.abrir();
            Statement comandoEnt = conexaoDB.createStatement();
            ResultSet resultadoTbl = comandoEnt.executeQuery("SELECT SUM(ite_quantidade) AS ite_quantidade, pro_id, pro_nome, pro_categoria, pro_descricao FROM itensVend INNER JOIN produto ON ite_fk_produto=pro_id INNER JOIN venda ON ite_fk_venda=ven_id WHERE Day(ven_data)=Day(now()) AND Month(ven_data)=Month(now()) AND Year(ven_data)=Year(now()) GROUP BY pro_id ORDER BY ite_quantidade DESC");
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[5];
                linha[0] = resultadoTbl.getInt("pro_id");
                linha[1] = resultadoTbl.getString("pro_nome");
                linha[2] = resultadoTbl.getString("pro_categoria");
                linha[3] = resultadoTbl.getString("pro_descricao");
                linha[4] = resultadoTbl.getString("ite_quantidade");
                modelo.insertRow(tblHoje.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atualizar tabela Hoje " +e.getMessage());
        }
        
}    

public void atualizarTabelaMes(){
    
// Definindo modelo da tabela
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOME");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("DESCRIÇÃO");
        modelo.addColumn("QUANTIDADE VENDIDA");
        tblMes.setModel(modelo);

        
    // Conectando com o DB
        try {
            Connection conexaoDB = ConexaoDB.abrir();
            Statement comandoEnt = conexaoDB.createStatement();
            ResultSet resultadoTbl = comandoEnt.executeQuery("SELECT SUM(ite_quantidade) AS ite_quantidade, pro_id, pro_nome, pro_categoria, pro_descricao FROM itensVend INNER JOIN produto ON ite_fk_produto=pro_id INNER JOIN venda ON ite_fk_venda=ven_id WHERE Month(ven_data)=Month(now()) AND Year(ven_data)=Year(now()) GROUP BY pro_id ORDER BY ite_quantidade DESC");
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[5];
                linha[0] = resultadoTbl.getInt("pro_id");
                linha[1] = resultadoTbl.getString("pro_nome");
                linha[2] = resultadoTbl.getString("pro_categoria");
                linha[3] = resultadoTbl.getString("pro_descricao");
                linha[4] = resultadoTbl.getString("ite_quantidade");
                modelo.insertRow(tblMes.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atualizar tabela Mes " +e.getMessage());
        }
        
}


public void atualizarTabelaAno(){
    
    
// Definindo modelo da tabela
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOME");
        modelo.addColumn("CATEGORIA");
        modelo.addColumn("DESCRIÇÃO");
        modelo.addColumn("QUANTIDADE VENDIDA");
        tblAno.setModel(modelo);

        
    // Conectando com o DB
        try {
            Connection conexaoDB = ConexaoDB.abrir();
            Statement comandoEnt = conexaoDB.createStatement();
            ResultSet resultadoTbl = comandoEnt.executeQuery("SELECT SUM(ite_quantidade) AS ite_quantidade, pro_id, pro_nome, pro_categoria, pro_descricao FROM itensVend INNER JOIN produto ON ite_fk_produto=pro_id INNER JOIN venda ON ite_fk_venda=ven_id WHERE Year(ven_data)=Year(now()) GROUP BY pro_id ORDER BY ite_quantidade DESC");
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[5];
                linha[0] = resultadoTbl.getInt("pro_id");
                linha[1] = resultadoTbl.getString("pro_nome");
                linha[2] = resultadoTbl.getString("pro_categoria");
                linha[3] = resultadoTbl.getString("pro_descricao");
                linha[4] = resultadoTbl.getString("ite_quantidade");
                modelo.insertRow(tblAno.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atualizar tabela Ano " +e.getMessage());
        }
        
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAno;
    private javax.swing.JTable tblHoje;
    private javax.swing.JTable tblMes;
    // End of variables declaration//GEN-END:variables
}

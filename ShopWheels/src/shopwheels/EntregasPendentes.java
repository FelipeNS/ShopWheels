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
public class EntregasPendentes extends javax.swing.JInternalFrame {

    /**
     * Creates new form EntregasPendentes
     */
    public EntregasPendentes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntrega = new javax.swing.JTable();
        btnEntregue = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Entregas Pendentes");
        setMaximumSize(new java.awt.Dimension(795, 413));
        setMinimumSize(new java.awt.Dimension(795, 413));
        setPreferredSize(new java.awt.Dimension(795, 413));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        tblEntrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEntrega);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 14, 776, 311);

        btnEntregue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/entregue.png"))); // NOI18N
        btnEntregue.setText("Entregue");
        btnEntregue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntregue);
        btnEntregue.setBounds(675, 331, 107, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backGrounds/EntregasPendentes.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        // Atualizar tabela
            atualizarTabela();
            
    }//GEN-LAST:event_formComponentShown

    private void btnEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregueActionPerformed
        // TODO add your handling code here:
        
        // Pegando id da tabela
            if (tblEntrega.getRowCount() > 0) {
                int linhaSelecionada = tblEntrega.getSelectedRow();
            
        // Guardando valores pegos
                String id = tblEntrega.getValueAt(linhaSelecionada, 0).toString();

        // Conectando no banco    
            try {
                Connection conexao = ConexaoDB.abrir();
            
            // Executando comando MySQL
                CallableStatement comandoEnt = conexao.prepareCall("UPDATE entrega SET ent_status='Entregue', ent_dataEnt=now() WHERE ent_id=?");
                comandoEnt.setString(1, id);
                comandoEnt.execute();
                
                JOptionPane.showMessageDialog(null, "Entrega realizada");
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Botão entregue" + e.getMessage());
            
            }
            
            }
            
       // Atualizar tabela
            atualizarTabela();
            
    }//GEN-LAST:event_btnEntregueActionPerformed

    
    
    
public void atualizarTabela(){
    
// Definindo modelo da tabela
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("LOGRADOURO");
        modelo.addColumn("NUMERO");
        modelo.addColumn("BAIRRO");
        modelo.addColumn("CIDADE");
        modelo.addColumn("CEP");
        modelo.addColumn("ENTREGADOR");
        modelo.addColumn("CARRO");
        modelo.addColumn("DESTINATÁRIO");
        modelo.addColumn("OBSERVAÇÃO");
        tblEntrega.setModel(modelo);
       
    // Conectando com o DB
        try {
            Connection conexaoDB = ConexaoDB.abrir();
            Statement comandoEnt = conexaoDB.createStatement();
            ResultSet resultadoTbl = comandoEnt.executeQuery("SELECT ent_id, ent_logradouro, ent_numero, ent_bairro, ent_cidade, ent_cep, fun_nome, car_modelo, ent_pessoa, ent_obs FROM entrega INNER JOIN funcionario ON ent_fk_funcionario=fun_id INNER JOIN carro ON ent_fk_carro=car_id WHERE ent_status='Pendente'");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[10];
                linha[0] = resultadoTbl.getInt("ent_id");
                linha[1] = resultadoTbl.getString("ent_logradouro");
                linha[2] = resultadoTbl.getString("ent_numero");
                linha[3] = resultadoTbl.getString("ent_bairro");
                linha[4] = resultadoTbl.getString("ent_cidade");
                linha[5] = resultadoTbl.getString("ent_cep");
                linha[6] = resultadoTbl.getString("fun_nome");
                linha[7] = resultadoTbl.getString("car_modelo");
                linha[8] = resultadoTbl.getString("ent_pessoa");
                linha[9] = resultadoTbl.getString("ent_obs");
                modelo.insertRow(tblEntrega.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Atualizar tabela" +e.getMessage());
        }  
        
}  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntregue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntrega;
    // End of variables declaration//GEN-END:variables
}

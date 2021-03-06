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
public class CancelarVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form CancelarVenda
     */
    public CancelarVenda() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cb4Dias = new javax.swing.JCheckBox();
        cb1Dia = new javax.swing.JCheckBox();
        cb2Dias = new javax.swing.JCheckBox();
        cb7Dias = new javax.swing.JCheckBox();
        cb3Dias = new javax.swing.JCheckBox();
        cb5Dias = new javax.swing.JCheckBox();
        cb6Dias = new javax.swing.JCheckBox();
        cbHoje = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cancelar Venda");
        setMaximumSize(new java.awt.Dimension(750, 415));
        setMinimumSize(new java.awt.Dimension(750, 415));
        setPreferredSize(new java.awt.Dimension(750, 415));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        tblVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVenda);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(188, 6, 540, 228);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar Venda");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(580, 350, 136, 28);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        cb4Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb4Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb4Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb4Dias.setText("4 Dias Atrás");
        cb4Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4DiasActionPerformed(evt);
            }
        });

        cb1Dia.setBackground(new java.awt.Color(70, 105, 88));
        cb1Dia.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb1Dia.setForeground(new java.awt.Color(0, 102, 51));
        cb1Dia.setText("1 Dia Atrás");
        cb1Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1DiaActionPerformed(evt);
            }
        });

        cb2Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb2Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb2Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb2Dias.setText("2 Dias Atrás");
        cb2Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2DiasActionPerformed(evt);
            }
        });

        cb7Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb7Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb7Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb7Dias.setText("7 Dias Atrás");
        cb7Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7DiasActionPerformed(evt);
            }
        });

        cb3Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb3Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb3Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb3Dias.setText("3 Dias Atrás");
        cb3Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3DiasActionPerformed(evt);
            }
        });

        cb5Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb5Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb5Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb5Dias.setText("5 Dias Atrás");
        cb5Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5DiasActionPerformed(evt);
            }
        });

        cb6Dias.setBackground(new java.awt.Color(70, 105, 88));
        cb6Dias.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cb6Dias.setForeground(new java.awt.Color(0, 102, 51));
        cb6Dias.setText("6 Dias Atrás");
        cb6Dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6DiasActionPerformed(evt);
            }
        });

        cbHoje.setBackground(new java.awt.Color(70, 105, 88));
        cbHoje.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        cbHoje.setForeground(new java.awt.Color(0, 102, 51));
        cbHoje.setText("Hoje");
        cbHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHojeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb1Dia)
                    .addComponent(cb2Dias)
                    .addComponent(cb3Dias)
                    .addComponent(cb4Dias)
                    .addComponent(cb5Dias)
                    .addComponent(cb6Dias)
                    .addComponent(cb7Dias)
                    .addComponent(cbHoje))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbHoje)
                .addGap(18, 18, 18)
                .addComponent(cb1Dia)
                .addGap(18, 18, 18)
                .addComponent(cb2Dias)
                .addGap(18, 18, 18)
                .addComponent(cb3Dias)
                .addGap(18, 18, 18)
                .addComponent(cb4Dias)
                .addGap(18, 18, 18)
                .addComponent(cb5Dias)
                .addGap(18, 18, 18)
                .addComponent(cb6Dias)
                .addGap(18, 18, 18)
                .addComponent(cb7Dias)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 6, 148, 340);

        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblItens);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 240, 540, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backGrounds/CancelarVenda.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel modeloTabela = new DefaultTableModel();
    
    DefaultTableModel modeloTabelaI = new DefaultTableModel();
 
    String idVenda;
    
    private void cbHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHojeActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            hoje();
            
    }//GEN-LAST:event_cbHojeActionPerformed

    private void cb1DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1DiaActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia1();
            
    }//GEN-LAST:event_cb1DiaActionPerformed

    private void cb2DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia2();
        
    }//GEN-LAST:event_cb2DiasActionPerformed

    private void cb3DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia3();    
        
    }//GEN-LAST:event_cb3DiasActionPerformed

    private void cb4DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia4();
            
    }//GEN-LAST:event_cb4DiasActionPerformed

    private void cb5DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia5();
            
    }//GEN-LAST:event_cb5DiasActionPerformed

    private void cb6DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia6();
            
    }//GEN-LAST:event_cb6DiasActionPerformed

    private void cb7DiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7DiasActionPerformed
        // TODO add your handling code here:
        
        // Atualizar tabela
            dia7();
            
    }//GEN-LAST:event_cb7DiasActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        // Colocando modelo na tabela
            modeloTabelaVenda();
            modeloTabelaItens();
            
    }//GEN-LAST:event_formComponentShown

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        if (tblVenda.getRowCount() > 0) {

            // Setando valores nas variáveis
            if (JOptionPane.showConfirmDialog(null, "Ao cancelar uma venda, dados de itens vendidos referentes a ela serão excluidos \nDeseja realmente cancelar ?")== JOptionPane.OK_OPTION) {
                int linhaSelecionada = tblVenda.getSelectedRow();
                String id = tblVenda.getValueAt(linhaSelecionada, 0).toString();

                // Conectando no Banco
                try {
                    Connection conexaoDB = ConexaoDB.abrir();

                    // Executando comando MySQL para excluir itens vendidos
                    CallableStatement comandoExIte = conexaoDB.prepareCall("DELETE FROM itensVend WHERE ite_fk_venda=?");
                    comandoExIte.setString(1, id);
                    comandoExIte.execute();

                    // Executando comando MySQL para cancelar venda
                    CallableStatement comandoEx = conexaoDB.prepareCall("DELETE FROM venda WHERE ven_id=?");
                    comandoEx.setInt(1, Integer.parseInt(id));
                    comandoEx.execute();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Botao Cancelar Venda " +e.getMessage());

                }

            }
        
        // Atualizar tabela    
            if (cbHoje.isSelected()) {
                hoje();
            }
            
            if (cb1Dia.isSelected()) {
                dia1();
            }
            
            if (cb2Dias.isSelected()) {
                dia2();
            }
            
            if (cb3Dias.isSelected()) {
                dia3();
            }
            
            if (cb4Dias.isSelected()) {
                dia4();
            }
            
            if (cb5Dias.isSelected()) {
                dia5();
            }
            
            if (cb6Dias.isSelected()) {
                dia6();
            }
            
            if (cb7Dias.isSelected()) {
                dia7();
            }
           
            modeloTabelaI.setRowCount(0);
            
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendaMouseClicked
        // TODO add your handling code here:
           modeloTabelaI.setRowCount(0);
        
        // Pegando dados da tabela Vendas
            if (tblVenda.getRowCount() > 0) {
                int linhaSelecionada = tblVenda.getSelectedRow();

                 idVenda = tblVenda.getValueAt(linhaSelecionada, 0).toString();
                 
            // Conectando com o DB
                try {
                    Connection conexaoDB = ConexaoDB.abrir();  
                    Statement comandoIte = conexaoDB.createStatement();
                    ResultSet resultadoTblI = comandoIte.executeQuery("SELECT ite_id, pro_nome, pro_descricao, ite_quantidade FROM itensVend INNER JOIN produto ON ite_fk_produto=pro_id WHERE ite_fk_venda="+idVenda);
        
            // Setando valores nas linhas da tabela vendas    
                while (resultadoTblI.next()) {
                    Object[] linha = new Object[3];
                    linha[0] = resultadoTblI.getString("pro_nome");
                    linha[1] = resultadoTblI.getString("pro_descricao");
                    linha[2] = resultadoTblI.getInt("ite_quantidade");
                    modeloTabelaI.insertRow(tblItens.getRowCount(), linha);
                    }
         
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Listar Itens " +e.getMessage());
                }      
            }
        
        
    }//GEN-LAST:event_tblVendaMouseClicked


public void modeloTabelaVenda(){    
// Definindo modelo da tabela
    modeloTabela.addColumn("ID");
    modeloTabela.addColumn("DATA");
    modeloTabela.addColumn("VALOR");
    modeloTabela.addColumn("FUNCIONÁRIO");
    modeloTabela.addColumn("CLIENTE");
    modeloTabela.addColumn("CARRO");
    tblVenda.setModel(modeloTabela);

}
            
public void modeloTabelaItens(){
// Definindo modelo da tabela
    modeloTabelaI.addColumn("PRODUTO");
    modeloTabelaI.addColumn("DESCRICAO");
    modeloTabelaI.addColumn("QUANTIDADE");
    tblItens.setModel(modeloTabelaI); 
    
}


public void hoje(){
    // Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
            
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(true);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(false);
            
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()");
        
        // Setando valores nas linhas da tabela vendas    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box Hoje " +e.getMessage());
        }    
            
}    

public void dia1(){
    
// Limpando tabela
    modeloTabela.setRowCount(0);
    modeloTabelaI.setRowCount(0);
        
    // Somente o escolhido fica selecionado
        cbHoje.setSelected(false);
        cb1Dia.setSelected(true);
        cb2Dias.setSelected(false);
        cb3Dias.setSelected(false);
        cb4Dias.setSelected(false);
        cb5Dias.setSelected(false);
        cb6Dias.setSelected(false);
        cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-1");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 1 " +e.getMessage());
        }    
 
}

public void dia2(){
// Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(true);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-2");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 2 " +e.getMessage());
        }    
 
}

public void dia3(){

        // Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(true);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-3");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 3 " +e.getMessage());
        }    
                
}

public void dia4(){

        // Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(true);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-4");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 4 " +e.getMessage());
        }    
                
}

public void dia5(){
// Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(true);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-5");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 5 " +e.getMessage());
        }    
                
}

public void dia6(){

        // Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(true);
            cb7Dias.setSelected(false);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-6");
        
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");;
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[3] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 6 " +e.getMessage());
        }    
                
}

public void dia7(){
// Limpando tabela
            modeloTabela.setRowCount(0);
            modeloTabelaI.setRowCount(0);
        
        // Somente o escolhido fica selecionado
            cbHoje.setSelected(false);
            cb1Dia.setSelected(false);
            cb2Dias.setSelected(false);
            cb3Dias.setSelected(false);
            cb4Dias.setSelected(false);
            cb5Dias.setSelected(false);
            cb6Dias.setSelected(false);
            cb7Dias.setSelected(true);
                
        // Conectando com o DB
            try {
                Connection conexaoDB = ConexaoDB.abrir();
                Statement comandoVen = conexaoDB.createStatement();
                ResultSet resultadoTbl = comandoVen.executeQuery("SELECT ven_id, ven_data, ven_valor, fun_nome, cli_nome, car_modelo FROM venda INNER JOIN funcionario ON ven_fk_funcionario=fun_id INNER JOIN carro ON ven_fk_carro=car_id INNER JOIN cliente ON cli_id=car_fk_cliente WHERE ven_data=CURDATE()-7");
                
        // Setando valores nas linhas da tabela    
            while (resultadoTbl.next()) {
                Object[] linha = new Object[6];
                linha[0] = resultadoTbl.getInt("ven_id");
                linha[1] = resultadoTbl.getString("ven_data");
                linha[2] = resultadoTbl.getString("ven_valor");
                linha[2] = resultadoTbl.getString("fun_nome");
                linha[4] = resultadoTbl.getString("cli_nome");
                linha[5] = resultadoTbl.getString("car_modelo");
                modeloTabela.insertRow(tblVenda.getRowCount(), linha);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check Box 7 " +e.getMessage());
        }    
                
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox cb1Dia;
    private javax.swing.JCheckBox cb2Dias;
    private javax.swing.JCheckBox cb3Dias;
    private javax.swing.JCheckBox cb4Dias;
    private javax.swing.JCheckBox cb5Dias;
    private javax.swing.JCheckBox cb6Dias;
    private javax.swing.JCheckBox cb7Dias;
    private javax.swing.JCheckBox cbHoje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblItens;
    private javax.swing.JTable tblVenda;
    // End of variables declaration//GEN-END:variables
}

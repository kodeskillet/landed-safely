/*
 *  * @author kaboel
 *  * Muhammad Faiq Allam | faiq.kaboel@gmail.com
 */
package lds.main;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import lds.lib.EmpController;
import lds.models.EmpGridModel;

/**
 *
 * @author kaboel
 */
public class EmpFrm extends javax.swing.JInternalFrame {
    
    private final EmpGridModel gridModel;
    private final EmpController controller;
    
    public EmpFrm() {
        this.controller = new EmpController();
        this.gridModel = new EmpGridModel(controller.getAllEmp());
        
        
        initComponents();
    }
    
    private boolean isCleared() {
        return (this.radGroup.getSelection() == null);
    }
    
    private String getSelectedId() {
        String id = this.gridModel.getValueAt(empDataGrid.getSelectedRow(), 7).toString();
        return id;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnPrntPdf = new javax.swing.JButton();
        btnPrntXls = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        comboRows = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empDataGrid = new javax.swing.JTable(this.gridModel);
        btnDeleteRow = new javax.swing.JButton();
        btnChangeStat = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        comboPosition = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        radName = new javax.swing.JRadioButton();
        radPosition = new javax.swing.JRadioButton();
        radStatus = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Employee");

        btnPrntPdf.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnPrntPdf.setText("Print .pdf");
        btnPrntPdf.setPreferredSize(new java.awt.Dimension(100, 30));

        btnPrntXls.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnPrntXls.setText("Print .xls");
        btnPrntXls.setPreferredSize(new java.awt.Dimension(100, 30));

        btnAdd.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnAdd.setText("+ Add New");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 30));

        btnFilter.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnFilter.setText("FIlter");
        btnFilter.setPreferredSize(new java.awt.Dimension(100, 30));
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        comboRows.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "10", "25", "50" }));
        comboRows.setPreferredSize(new java.awt.Dimension(60, 25));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Rows");

        empDataGrid.setModel(this.gridModel);
        jScrollPane1.setViewportView(empDataGrid);

        btnDeleteRow.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnDeleteRow.setText("Delete Selected");
        btnDeleteRow.setPreferredSize(new java.awt.Dimension(130, 30));

        btnChangeStat.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnChangeStat.setText("Change Status");
        btnChangeStat.setPreferredSize(new java.awt.Dimension(130, 30));
        btnChangeStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setPreferredSize(new java.awt.Dimension(100, 30));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChangeStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrntXls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrntPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrntPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrntXls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteRow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeStat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Employee Name");

        txtName.setEnabled(false);

        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not positioned yet", "Courier", "Staff", "Supervisor" }));
        comboPosition.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Job Position");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non-Active", "Active" }));
        comboStatus.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Status");

        radGroup.add(radName);
        radName.setPreferredSize(new java.awt.Dimension(25, 25));
        radName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radNameItemStateChanged(evt);
            }
        });

        radGroup.add(radPosition);
        radPosition.setPreferredSize(new java.awt.Dimension(25, 25));
        radPosition.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radPositionItemStateChanged(evt);
            }
        });

        radGroup.add(radStatus);
        radStatus.setPreferredSize(new java.awt.Dimension(25, 25));
        radStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radStatusItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(comboStatus, 0, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(radPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(radStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radNameItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            this.txtName.setEnabled(true);
        } else if(evt.getStateChange() == ItemEvent.DESELECTED) {
            this.txtName.setEnabled(false);
        }
    }//GEN-LAST:event_radNameItemStateChanged

    private void radPositionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radPositionItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            this.comboPosition.setEnabled(true);
        } else if(evt.getStateChange() == ItemEvent.DESELECTED) {
            this.comboPosition.setEnabled(false);
        }
    }//GEN-LAST:event_radPositionItemStateChanged

    private void radStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radStatusItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            this.comboStatus.setEnabled(true);
        } else if(evt.getStateChange() == ItemEvent.DESELECTED) {
            this.comboStatus.setEnabled(false);
        }
    }//GEN-LAST:event_radStatusItemStateChanged

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        if(isCleared()) {
            this.gridModel.setData(this.controller.getAllEmp());
        } else if(this.txtName.isEnabled()) {
            String str = this.txtName.getText();
            this.gridModel.setData(this.controller.getEmpByName(str));   
        } else if(this.comboPosition.isEnabled()) {
            int position = this.comboPosition.getSelectedIndex();
            this.gridModel.setData(this.controller.getEmpByPosition(Integer.toString(position)));
        } else if(this.comboStatus.isEnabled()) {
            int status = this.comboStatus.getSelectedIndex();
            this.gridModel.setData(this.controller.getEmpByStatus(Integer.toString(status)));
        }
        int count = this.comboRows.getSelectedIndex();
        switch(count) {
            case 0  : this.gridModel.setRowCount(-1); break;
            case 1  : this.gridModel.setRowCount(10); break;
            case 2  : this.gridModel.setRowCount(25); break;
            case 3  : this.gridModel.setRowCount(50); break;
            default : this.gridModel.setRowCount(-1); break;
        }
        
        this.gridModel.fireTableDataChanged();
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.radGroup.clearSelection();
        this.comboRows.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnChangeStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatActionPerformed
        String empId = getSelectedId();
        String stat = this.gridModel.getValueAt(empDataGrid.getSelectedRow(), 6).toString();
        String empstat;
       
        if(stat.equalsIgnoreCase("Active")) {
            empstat = "1";
        } else {
            empstat = "0";
        }
        StringBuilder sb = new StringBuilder();
        String msg;
        int ico;
        if(this.controller.updateStat(empId, empstat)) {
            sb.append("Status changed !");
            ico = JOptionPane.INFORMATION_MESSAGE;
            msg = "LDS : Information";
        } else {
            sb.append("Unable to change status.");
            ico = JOptionPane.ERROR_MESSAGE;
            msg = "LDS : Error";
        }
        JOptionPane.showMessageDialog(new MainFrm(), sb, msg, ico);
        
        this.gridModel.fireTableDataChanged();
    }//GEN-LAST:event_btnChangeStatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChangeStat;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnPrntPdf;
    private javax.swing.JButton btnPrntXls;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JComboBox<String> comboRows;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JTable empDataGrid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup radGroup;
    private javax.swing.JRadioButton radName;
    private javax.swing.JRadioButton radPosition;
    private javax.swing.JRadioButton radStatus;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
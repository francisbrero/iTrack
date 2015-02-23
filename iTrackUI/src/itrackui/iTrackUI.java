/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itrackui;


import java.awt.AWTException;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Method;

/**
 *
 * @author francis.brero
 */
public class iTrackUI extends javax.swing.JPanel {
    
    /**
     * Creates new form MainMenu
     */
    public iTrackUI() {
        initComponents();                                 
    }
    
    // Getters
    public int iTrackUIgetImax(){
        this.actionCnt = this.actions.size();
        return actionCnt;
    }
    
    // Setters
    public void iTracUIsetI (int _index){
        this.index = _index;
    }
    
    public void iTracUIsetA (ArrayList<Action> _actions){
        this.actions = _actions;
    }
    
    // ********************** API
    
    // Reset all the values in the UI
    public void iTrackUIrefresh() throws Throwable {
        iTrackUIgetImax(); // this one is here in case we make some more actions available while running
        Action action = Action.loadActionI(actions,index);
        jActionNameText.setText(action.Name); 
        jActionDescText.setText(action.Desc);  
        // At some point we should make the functions be variables
        validate = action.APIActivateCall;
        cancel = action.APICancelCall;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNextAction = new javax.swing.JButton();
        jPreviousAction = new javax.swing.JButton();
        jValidateAction = new javax.swing.JButton();
        jCancelAction = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jActionDescText = new javax.swing.JTextField();
        jActionNameText = new javax.swing.JTextField();

        jNextAction.setText("next");
        jNextAction.setToolTipText("");
        jNextAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextActionActionPerformed(evt);
            }
        });

        jPreviousAction.setText("previous");
        jPreviousAction.setToolTipText("");
        jPreviousAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPreviousActionActionPerformed(evt);
            }
        });

        jValidateAction.setText("validate");
        jValidateAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValidateActionActionPerformed(evt);
            }
        });

        jCancelAction.setText("cancel");
        jCancelAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionActionPerformed(evt);
            }
        });

        jActionDescText.setEditable(false);
        jActionDescText.setText("Desc");
        jActionDescText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionDescTextActionPerformed(evt);
            }
        });

        jActionNameText.setEditable(false);
        jActionNameText.setText("actionName");
        jActionNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionNameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPreviousAction, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jValidateAction, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancelAction, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNextAction, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jActionDescText, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jActionNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1433, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCancelAction, jNextAction, jPreviousAction, jValidateAction});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jActionDescText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jValidateAction, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jCancelAction, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jPreviousAction, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jNextAction, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jActionNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(940, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCancelAction, jNextAction, jPreviousAction, jValidateAction});

    }// </editor-fold>//GEN-END:initComponents

    private void jCancelActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionActionPerformed
        try {       
            cancel.invoke(cancel,null);            
        } catch (IllegalAccessException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jCancelActionActionPerformed

    private void jValidateActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValidateActionActionPerformed
        try {       
            validate.invoke(validate,null);            
        } catch (IllegalAccessException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }                       
    }//GEN-LAST:event_jValidateActionActionPerformed

    private void jNextActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextActionActionPerformed
                              
       this.index = (this.index+1)%actionCnt;
        try {
            iTrackUIrefresh();
        } catch (Throwable ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jNextActionActionPerformed

    private void jPreviousActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPreviousActionActionPerformed
        // TODO add your handling code here:        
        this.index = (this.index+actionCnt-1)%actionCnt;
        try {               
            iTrackUIrefresh();
        } catch (Throwable ex) {
            Logger.getLogger(iTrackUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPreviousActionActionPerformed

    private void jActionDescTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionDescTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActionDescTextActionPerformed

    private void jActionNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActionNameTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jActionDescText;
    private javax.swing.JTextField jActionNameText;
    private javax.swing.JButton jCancelAction;
    private javax.swing.JButton jNextAction;
    private javax.swing.JButton jPreviousAction;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jValidateAction;
    // End of variables declaration//GEN-END:variables

    // UI Variables
    private int index;
    public ArrayList<Action> actions;
    private int actionCnt = 1;
    
    // Action Variables
    private Method validate;
    private Method cancel;
}

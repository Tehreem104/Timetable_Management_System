
package javaframes;


public class UpdateTimetable extends javax.swing.JFrame {

    public UpdateTimetable() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Updatetimetable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addSection = new javax.swing.JToggleButton();
        AddSlot = new javax.swing.JToggleButton();
        RemoveSection = new javax.swing.JToggleButton();
        AddInstructor = new javax.swing.JToggleButton();
        RemoveInstructor = new javax.swing.JToggleButton();
        RemoveSlot = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        addSection1 = new javax.swing.JToggleButton();
        RemoveInstructor1 = new javax.swing.JToggleButton();
        addSection2 = new javax.swing.JToggleButton();
        addSection3 = new javax.swing.JToggleButton();
        RemoveSlot1 = new javax.swing.JToggleButton();

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Updatetimetable.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/calendar (4).png"))); // NOI18N
        jLabel1.setText("Update Timetable");

        javax.swing.GroupLayout UpdatetimetableLayout = new javax.swing.GroupLayout(Updatetimetable);
        Updatetimetable.setLayout(UpdatetimetableLayout);
        UpdatetimetableLayout.setHorizontalGroup(
            UpdatetimetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatetimetableLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        UpdatetimetableLayout.setVerticalGroup(
            UpdatetimetableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatetimetableLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        addSection.setBackground(new java.awt.Color(204, 204, 255));
        addSection.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        addSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/download (2).png"))); // NOI18N
        addSection.setText("Remove Course");
        addSection.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSectionActionPerformed(evt);
            }
        });

        AddSlot.setBackground(new java.awt.Color(204, 204, 255));
        AddSlot.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        AddSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/terms (2).png"))); // NOI18N
        AddSlot.setText("   Add Slot");
        AddSlot.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AddSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSlotActionPerformed(evt);
            }
        });

        RemoveSection.setBackground(new java.awt.Color(204, 204, 255));
        RemoveSection.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        RemoveSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/cancellation (3).png"))); // NOI18N
        RemoveSection.setText("Remove Section");
        RemoveSection.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        RemoveSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveSectionActionPerformed(evt);
            }
        });

        AddInstructor.setBackground(new java.awt.Color(204, 204, 255));
        AddInstructor.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        AddInstructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/add-users-interface-symbol (2).png"))); // NOI18N
        AddInstructor.setText(" Add Instructor");
        AddInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddInstructorActionPerformed(evt);
            }
        });

        RemoveInstructor.setBackground(new java.awt.Color(204, 204, 255));
        RemoveInstructor.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        RemoveInstructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/remove-person-outlined-interface-button.png"))); // NOI18N
        RemoveInstructor.setText("Add Course");
        RemoveInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveInstructorActionPerformed(evt);
            }
        });

        RemoveSlot.setBackground(new java.awt.Color(204, 204, 255));
        RemoveSlot.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        RemoveSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/declined.png"))); // NOI18N
        RemoveSlot.setText("Add Venue");
        RemoveSlot.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        RemoveSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveSlotActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/tactics.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        addSection1.setBackground(new java.awt.Color(204, 204, 255));
        addSection1.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        addSection1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/download (2).png"))); // NOI18N
        addSection1.setText("Update Timetable");
        addSection1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSection1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSection1ActionPerformed(evt);
            }
        });

        RemoveInstructor1.setBackground(new java.awt.Color(204, 204, 255));
        RemoveInstructor1.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        RemoveInstructor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/remove-person-outlined-interface-button.png"))); // NOI18N
        RemoveInstructor1.setText("Remove Instructor");
        RemoveInstructor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveInstructor1ActionPerformed(evt);
            }
        });

        addSection2.setBackground(new java.awt.Color(204, 204, 255));
        addSection2.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        addSection2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/download (2).png"))); // NOI18N
        addSection2.setText("Remove Venue");
        addSection2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSection2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSection2ActionPerformed(evt);
            }
        });

        addSection3.setBackground(new java.awt.Color(204, 204, 255));
        addSection3.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        addSection3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/download (2).png"))); // NOI18N
        addSection3.setText("   Add Section");
        addSection3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSection3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSection3ActionPerformed(evt);
            }
        });

        RemoveSlot1.setBackground(new java.awt.Color(204, 204, 255));
        RemoveSlot1.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        RemoveSlot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/declined.png"))); // NOI18N
        RemoveSlot1.setText("  Remove Slot ");
        RemoveSlot1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        RemoveSlot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveSlot1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatetimetable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addSection2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveInstructor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveSlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddInstructor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddSlot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSection3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveSlot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addSection1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Updatetimetable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddSlot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSection3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddInstructor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveSlot1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(addSection1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveSection)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveInstructor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveInstructor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveSlot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSection2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSectionActionPerformed
        DeleteCourse as=new DeleteCourse();
        as.setVisible(true);
    }//GEN-LAST:event_addSectionActionPerformed

    private void AddSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSlotActionPerformed
        AddSlott a=new AddSlott();
        a.setVisible(true);
    }//GEN-LAST:event_AddSlotActionPerformed

    private void RemoveSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveSectionActionPerformed
        RemoveSectionn rs=new RemoveSectionn();
        rs.setVisible(true);
    }//GEN-LAST:event_RemoveSectionActionPerformed

    private void AddInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddInstructorActionPerformed
        AddTeacher ai=new AddTeacher();
        ai.setVisible(true);
    }//GEN-LAST:event_AddInstructorActionPerformed

    private void RemoveInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveInstructorActionPerformed
        AddCourse rm=new AddCourse();
        rm.setVisible(true);
    }//GEN-LAST:event_RemoveInstructorActionPerformed

    private void RemoveSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveSlotActionPerformed
        AddVenue rs=new AddVenue();
        rs.setVisible(true);
    }//GEN-LAST:event_RemoveSlotActionPerformed

    private void addSection1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSection1ActionPerformed
        AddSectionn a=new AddSectionn();
        a.setVisible(true);
    }//GEN-LAST:event_addSection1ActionPerformed

    private void RemoveInstructor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveInstructor1ActionPerformed
        RemoveTeacher a=new RemoveTeacher();
        a.setVisible(true);
    }//GEN-LAST:event_RemoveInstructor1ActionPerformed

    private void addSection2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSection2ActionPerformed
        DeleteVenue r=new DeleteVenue();
        r.setVisible(true);
    }//GEN-LAST:event_addSection2ActionPerformed

    private void addSection3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSection3ActionPerformed
        AddSectionn av=new AddSectionn();
        av.setVisible(true);        
    }//GEN-LAST:event_addSection3ActionPerformed

    private void RemoveSlot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveSlot1ActionPerformed
        RemoveSlott r =new RemoveSlott();
        r.setVisible(true);
    }//GEN-LAST:event_RemoveSlot1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AddInstructor;
    private javax.swing.JToggleButton AddSlot;
    private javax.swing.JToggleButton RemoveInstructor;
    private javax.swing.JToggleButton RemoveInstructor1;
    private javax.swing.JToggleButton RemoveSection;
    private javax.swing.JToggleButton RemoveSlot;
    private javax.swing.JToggleButton RemoveSlot1;
    private javax.swing.JPanel Updatetimetable;
    private javax.swing.JToggleButton addSection;
    private javax.swing.JToggleButton addSection1;
    private javax.swing.JToggleButton addSection2;
    private javax.swing.JToggleButton addSection3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

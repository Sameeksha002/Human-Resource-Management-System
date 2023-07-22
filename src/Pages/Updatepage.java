
package Pages;

import DbHandler.Connectionmanage;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.*;


public class Updatepage extends JFrame {

    Updatepage() {
        initComponents();
        
        setLocation(40, 30);
        setVisible(true);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/icon6.jpeg"));
        Image i22 = i11.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i33 = new ImageIcon(i22);
        image.setIcon(i33);
        
                try{
                   Connectionmanage con = new Connectionmanage();
                   String query="select eid from einfo";
                   ResultSet rs = con.s.executeQuery(query);
                   while(rs.next()){
                       String eid = rs.getString("eid").toString();
                       eids.addItem(eid);
                   }
               }catch(Exception e){
                   e.printStackTrace();
               }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enamelabel = new javax.swing.JLabel();
        eemaillabel = new javax.swing.JLabel();
        edesginationlabel = new javax.swing.JLabel();
        eaddresslabel = new javax.swing.JLabel();
        eidlabel = new javax.swing.JLabel();
        econtactinfolabel = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        eemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eaddress = new javax.swing.JTextArea();
        edesignation = new javax.swing.JTextField();
        econtactinfo = new javax.swing.JTextField();
        updatebutton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        eids = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        update = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        enamelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enamelabel.setText("Name");

        eemaillabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eemaillabel.setText("Email");

        edesginationlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edesginationlabel.setText("Designation");

        eaddresslabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eaddresslabel.setText("Address");

        eidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eidlabel.setText("Employee Id");

        econtactinfolabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        econtactinfolabel.setText("Contact Info");

        ename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        eemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        eaddress.setColumns(20);
        eaddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eaddress.setRows(5);
        jScrollPane1.setViewportView(eaddress);

        edesignation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edesignationActionPerformed(evt);
            }
        });

        econtactinfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        econtactinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                econtactinfoActionPerformed(evt);
            }
        });

        updatebutton.setBackground(new java.awt.Color(102, 153, 0));
        updatebutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(204, 255, 0));
        updatebutton.setText("Update");
        updatebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(0, 0, 0));
        backbutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("Back");
        backbutton.setToolTipText("");
        backbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        eids.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        eids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edesginationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(econtactinfolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(econtactinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(289, 289, 289)
                                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(eids, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)))))
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eids, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(eaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edesginationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(econtactinfolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(econtactinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(edesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("UPDATE EMPLOYEE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
               try{
                   int id = Integer.parseInt(eids.getSelectedItem().toString());
                    String name = ename.getText();
                    String email = eemail.getText();
                    String address = eaddress.getText();
                    String designation = edesignation.getText();
                    String contact = econtactinfo.getText();
                    Connectionmanage con = new Connectionmanage();
                    String query="Update einfo SET ename='"+name+"',eemail='"+email+"',eaddress='"+address+"',edesgination='"+designation+"',econtactinfo='"+contact+"' where eid='"+id+"'";
                    con.s.executeUpdate(query);setVisible(false);
                    new Homepage();
                    
               }catch(Exception e){
                   e.printStackTrace();
               }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
               setVisible(false);
               new Homepage();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void eidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidsActionPerformed
        try{
            int id = Integer.parseInt(eids.getSelectedItem().toString());
            Connectionmanage conn = new Connectionmanage();
            String query1 = "select * from einfo where eid ='"+id+"'";
            ResultSet rs = conn.s.executeQuery(query1);
            if (rs.next()) {
                String name = rs.getString("ename");
                ename.setText(name);
                String email =rs.getString("eemail");
                eemail.setText(email);
                String address =rs.getString("eaddress");
                eaddress.setText(address);
                String designation =rs.getString("edesgination");
                edesignation.setText(designation);
                String contact =rs.getString("econtactinfo");
                econtactinfo.setText(contact);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Employee ID");
            }
        } catch(Exception e){e.printStackTrace();}            
    }//GEN-LAST:event_eidsActionPerformed

    private void edesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edesignationActionPerformed

    private void econtactinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_econtactinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_econtactinfoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTextArea eaddress;
    private javax.swing.JLabel eaddresslabel;
    private javax.swing.JTextField econtactinfo;
    private javax.swing.JLabel econtactinfolabel;
    private javax.swing.JLabel edesginationlabel;
    private javax.swing.JTextField edesignation;
    private javax.swing.JTextField eemail;
    private javax.swing.JLabel eemaillabel;
    private javax.swing.JLabel eidlabel;
    private javax.swing.JComboBox<String> eids;
    private javax.swing.JTextField ename;
    private javax.swing.JLabel enamelabel;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel update;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}

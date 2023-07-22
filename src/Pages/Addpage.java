
package Pages;

import DbHandler.Connectionmanage;
import java.awt.Image;
import javax.swing.*;
import java.util.*;


public class Addpage extends JFrame {


    Addpage() {
        initComponents();
        setLocation(40, 22);
        setVisible(true);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/icon5.jpeg"));
        Image i22 = i11.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i33 = new ImageIcon(i22);
        image.setIcon(i33);
        
        Random randomno = new Random();
        int number = randomno.nextInt(999999);
        eid.setText(""+number);
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupgender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        eidlabel = new javax.swing.JLabel();
        eaddresslabel = new javax.swing.JLabel();
        edesignationlabel = new javax.swing.JLabel();
        econtactinfolabel = new javax.swing.JLabel();
        enamelabel = new javax.swing.JLabel();
        eemaillabel = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        eemail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        eaddress = new javax.swing.JTextArea();
        econtactinfo = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        edatelabel = new javax.swing.JLabel();
        edoblabel = new javax.swing.JLabel();
        egenderlabel = new javax.swing.JLabel();
        rdbfemale = new javax.swing.JRadioButton();
        rdbmale = new javax.swing.JRadioButton();
        rdbother = new javax.swing.JRadioButton();
        designationoption = new javax.swing.JComboBox<>();
        edob = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        backbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.lightGray);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));

        eidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eidlabel.setText("Empolyee id");

        eaddresslabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eaddresslabel.setText("Address");

        edesignationlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edesignationlabel.setText("Designation");

        econtactinfolabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        econtactinfolabel.setText("Contact Info");

        enamelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enamelabel.setText("Name");

        eemaillabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eemaillabel.setText("Email");

        ename.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        eemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eemailActionPerformed(evt);
            }
        });

        eaddress.setColumns(20);
        eaddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eaddress.setRows(5);
        jScrollPane2.setViewportView(eaddress);

        econtactinfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        econtactinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                econtactinfoActionPerformed(evt);
            }
        });

        eid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eid.setToolTipText("");

        savebutton.setBackground(new java.awt.Color(153, 255, 102));
        savebutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        savebutton.setText("Save");
        savebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        edatelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edatelabel.setText("Date");
        edatelabel.setToolTipText("");

        edoblabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edoblabel.setText("DOB");

        egenderlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        egenderlabel.setText("Gender");

        groupgender.add(rdbfemale);
        rdbfemale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbfemale.setSelected(true);
        rdbfemale.setText("Female");
        rdbfemale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdbfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbfemaleActionPerformed(evt);
            }
        });

        groupgender.add(rdbmale);
        rdbmale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbmale.setText("Male");
        rdbmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmaleActionPerformed(evt);
            }
        });

        groupgender.add(rdbother);
        rdbother.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdbother.setText("Other");
        rdbother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbotherActionPerformed(evt);
            }
        });

        designationoption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        designationoption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software Engineer", "Java Developer", "Backend Developer", "Intern", "Python Developer", "Product Manager", "UI/UX Designer", "Frontend Developer", "Tester", "QualityManager" }));
        designationoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationoptionActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(0, 0, 0));
        backbutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setText("Back");
        backbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.darkGray));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(egenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(rdbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbother, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edesignationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(econtactinfolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(econtactinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(designationoption, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edoblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(edatelabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(98, 98, 98)
                                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(392, 392, 392))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(enamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eemaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eaddresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(econtactinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(econtactinfolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edoblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edesignationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edatelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designationoption))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbother, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egenderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        add.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD EMPLOYEE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(519, 519, 519))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(add)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eemailActionPerformed

    private void econtactinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_econtactinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_econtactinfoActionPerformed

    private void rdbmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmaleActionPerformed
           rdbmale.setActionCommand("male");
    }//GEN-LAST:event_rdbmaleActionPerformed

    private void rdbotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbotherActionPerformed
           rdbother.setActionCommand("other");
    }//GEN-LAST:event_rdbotherActionPerformed

    private void rdbfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbfemaleActionPerformed
           rdbfemale.setActionCommand("female");
    }//GEN-LAST:event_rdbfemaleActionPerformed

    private void designationoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationoptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationoptionActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed

                 int id = Integer.parseInt(eid.getText());
                 String name = ename.getText();
                 String email = eemail.getText();
                 String address = eaddress.getText();
                 String designation = designationoption.getSelectedItem().toString();
                 String contact = econtactinfo.getText();
                 String date = ((JTextField)edate.getDateEditor().getUiComponent()).getText();
                 String dob = ((JTextField)edob.getDateEditor().getUiComponent()).getText();
                 String gender = groupgender.getSelection().getActionCommand();
                 
                 try{
                     Connectionmanage conn = new Connectionmanage();
                     String query = "insert into einfo (eid,ename,eemail,eaddress,edesgination,econtactinfo,edob,edate,egender) values ('"+id+"','"+name+"','"+email+"','"+address+"','"+designation+"','"+contact+"','"+dob+"','"+date+"','"+gender+"')";
                     conn.s.executeUpdate(query);
                     setVisible(false);
                     new Homepage();
                 }catch(Exception e){
                     e.printStackTrace();
                 }    
             
    }//GEN-LAST:event_savebuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
                
                     setVisible(false);
                     new Homepage();
    }//GEN-LAST:event_backbuttonActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> designationoption;
    private javax.swing.JTextArea eaddress;
    private javax.swing.JLabel eaddresslabel;
    private javax.swing.JTextField econtactinfo;
    private javax.swing.JLabel econtactinfolabel;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JLabel edatelabel;
    private javax.swing.JLabel edesignationlabel;
    private com.toedter.calendar.JDateChooser edob;
    private javax.swing.JLabel edoblabel;
    private javax.swing.JTextField eemail;
    private javax.swing.JLabel eemaillabel;
    private javax.swing.JLabel egenderlabel;
    private javax.swing.JTextField eid;
    private javax.swing.JLabel eidlabel;
    private javax.swing.JTextField ename;
    private javax.swing.JLabel enamelabel;
    private javax.swing.ButtonGroup groupgender;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbmale;
    private javax.swing.JRadioButton rdbother;
    private javax.swing.JButton savebutton;
    // End of variables declaration//GEN-END:variables
}

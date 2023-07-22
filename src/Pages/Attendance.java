
package Pages;

import DbHandler.Connectionmanage;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class Attendance extends javax.swing.JFrame {

  
    public Attendance() {
        initComponents();
        setLocation(40, 30);
        setVisible(true);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        presentbutton = new javax.swing.JButton();
        eidlabel = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        absentbutton = new javax.swing.JButton();
        leavebutton = new javax.swing.JButton();
        viewbutton = new javax.swing.JButton();
        barpanel = new javax.swing.JPanel();
        hello = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel.setBackground(new java.awt.Color(255, 204, 204));

        presentbutton.setBackground(new java.awt.Color(204, 255, 51));
        presentbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        presentbutton.setText("Present");
        presentbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        presentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentbuttonActionPerformed(evt);
            }
        });

        eidlabel.setBackground(new java.awt.Color(255, 255, 255));
        eidlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eidlabel.setText("EMP ID");

        eid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });

        absentbutton.setBackground(new java.awt.Color(255, 51, 51));
        absentbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        absentbutton.setText("Absent");
        absentbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        absentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentbuttonActionPerformed(evt);
            }
        });

        leavebutton.setBackground(new java.awt.Color(255, 255, 102));
        leavebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        leavebutton.setText("On Leave");
        leavebutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        leavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavebuttonActionPerformed(evt);
            }
        });

        viewbutton.setBackground(new java.awt.Color(51, 255, 51));
        viewbutton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        viewbutton.setForeground(new java.awt.Color(102, 102, 0));
        viewbutton.setText("View");
        viewbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });

        barpanel.setBackground(new java.awt.Color(153, 153, 255));
        barpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barpanel.setLayout(new javax.swing.BoxLayout(barpanel, javax.swing.BoxLayout.LINE_AXIS));

        hello.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        hello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helloActionPerformed(evt);
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

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hello, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(presentbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(absentbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(leavebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(viewbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                    .addContainerGap(573, Short.MAX_VALUE)
                    .addComponent(barpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(485, Short.MAX_VALUE)))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(presentbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(absentbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(leavebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(190, 190, 190)
                .addComponent(hello, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(viewbutton)
                .addGap(100, 100, 100)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                    .addContainerGap(421, Short.MAX_VALUE)
                    .addComponent(barpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLOYEE ATTENDENCE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavebuttonActionPerformed

        int id = Integer.parseInt(eid.getText());
        String attendence = "on leave";
        String date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        try{
            Connectionmanage conn = new Connectionmanage();
            String query = "insert into attendence (eid,eattendance,edate) values("+id+",'"+attendence+"','"+date+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "On Leave");
            setVisible(false);
            new Attendance();
        }
        catch(Exception e){}
    }//GEN-LAST:event_leavebuttonActionPerformed

    private void absentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentbuttonActionPerformed

        int id = Integer.parseInt(eid.getText());
        String attendence = "absent";
        String date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        try{
            Connectionmanage conn = new Connectionmanage();
            String query = "insert into attendence (eid,eattendance,edate) values("+id+",'"+attendence+"','"+date+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Absent Today");
            setVisible(false);
            new Attendance();
        }
        catch(Exception e){}
    }//GEN-LAST:event_absentbuttonActionPerformed

    private void presentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentbuttonActionPerformed

        int id = Integer.parseInt(eid.getText());
        String attendence = "present";
        String date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        try{
            Connectionmanage conn = new Connectionmanage();
            String query = "insert into attendence (eid,eattendance,edate) values("+id+",'"+attendence+"','"+date+"')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Present Today");
            setVisible(false);
            new Attendance();
        }
        catch(Exception e){}
    }//GEN-LAST:event_presentbuttonActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        
            String id = eid.getText();
            int rowCount = 0;
            int presentCount = 0;
            int absentCount = 0;
            int onleaveCount = 0;    
            String attendence;
            String name;
            
        try{
            Connectionmanage conn = new Connectionmanage();
            String query = "select * from attendence where eid ='"+id+"'";
            ResultSet rst = conn.s.executeQuery(query);
      
            while(rst.next()){
                rowCount++;   
                attendence = rst.getString("eattendance");
                if(attendence.startsWith("p")){
                     presentCount++;
                }
                else if(attendence.startsWith("a")){
                     absentCount++;
                }
                else{
                     onleaveCount++;
                }                   
            }

            String query1 = "select ename from einfo where eid ='"+id+"'";
            ResultSet rs = conn.s.executeQuery(query1);
            
            if (rs.next()) {
                name = rs.getString("ename");
                hello.setText(name);
            }
        }catch(Exception e){e.printStackTrace();}
        
        int total = presentCount + absentCount + onleaveCount;
        int presentPercentage = (presentCount/total)*100;
        int absentPercentage = (absentCount/total)*100;
        int onleavePercentage = (onleaveCount/total)*100;
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(presentPercentage, "Present", "Attendence");
        dataset.setValue(absentPercentage, "Absent", "Attendence");
        dataset.setValue(onleavePercentage, "Onleave", "Attendence");

        
        JFreeChart chart = ChartFactory.createBarChart("chart", "Attendence % Of Employee", "Percentage", dataset, PlotOrientation.VERTICAL, true, true, false);
        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);

        ChartPanel chartPanel = new ChartPanel(chart);
        
        barpanel.removeAll();
        barpanel.add(chartPanel);
        barpanel.updateUI();
        
            
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
       
    }//GEN-LAST:event_eidActionPerformed

    private void helloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helloActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        setVisible(false);
        new Homepage();
    }//GEN-LAST:event_backbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absentbutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JPanel barpanel;
    private javax.swing.JTextField eid;
    private javax.swing.JLabel eidlabel;
    private javax.swing.JTextField hello;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanel;
    private javax.swing.JButton leavebutton;
    private javax.swing.JButton presentbutton;
    private javax.swing.JButton viewbutton;
    // End of variables declaration//GEN-END:variables
}

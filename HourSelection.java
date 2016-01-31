/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketsreservation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class HourSelection extends javax.swing.JFrame {

    /**
     * Creates new form HourSelection
     */
    public HourSelection(String play) {
        initComponents(play);
    }


    @SuppressWarnings("unchecked")
        private void initComponents(final String play) {

        jScrollPane1 = new javax.swing.JScrollPane();
        hourList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u03A9\u03C1\u03B5\u03C2 \u03C3\u03C5\u03BD\u03B1\u03C5\u03BB\u03AF\u03B1\u03C2");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        DefaultListModel listModel = new DefaultListModel();
        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionUrl = "jdbc:mysql://localhost:3306/sunaulies";
            String connectionUser = "root";
            String connectionPassword = "root";
            conn = DriverManager.getConnection(connectionUrl, connectionUser,
                connectionPassword);
            stmt = conn.createStatement();
           
            int sum1 = Integer.parseInt(play.replaceAll("[\\D]", ""));
            rs = stmt.executeQuery("SELECT * FROM time where id='"+sum1+"'");
            
            while (rs.next())
            {

                String time = rs.getString("time");
                
                listModel.addElement(time);

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        hourList.setModel(listModel);
        jScrollPane1.setViewportView(hourList);

        jLabel1.setText("\u03A9\u03C1\u03B5\u03C2:");

        btnOK.setText("\u03BF\u03BA");
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    HourSelection.this.setVisible(false);
                    String selectedHour = hourList.getSelectedValue().toString();
                SeatSelection seatSelection= new SeatSelection(play,selectedHour);
                seatSelection.setVisible(true);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnOK)
                .addGap(24, 24, 24))
        );

        pack();
    } 
        
   
     
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HourSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HourSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HourSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HourSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HourSelection("Default").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JList hourList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

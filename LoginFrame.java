package ticketsreservation;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;


public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
    	getContentPane().setBackground(Color.BLACK);
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

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.BLUE);
        rdbtnAdmin = new javax.swing.JRadioButton();
        rdbtnAdmin.setBackground(Color.BLUE);
        rdbtnCashier = new javax.swing.JRadioButton();
        rdbtnCashier.setBackground(Color.BLUE);
        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        btnGroup.add(rdbtnAdmin);
        btnGroup.add(rdbtnCashier);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u039C\u03B5\u03BD\u03BF\u03C5");

        rdbtnAdmin.setSelected(true);
        rdbtnAdmin.setText("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B9\u03C3\u03C4\u03B7\u03C2");

        rdbtnCashier.setText("\u03A4\u03B1\u03BC\u03AF\u03B1\u03C2");

        jLabel1.setText("\u03A0\u03BF\u03B9\u03CC\u03C2 \u03BF \u03C1\u03BF\u03BB\u03BF\u03C2 \u03C3\u03BF\u03C5;");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(45, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(rdbtnAdmin)
        					.addGap(128))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(rdbtnCashier)
        					.addGap(85))))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(79)
        			.addComponent(jLabel1)
        			.addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jLabel1)
        			.addGap(25)
        			.addComponent(rdbtnAdmin)
        			.addGap(18)
        			.addComponent(rdbtnCashier)
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        btnInsert.setText("\u039F\u039A");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel2.setText("επέλεξες;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(94))))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(108)
        			.addComponent(btnInsert)
        			.addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
        			.addComponent(btnInsert)
        			.addGap(22))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        			String text = txtPassword.getText();
				
				String pwdCashier="cashier";
				String pwdAdmin="admin";

				
				if(rdbtnCashier.isSelected()){
					if (text.equals(pwdCashier)) {
					LoginFrame.this.setVisible(false);
			    PlaySelection playSelection= new PlaySelection();
			    playSelection.setVisible(true);
					}else {
						
						txtPassword.setText("Invalid Password!");
					}
				}else {
					if(rdbtnAdmin.isSelected()){
				
						if (text.equals(pwdAdmin)) {
						LoginFrame.this.setVisible(false);
				    AdminFrame adminFrame= new AdminFrame();
				    adminFrame.setVisible(true);
						}else {
							
							txtPassword.setText("Invalid Password!");
						}
					}
				
				}
        
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbtnAdmin;
    private javax.swing.JRadioButton rdbtnCashier;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}

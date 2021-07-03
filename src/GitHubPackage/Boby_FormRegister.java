package GitHubPackage;
import javax.swing.*;

public class Boby_FormRegister extends JFrame {

    public Boby_FormRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Form Register - Boby");
        setLocation(590,200);
        jLabel1 = new JLabel();
        r_fullname = new JTextField();
        r_username = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        r_password = new JPasswordField();
        registerButton = new JButton();
        linkLogin = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 80));
        jLabel1.setText("Register");

        r_fullname.setFont(new java.awt.Font("Calibri", 0, 24));

        r_username.setFont(new java.awt.Font("Calibri", 0, 24));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel4.setText("Password");

        r_password.setFont(new java.awt.Font("Calibri", 0, 24));

        registerButton.setFont(new java.awt.Font("Century Gothic", 0, 24));
        registerButton.setText("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        linkLogin.setFont(new java.awt.Font("Century Gothic", 0, 24));
        linkLogin.setText("Punya akun? Login");
        linkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLoginMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(linkLogin))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r_username)
                                    .addComponent(r_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(r_password))))
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(r_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(r_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(r_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(linkLogin))
                .addGap(61, 61, 61))
        );
        pack();
    }

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            Boby_FormLogin.username = r_username.getText();
            Boby_FormLogin.password = r_password.getText();
            JOptionPane.showMessageDialog(null, "Berhasil registrasi. Halo " +
                r_fullname.getText());
            this.setVisible(false);
            new Boby_FormMain().setVisible(true);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }

    private void linkLoginMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        new Boby_FormLogin().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boby_FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel linkLogin;
    private JTextField r_fullname;
    private JPasswordField r_password;
    private JTextField r_username;
    private JButton registerButton;
    // End of variables declaration//GEN-END:variables
}

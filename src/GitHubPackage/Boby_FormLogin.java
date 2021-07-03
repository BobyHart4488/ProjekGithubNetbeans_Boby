package GitHubPackage;
import javax.swing.*;

public class Boby_FormLogin extends JFrame {
    static String username = "", password = "";

    public Boby_FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Form Login - Boby");
        setLocation(590,200);
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        l_username = new JTextField();
        l_password = new JPasswordField();
        loginButton = new JButton();
        linkRegister = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 80));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel3.setText("Password");

        l_username.setFont(new java.awt.Font("Calibri", 0, 24));

        l_password.setFont(new java.awt.Font("Calibri", 0, 24));

        loginButton.setFont(new java.awt.Font("Century Gothic", 0, 24));
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        linkRegister.setFont(new java.awt.Font("Century Gothic", 0, 24));
        linkRegister.setText("Belum punya akun? Register");
        linkRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkRegisterMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l_username)
                            .addComponent(l_password, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        .addComponent(linkRegister)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(l_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_password))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(linkRegister))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pack();
    }

    private void linkRegisterMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        new Boby_FormRegister().setVisible(true);
    }

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            if(username.equals(l_username.getText()) &&
                password.equals(l_password.getText())){
                this.setVisible(false);
                new Boby_FormMain().setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Username atau Password"
                        + " salah! Coba lagi");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boby_FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private JLabel jLabel3;
    private JLabel jLabel2;
    private JLabel jLabel1;
    private JPasswordField l_password;
    private JTextField l_username;
    private JLabel linkRegister;
    private JButton loginButton;
    // End of variables declaration                   
}

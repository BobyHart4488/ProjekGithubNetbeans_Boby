package GitHubPackage;
import javax.swing.*;

public class Boby_FormMain extends JFrame {

    public Boby_FormMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Temperature Conversion - Boby");
        setLocation(590,200);
        jLabel2 = new JLabel();
        suhuCombo1 = new JComboBox<>();
        jLabel3 = new JLabel();
        suhuCombo2 = new JComboBox<>();
        suhuKonversi = new JTextField();
        suhuAwal = new JTextField();
        konversiButton = new JButton();
        linkLogout = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 60));
        jLabel2.setText("Konversi Suhu");

        suhuCombo1.setFont(new java.awt.Font("Century Gothic", 0, 24));
        suhuCombo1.setModel(new DefaultComboBoxModel<>(new String[] { "Pilih Suhu 1", "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24));
        jLabel3.setText(">");

        suhuCombo2.setFont(new java.awt.Font("Century Gothic", 0, 24));
        suhuCombo2.setModel(new DefaultComboBoxModel<>(new String[] { "Pilih Suhu 2", "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        suhuKonversi.setFont(new java.awt.Font("Century Gothic", 0, 36));

        suhuAwal.setFont(new java.awt.Font("Century Gothic", 0, 36));

        konversiButton.setFont(new java.awt.Font("Century Gothic", 0, 24));
        konversiButton.setText("Konversi");
        konversiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                konversiButtonMouseClicked(evt);
            }
        });

        linkLogout.setFont(new java.awt.Font("Century Gothic", 1, 13));
        linkLogout.setText("Logout");
        linkLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLogoutMouseClicked(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suhuAwal)
                    .addComponent(suhuCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(suhuKonversi)
                    .addComponent(suhuCombo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(konversiButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(linkLogout)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhuCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhuCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhuKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(konversiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(linkLogout)
                .addGap(31, 31, 31))
        );

        pack();
    }

    private void konversiButtonMouseClicked(java.awt.event.MouseEvent evt) {
        
    }

    private void linkLogoutMouseClicked(java.awt.event.MouseEvent evt) {
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boby_FormMain().setVisible(true);
            }
        });
    }
    
    private double suhu = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton konversiButton;
    private JLabel linkLogout;
    private JTextField suhuAwal;
    private JComboBox<String> suhuCombo1;
    private JComboBox<String> suhuCombo2;
    private JTextField suhuKonversi;
    // End of variables declaration//GEN-END:variables
}

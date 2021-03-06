
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author hendr
 */
public class ParamedicLtsGui extends javax.swing.JFrame {

    /**
     * Creates new form ParamedicLtsGui
     */
        private String username = null;
        private String passwort = null;
        private String urlid1 = "http://172.22.231.133:8080";
        private String urlid2 = "http://192.168.2.227:8080";
        private String urlid3 = "http://133.72.251.112:8080";
    public ParamedicLtsGui() {
        initComponents();
        btnbestaetigen.setVisible(false);
        btnloeschen.setVisible(false);
        btntestdaten.setVisible(false);
        txfwoeingabe.setEditable(false);
        txfwereingabe.setEditable(false);
        txfwaseingabe.setEditable(false);
        txfwievieleeingabe.setEditable(false);
        txfanmerkungeingabe.setEditable(false);
        cb.setVisible(false);
        cb.addItem("Sever Auswählen");
        cb.addItem(urlid1);
        cb.addItem(urlid2);
        cb.addItem(urlid3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l4 = new javax.swing.JLabel();
        txfwoeingabe = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        txfwaseingabe = new javax.swing.JTextField();
        l7 = new javax.swing.JLabel();
        txfwereingabe = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        txfwievieleeingabe = new javax.swing.JTextField();
        l8 = new javax.swing.JLabel();
        txfanmerkungeingabe = new javax.swing.JTextField();
        btnbestaetigen = new javax.swing.JButton();
        btnloeschen = new javax.swing.JButton();
        btnbeenden = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        txfusername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        txfpasswort = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        cb = new javax.swing.JComboBox<>();
        btntestdaten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l4.setText("Wo");

        l5.setText("Wer");

        l7.setText("Wie viele");

        l6.setText("Was");

        l8.setText("Anmerkung");

        btnbestaetigen.setBackground(new java.awt.Color(255, 0, 0));
        btnbestaetigen.setForeground(new java.awt.Color(255, 255, 255));
        btnbestaetigen.setText("ALAMIEREN");
        btnbestaetigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbestaetigenActionPerformed(evt);
            }
        });

        btnloeschen.setText("Löschen");
        btnloeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloeschenActionPerformed(evt);
            }
        });

        btnbeenden.setText("Beenden");
        btnbeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeendenActionPerformed(evt);
            }
        });

        l1.setText("Login");

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        l2.setText("Benutzername");

        l3.setText("Passwort");

        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btntestdaten.setText("TestDaten");
        btntestdaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntestdatenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnlogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbeenden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnloeschen)
                        .addGap(18, 18, 18)
                        .addComponent(btnbestaetigen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l8)
                            .addComponent(l6)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l5)
                            .addComponent(l7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfanmerkungeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwievieleeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwaseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwoeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwereingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addComponent(txfusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnlogin)
                                .addComponent(txfpasswort, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btntestdaten)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btntestdaten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwoeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l5)
                            .addComponent(txfwereingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfwaseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l6))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfwievieleeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfusername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfpasswort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3))
                        .addGap(28, 28, 28)
                        .addComponent(btnlogin)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l8)
                        .addComponent(txfanmerkungeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbestaetigen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnloeschen)
                    .addComponent(btnbeenden)
                    .addComponent(btnlogout))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloeschenActionPerformed
        txfwoeingabe.setText("");
        txfwereingabe.setText("");
        txfwaseingabe.setText("");
        txfwievieleeingabe.setText("");
        txfanmerkungeingabe.setText("");
    }//GEN-LAST:event_btnloeschenActionPerformed

    private void btnbeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeendenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnbeendenActionPerformed

    private void btnbestaetigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbestaetigenActionPerformed
        String wo = txfwoeingabe.getText();
        String wer = txfwereingabe.getText();
        String was = txfwaseingabe.getText();
        String wieviele = txfwievieleeingabe.getText();
        String anmerkung = txfanmerkungeingabe.getText();
        String woneu = wo.replaceAll(" ", "+");
        Karte karte = new Karte();
        karte.abfragen(woneu);
        String slat = Double.toString(karte.getlat());
        String slon = Double.toString(karte.getlon());
        String urlid = String.valueOf(cb.getSelectedItem());
        try {
            URL url = new URL(urlid+"/api/lts/new_accident");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            String jsonInputString = slat +"\n" + slon + "\n" + wer + "\n" + was + "\n" + wieviele + "\n" + anmerkung;
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
                os.flush();
            }
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }
        } catch (IOException ex) {
            System.out.println("Fehler beim verbinden");

        }try{
            FileWriter fw;
            fw = new FileWriter("einsatzt.txt");
            fw.write("Wo: "+wo+"\nwo: "+wo+"\nwer: "+wer+"\nwie viele: "+wieviele+"\nanmerkung: "+anmerkung);
            fw.close();
        }catch(IOException ioe){
            System.out.println("ioException");
        }
            String url =  "https://www.openstreetmap.org/?mlat="+slat+"&mlon="+slon+"#map=17/"+slat+"/"+slon;
            FXWebViewInSwing webview = new FXWebViewInSwing();
            webview.createAndShowWindow(url);

    }//GEN-LAST:event_btnbestaetigenActionPerformed
    private void BrowserKarte(String url){
        try{
                 Runtime rt = Runtime.getRuntime();
                 rt.exec("rundll32 url.dll,FileProtocolHandler " + url).waitFor();
        } catch (IOException ioe) {
            System.out.println("Fehler");
        } catch (InterruptedException ie) {
            System.out.println("Fehler");
        }
    }
    private void GoogleKarte(){
        try {
            String wo = txfwoeingabe.getText();
            String woneu = wo.replaceAll(" ", "+");
            String url = "https://www.google.com/maps/place/" + woneu + "/";
            Runtime rt = Runtime.getRuntime();
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url).waitFor();
        } catch (IOException ioe) {
            System.out.println("Fehler");
        } catch (InterruptedException ie) {
            System.out.println("Fehler");
        }      
    }
    private void getAdresse(){
        Karte karte1 = new Karte();
        String wo = txfwoeingabe.getText();
        String woneu = wo.replaceAll(" ", "+");
        karte1.abfragen(woneu);
    }
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
            btntestdaten.setVisible(true);
        username = txfusername.getText();
        passwort = txfpasswort.getText();
        btnbestaetigen.setVisible(true);
        btnloeschen.setVisible(true);
        btnlogin.setVisible(false);
        txfusername.setVisible(false);
        txfpasswort.setVisible(false);
        txfwoeingabe.setEditable(true);
        txfwereingabe.setEditable(true);
        txfwaseingabe.setEditable(true);
        txfwievieleeingabe.setEditable(true);
        txfanmerkungeingabe.setEditable(true);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        cb.setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
            btntestdaten.setVisible(false);
        btnbestaetigen.setVisible(false);
        btnloeschen.setVisible(false);
        btnlogin.setVisible(true);
        txfusername.setVisible(true);
        txfpasswort.setVisible(true);
        txfwoeingabe.setEditable(false);
        txfwereingabe.setEditable(false);
        txfwaseingabe.setEditable(false);
        txfwievieleeingabe.setEditable(false);
        txfanmerkungeingabe.setEditable(false);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        cb.setVisible(false);
        btnloeschenActionPerformed(evt);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btntestdatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntestdatenActionPerformed
        txfwoeingabe.setText("hygiene museum dresden");
        txfwereingabe.setText("Mustermann");
        txfwaseingabe.setText("Person in Notlage");
        txfwievieleeingabe.setText("1");
        txfanmerkungeingabe.setText("keine");
    }//GEN-LAST:event_btntestdatenActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ParamedicLtsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParamedicLtsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParamedicLtsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParamedicLtsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParamedicLtsGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbeenden;
    private javax.swing.JButton btnbestaetigen;
    private javax.swing.JButton btnloeschen;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntestdaten;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JTextField txfanmerkungeingabe;
    private javax.swing.JTextField txfpasswort;
    private javax.swing.JTextField txfusername;
    private javax.swing.JTextField txfwaseingabe;
    private javax.swing.JTextField txfwereingabe;
    private javax.swing.JTextField txfwievieleeingabe;
    private javax.swing.JTextField txfwoeingabe;
    // End of variables declaration//GEN-END:variables
}


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
    public ParamedicLtsGui() {
        initComponents();
        //btntest.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txfwoeingabe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfwaseingabe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfwereingabe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfwievieleeingabe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfanmerkungeingabe = new javax.swing.JTextField();
        btnbestaetigen = new javax.swing.JButton();
        btnloeschen = new javax.swing.JButton();
        btnbeenden = new javax.swing.JButton();
        btnadresse = new javax.swing.JButton();
        btntest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Wo");

        jLabel2.setText("Wer");

        jLabel3.setText("Wie viele");

        jLabel4.setText("Was");

        jLabel5.setText("Anmerkung");

        btnbestaetigen.setText("Bestätigen");
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

        btnadresse.setText("Adresse");
        btnadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadresseActionPerformed(evt);
            }
        });

        btntest.setText("Test");
        btntest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfanmerkungeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwievieleeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwaseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwoeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfwereingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntest)
                        .addGap(18, 18, 18)
                        .addComponent(btnadresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbeenden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnloeschen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbestaetigen)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfwoeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfwereingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfwaseingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfwievieleeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfanmerkungeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbestaetigen)
                    .addComponent(btnloeschen)
                    .addComponent(btnbeenden)
                    .addComponent(btnadresse)
                    .addComponent(btntest))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloeschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloeschenActionPerformed
        txfanmerkungeingabe.setText("");
        txfwaseingabe.setText("");
        txfwereingabe.setText("");
        txfwievieleeingabe.setText("");
        txfwoeingabe.setText("");
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
        try {
            URL url = new URL("http://172.22.231.133:8080/api/lts/new_accident");
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
            Logger.getLogger(ParamedicLtsGui.class.getName()).log(Level.SEVERE, null, ex);
        }try{
        FileWriter fw;
        fw = new FileWriter("einsatzt.txt");
        fw.write("Wo: "+wo+"\nwo: "+wo+"\nwer: "+wer+"\nwie viele: "+wieviele+"\nanmerkung: "+anmerkung);
        fw.close();
        }catch(IOException ioe){
            System.out.println("ioException");
        }
        btnadresseActionPerformed(evt);
    }//GEN-LAST:event_btnbestaetigenActionPerformed

    private void btnadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadresseActionPerformed
        Karte karte1 = new Karte();
        String wo = txfwoeingabe.getText();
        String woneu = wo.replaceAll(" ", "+");
        karte1.abfragen(woneu);
        
    }//GEN-LAST:event_btnadresseActionPerformed

    private void btntestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntestActionPerformed
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
    }//GEN-LAST:event_btntestActionPerformed

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
    private javax.swing.JButton btnadresse;
    private javax.swing.JButton btnbeenden;
    private javax.swing.JButton btnbestaetigen;
    private javax.swing.JButton btnloeschen;
    private javax.swing.JButton btntest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txfanmerkungeingabe;
    private javax.swing.JTextField txfwaseingabe;
    private javax.swing.JTextField txfwereingabe;
    private javax.swing.JTextField txfwievieleeingabe;
    private javax.swing.JTextField txfwoeingabe;
    // End of variables declaration//GEN-END:variables
}

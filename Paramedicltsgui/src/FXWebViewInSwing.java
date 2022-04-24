
import java.awt.BorderLayout;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hendr
 */
    public class FXWebViewInSwing{

    private JFXPanel jfxPanel ;
    private String url;
    public void createAndShowWindow(String url) {
        this.url =url;
        JFrame frame = new JFrame();
        JButton quit = new JButton("Quit");
        quit.addActionListener(event -> frame.dispose());
        jfxPanel = new JFXPanel();
        Platform.runLater(this::createJFXContent);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(quit);

        frame.add(BorderLayout.CENTER, jfxPanel);
        frame.add(BorderLayout.SOUTH, buttonPanel);
        frame.setSize(1600, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createJFXContent() {
        WebView webView = new WebView();
        webView.getEngine().load(this.url);
        Scene scene = new Scene(webView);
        jfxPanel.setScene(scene);
    }

    
    }
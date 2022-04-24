/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hendr
 */
    import javax.swing.*;
    import java.io.*;
    import javafx.embed.swing.JFXPanel;
    import javafx.scene.Scene;
    import javafx.scene.web.WebEngine;
    import javafx.scene.web.WebView;
    import java.awt.BorderLayout;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.SwingUtilities;

    import javafx.application.Platform;
    import javafx.embed.swing.JFXPanel;
    import javafx.scene.Scene;
    import javafx.scene.web.WebView;
    
public class Website extends JFrame {

    public static void main(String url) 
    {
        JEditorPane editor = new JEditorPane();
        editor.setEditable(false);   

        try {
            System.out.println(url);
            editor.setPage(url);
        }catch (IOException e) {
            editor.setContentType("text/html");
            editor.setText("Page could not load");
        }
 
        JScrollPane scrollPane = new JScrollPane(editor);     
        JFrame f = new JFrame("Karte");
        
        f.getContentPane().add(scrollPane);
        f.setSize(4000,1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void karte(String url){
        JFXPanel fxPanel;
        WebView wv;
        JFrame frame;
         try {
            wv = new WebView ();
            fxPanel = new JFXPanel ();
            frame = new JFrame ( "Google" );
            com.sun.javafx.application.PlatformImpl.runLater ( new Runnable () {
            @Override
            public void run () {
                
                WebEngine we = wv.getEngine ();
                we.load (url);
                fxPanel.setScene ( new Scene ( wv, 4000, 1000 ) );
                frame.add ( new JScrollPane ( fxPanel ) );
                frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
                frame.setVisible ( true );
                frame.pack ();
            }
        } );

        } catch ( Exception ex ) {

    }
    }

}


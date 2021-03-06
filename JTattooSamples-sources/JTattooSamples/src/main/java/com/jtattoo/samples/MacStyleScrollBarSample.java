/*
 * JTattoo MacStyleScrollBarSample (c) 2012 by MH Software-Entwicklung
 *
 * This sample shows how to set mac style scrollbars. In this case the increase/decrease buttons of scrollbars
 * are not painted and scrollbar is smaller.
 */

package com.jtattoo.samples;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Michael Hagen
 */
public class MacStyleScrollBarSample extends BaseSampleFrame {
   
    public MacStyleScrollBarSample() {
        super("MacStyleScrollBarSample");
        JScrollPane treeScrollPane = new JScrollPane(new JTree());
        treeScrollPane.setMinimumSize(new Dimension(120, 80));
        JTextArea textArea = new JTextArea(loadDummyText());
        JScrollPane textAreaScrollPane = new JScrollPane(textArea);
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, treeScrollPane, textAreaScrollPane);
        splitPane.setDividerLocation(148);
        contentPanel.add(splitPane, BorderLayout.CENTER);
    }

    @Override
    public Properties getLAFProps() {
        Properties props = super.getLAFProps();
        // This property switches the layout style of the scrollbars.
        props.put("macStyleScrollBar", "on");
        return props;
    }
    
    private String loadDummyText() {
        try {
            InputStream in = MacStyleScrollBarSample.class.getResourceAsStream("dummy.txt");
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = in.read()) != -1) {
                sb.append((char)c);
            }
            return sb.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Hello Word";
    }
    
//------------------------------------------------------------------------------    
    public static void main(String[] args) {
//------------------------------------------------------------------------------    
        try {
            // Create a property object 
            Properties props = new Properties();

            // This property switches the layout style of the scrollbars.
            props.put("macStyleScrollBar", "on");
            
            // Set the theme
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setCurrentTheme(props);
            
            // Select the Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    // Start the application
                    MacStyleScrollBarSample app = new MacStyleScrollBarSample();
                    app.setSize(600, 400);
                    app.setLocationRelativeTo(null);
                    app.setVisible(true);
                }
            });
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // end main
    
}

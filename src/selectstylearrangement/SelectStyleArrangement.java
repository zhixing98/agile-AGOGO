/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectStyleArrangement;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
 
public class SelectStyleArrangement extends JPanel
                             implements ActionListener {
    static String style1String = "style1";
    static String style2String = "style2";
    static String style3String = "style3";
    static String style4String = "style4";
    static String style5String = "style5";
 
    JLabel picture;
 
    public SelectStyleArrangement() {
        super(new BorderLayout());
 
        //Create the radio buttons.
        JRadioButton style1Button = new JRadioButton(style1String);
        style1Button.setMnemonic(KeyEvent.VK_B);
        style1Button.setActionCommand(style1String);
        style1Button.setSelected(true);
 
        JRadioButton style2Button = new JRadioButton(style2String);
        style2Button.setMnemonic(KeyEvent.VK_C);
        style2Button.setActionCommand(style2String);
 
        JRadioButton style3Button = new JRadioButton(style3String);
        style3Button.setMnemonic(KeyEvent.VK_D);
        style3Button.setActionCommand(style3String);
 
        JRadioButton style4Button = new JRadioButton(style4String);
        style4Button.setMnemonic(KeyEvent.VK_R);
        style4Button.setActionCommand(style4String);
 
        JRadioButton style5Button = new JRadioButton(style5String);
        style5Button.setMnemonic(KeyEvent.VK_P);
        style5Button.setActionCommand(style5String);
        
        JButton confirm = new JButton("Confirm");
        confirm.setMnemonic(KeyEvent.VK_Q);
        confirm.setActionCommand("Confirm");
        
        JButton cancel = new JButton("Cancel");
        confirm.setMnemonic(KeyEvent.VK_R);
        confirm.setActionCommand("Cancel");
        
 
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(style1Button);
        group.add(style2Button);
        group.add(style3Button);
        group.add(style4Button);
        group.add(style5Button);
        
        ButtonGroup group2 = new ButtonGroup();
        group2.add(cancel);
        group2.add(confirm);
        //Register a listener for the radio buttons.
        style1Button.addActionListener(this);
        style2Button.addActionListener(this);
        style3Button.addActionListener(this);
        style4Button.addActionListener(this);
        style5Button.addActionListener(this);
        
        ActionListener confirmListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String style = "";
                
                ImageIcon icon = new ImageIcon();
                
                if (style1Button.isSelected()){
                    style = style1Button.getText();
                    icon = new ImageIcon("src/image/style1.jpg");
                }
                    
                if (style2Button.isSelected())
                    style = style2Button.getText();
                if (style3Button.isSelected())
                    style = style3Button.getText();
                if (style4Button.isSelected())
                    style = style4Button.getText();
                if (style5Button.isSelected())
                    style = style5Button.getText();
                
                JOptionPane.showConfirmDialog(null,"Your selection: " + style);
                
            }
            
        };
        
        ActionListener cancelListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        
        confirm.addActionListener(confirmListener);
        cancel.addActionListener(cancelListener);
 
        //Set up the picture label.
        picture = new JLabel(createImageIcon("/image/"
                                             + style1String
                                             + ".jpg"));
 
        picture.setPreferredSize(new Dimension(500, 650));
        //picture.setSize(700,600);
        
 
 
        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(style1Button);
        radioPanel.add(style2Button);
        radioPanel.add(style3Button);
        radioPanel.add(style4Button);
        radioPanel.add(style5Button);
        radioPanel.add(confirm);
        radioPanel.add(cancel);
        
        add(radioPanel, BorderLayout.LINE_START);
        add(picture, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        
        
        
        
        
    }
    
    public void confirmListener(ActionEvent e){
        
    }
 
    /** Listens to the radio buttons. */
    public void actionPerformed(ActionEvent e) {
        picture.setIcon(createImageIcon("/image/"
                                        + e.getActionCommand()
                                        + ".jpg"));
    }
 
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SelectStyleArrangement.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Select Style Arrangement");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new SelectStyleArrangement();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
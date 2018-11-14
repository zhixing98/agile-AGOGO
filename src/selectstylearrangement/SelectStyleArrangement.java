/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectStyleArrangement;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/*
 * RadioButtonDemo.java requires these files:
 *   images/Bird.gif
 *   images/Cat.gif
 *   images/Dog.gif
 *   images/Rabbit.gif
 *   images/Pig.gif
 */
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
 
        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(style1Button);
        group.add(style2Button);
        group.add(style3Button);
        group.add(style4Button);
        group.add(style5Button);
 
        //Register a listener for the radio buttons.
        style1Button.addActionListener(this);
        style2Button.addActionListener(this);
        style3Button.addActionListener(this);
        style4Button.addActionListener(this);
        style5Button.addActionListener(this);
 
        //Set up the picture label.
        picture = new JLabel(createImageIcon("/image/"
                                             + style1String
                                             + ".jpg"));
 
        //The preferred size is hard-coded to be the width of the
        //widest image and the height of the tallest image.
        //A real program would compute this.
        //picture.setPreferredSize(new Dimension(800, 800));
        picture.setSize(400,300);
        
 
 
        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(style1Button);
        radioPanel.add(style2Button);
        radioPanel.add(style3Button);
        radioPanel.add(style4Button);
        radioPanel.add(style5Button);
 
        add(radioPanel, BorderLayout.LINE_START);
        add(picture, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
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
        JFrame frame = new JFrame("RadioButtonDemo");
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
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
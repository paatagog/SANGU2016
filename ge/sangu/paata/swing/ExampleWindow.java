package ge.sangu.paata.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by amigo on 27/12/2016.
 */
public class ExampleWindow {

    JFrame frame;

    private void fileOpen(){
        // TODO must be implemented
    }

    private void fileSave(){
        // TODO must be implemented
    }

    private void addMenu() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menu.getAccessibleContext().setAccessibleDescription("File");
        menuBar.add(menu);

        menuItem = new JMenuItem("Open", KeyEvent.VK_O);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("Opens the file");
        menuItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        fileOpen();
                    }
                }
        );
        menu.add(menuItem);

        menuItem = new JMenuItem("Save", KeyEvent.VK_S);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("Saves the file");
        menuItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        fileSave();
                    }
                }
        );
        menu.add(menuItem);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }

    private void addLabel() {
        JLabel label = new JLabel("Hello World From Sangu");
        frame.getContentPane().add(label);
    }

    public void init() {
        frame = new JFrame("SanguExampleSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMenu();
        addLabel();

        //ფანჯრის გამოჩენა.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExampleWindow exampleWindow= new ExampleWindow();
        // ფანჯრის გამოჩენა
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                exampleWindow.init();
            }
        });
    }
}

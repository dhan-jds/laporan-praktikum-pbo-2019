/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

/**
 *
 * @author Wildhan Juniar
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720112Dhan extends JFrame {

    /**
     * @param args the command line arguments
     */
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    //private JButton button2;
    private JPanel panel;

    public MyInputForm1841720112Dhan() {
        createTextFieldDhan();
        createButtonDhan();
        createPanelDhan();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldDhan() {
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai B : ");
        cLabel = new JLabel("Hasil   : ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButtonDhan() {
        button = new JButton("Calculate"); // untuk membuat tombol "Calculate"
        class AddInterestListener1841720112Dhan implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText()); // mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil Perkalian: " + c);
            }
        }
        ActionListener listener = new AddInterestListener1841720112Dhan();
        button.addActionListener(listener);
    }
    
    //private void createButtonTambahDhan() 
    //{
        //button2 = new JButton("Tambah (+)"); // untuk membuat tombol "Tambah"
        //class AddInterestListener1841720112Dhan implements ActionListener 
        //{
            //@Override
            //public void actionPerformed(ActionEvent event) 
            //{
                //int a = Integer.valueOf(aField.getText()); // mengambil inputan textbox
                //int b = Integer.valueOf(bField.getText());
                //int d = a + b;
                //dLabel.setText("Hasil Penambahan: " + d);
            //}
        //}
        //ActionListener listener2 = new AddInterestListener1841720112Dhan();
        //button2.addActionListener(listener2);
    //}

    private void createPanelDhan() {
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        //panel.add(button2);
        panel.add(cLabel);
        add(panel);
    }

    public static void main(String[] args) {
        //TODO code application logic here
        JFrame frame = new MyInputForm1841720112Dhan();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
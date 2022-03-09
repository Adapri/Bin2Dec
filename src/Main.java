import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
       JFrame jf = new JFrame("Bin2Dec Converter");

       Container cp = jf.getContentPane();

       JPanel panel1= new JPanel();
       JPanel panel2= new JPanel();
       JPanel panel3= new JPanel();

       panel1.add(new JLabel("BINARY2DECIMAL CONVERTER"));

       panel2.setLayout (new GridBagLayout());
       
       GridBagConstraints gb = new GridBagConstraints();
       gb.gridx=0; gb.gridy=0;
       gb.gridheight=1; gb.gridwidth=1;

       panel2.add(new JLabel("Binary"),gb);

       gb.gridx=0; gb.gridy=1;
       gb.gridheight=1; gb.gridwidth=1;

       panel2.add(new JTextField(20),gb);

       gb.gridx=0; gb.gridy=2;
       gb.gridheight=1; gb.gridwidth=1;
       panel2.add(new JLabel("Decimal"),gb);

       gb.gridx=0; gb.gridy=3;
       gb.gridheight=1; gb.gridwidth=1;
       panel2.add(new JTextField(20),gb);

       cp.add(panel1,BorderLayout.NORTH);
       cp.add(panel2,BorderLayout.CENTER);
       cp.add(panel3,BorderLayout.SOUTH);
       
       jf.setSize(500, 300);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* String binary;

        Scanner input= new Scanner(System.in);

        Converter converter = new Converter();

        System.out.println("Introduce un número binario");

        binary=input.nextLine();

        switch(Converter.parserBinary(binary))
        {
            case -1: System.out.println("It is not a binary number"); break;

            case 0: System.out.println("Invalid length"); break;

            case 1: System.out.println(Converter.Bic2Dec(binary));
        }
        */
    }
}

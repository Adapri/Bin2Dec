import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame{
   
    private JTextField  input;

    private JTextField  output;



    public Window()
    {
        JFrame jf = new JFrame("Bin2Dec Converter");

        Container cp = jf.getContentPane();
 
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
 
        JLabel title = new JLabel("BINARY2DECIMAL CONVERTER");
        panel1.add(title);
 
        panel2.setLayout (new GridBagLayout());
        
        GridBagConstraints gb = new GridBagConstraints();
        gb.gridx=0; gb.gridy=0;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.WEST;
        panel2.add(new JLabel("Binary"),gb);
 
   
        input = new JTextField(20);
        gb.gridx=0; gb.gridy=1;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.CENTER;
        panel2.add(input,gb);
 
        ImageIcon icon = new ImageIcon("images/down-arrow-facebook.png"); 
 
        // Creaer imagen escalada, y volver a introducir en el icono
        Image newImage = icon.getImage().getScaledInstance(37, 50, Image.SCALE_DEFAULT);
        icon.setImage(newImage);
 
        gb.gridx=0; gb.gridy=2;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.CENTER;
        panel2.add(new JLabel(icon),gb);
 
        gb.gridx=0; gb.gridy=3;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.WEST;
        panel2.add(new JLabel("Decimal"),gb);
 
        output = new JTextField(20);
        gb.gridx=0; gb.gridy=4;
        gb.gridheight=1; gb.gridwidth=1;
        panel2.add(output,gb);
        gb.anchor = GridBagConstraints.CENTER;
 
        cp.add(panel1,BorderLayout.NORTH);
        cp.add(panel2,BorderLayout.CENTER);
        cp.add(panel3,BorderLayout.SOUTH);
        
        jf.setSize(500, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public String getInput()
    { 
        try {
            input.getText();
        } catch (Exception e) {
            return "";
        }          
       
        return input.getText();
    }

    public void setOutput(String out)
    {
        output.setText(out);
    }
}
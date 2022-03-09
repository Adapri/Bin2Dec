import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{
   
    private JTextField  input;

    private JTextField  output;

    private JLabel inLabel;

    private JLabel outLabel;

    private int mode;

    private JButton switchButton;


    public Window()
    {
        mode=0;

        JFrame jf = new JFrame("Bin2Dec Converter");

        Container cp = jf.getContentPane();
 
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
 
        JLabel title = new JLabel("BINARY2DECIMAL CONVERTER");
        title.setFont(new Font("New Times Roman", Font.PLAIN, 20));
        panel1.add(title);
 
        panel2.setLayout (new GridBagLayout());
        
        GridBagConstraints gb = new GridBagConstraints();

        inLabel=new JLabel("Binary");
        gb.gridx=0; gb.gridy=0;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.WEST;
        panel2.add(inLabel,gb);
 
   
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
        
        outLabel=new JLabel("Decimal");
        gb.gridx=0; gb.gridy=3;
        gb.gridheight=1; gb.gridwidth=1;
        gb.anchor = GridBagConstraints.WEST;
        panel2.add(outLabel,gb);
 
        output = new JTextField(20);
        output.setEnabled(false);
        gb.gridx=0; gb.gridy=4;
        gb.gridheight=1; gb.gridwidth=1;
        panel2.add(output,gb);
        gb.anchor = GridBagConstraints.CENTER;

        switchButton= new JButton("Switch");
        gb.gridx=1; gb.gridy=2;
        gb.gridheight=1; gb.gridwidth=1;
        panel2.add(switchButton,gb);
        switchButton.addActionListener(this);
 
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

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == switchButton)
        {
            
            if(mode==0)
            {
                mode=1;

                inLabel.setText("Decimal");
                outLabel.setText("Binary");
            }

            else
            {
                mode=0;

                inLabel.setText("Binary");
                outLabel.setText("Decimal");
            }
        
        }
    }

    public int getMode()
    {
        return mode;
    }
}
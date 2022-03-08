import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {

    public static int parserBinary(String number)
    {
        
        if(number.isEmpty())
            return 0;

        String aux;
        for(int i=0;i<number.length();i++)
        {
            aux=Character.toString(number.charAt(i));

            if(!aux.equals("0") && !aux.equals("1"))
                return -1;
            
        }
        
        return 1;
    }

    public static int Bic2Dec(String binary)
    {
        int decimal=0;
        String aux;
        for(int i=binary.length()-1;i>=0;i--)
        {
            aux=Character.toString(binary.charAt(i));

            decimal+=Integer.parseInt(aux)*Math.pow(2,binary.length()-1-i);    
        }
        
        
        return decimal;
    }

    public static void main(String[] args) throws Exception {
        
        String binary;

        Scanner input= new Scanner(System.in);

        System.out.println("Introduce un número binario");

        binary=input.nextLine();

        switch(parserBinary(binary))
        {
            case -1: System.out.println("It is not a binary number"); break;

            case 0: System.out.println("Invalid length"); break;

            case 1: System.out.println(Bic2Dec(binary));
        }

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Window window = new Window();
        Converter converter = new Converter();
        String input=window.getInput();
        while(true)
        {
            if(!input.equals("")) //Cheak input is not empty
            {
                if(window.getMode()==0) //Mode Bin2Dec
                {
                    if(!converter.parserBinary(input))
                        window.setOutput("It is not a binary number");

                    else
                        window.setOutput(String.valueOf(converter.Bic2Dec(input)));
                }

                else //Mode Dec2Bin
                {

                    if(!converter.parserDecimal(input))
                        window.setOutput("It is not a decimal number");

                    else
                    {
                        window.setOutput(converter.Dec2Bin(input));
                    }
                }
            }

            else
                window.setOutput(""); 

            input=window.getInput();
       }
        
    }
}

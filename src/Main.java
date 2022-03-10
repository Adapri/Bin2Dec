import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Window window = new Window();
        Converter converter = new Converter();
        String input=window.getInput();
        while(true)
        {
            if(!input.equals(""))
            {
                if(window.getMode()==0)
                {
                    if(converter.parserBinary(input)==0)
                        window.setOutput("It is not a binary number");

                    else
                        window.setOutput(String.valueOf(converter.Bic2Dec(input)));
                }

                else
                {

                    if(converter.parserDecimal(input)==0)
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

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        Window window = new Window();
        Converter converter = new Converter();
        String input=window.getInput();
        while(true==true)
        {
            
            if(!input.equals(""))
            {
                switch(converter.parserBinary(input))
                {
                    case -1: System.out.println("It is not a binary number"); break;
        
                    case 0: System.out.println("Invalid length"); break;
        
                    case 1: window.setOutput(String.valueOf(converter.Bic2Dec(input)));
                }
            }
            
            input=window.getInput();
       }

    

      

       
        
    }
}

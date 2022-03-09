public class Converter{

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


}
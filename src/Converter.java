public class Converter{

    public int parserBinary(String number)
    {

        String aux;
        for(int i=0;i<number.length();i++)
        {
            aux=Character.toString(number.charAt(i));

            if(!aux.equals("0") && !aux.equals("1"))
                return 0;
            
        }
        
        return 1;
    }

    public int parserDecimal(String number)
    {
        String aux;
        for(int i=0;i<number.length();i++)
        {
            aux=Character.toString(number.charAt(i));

            if(!aux.equals("0") && !aux.equals("1") && !aux.equals("2") && !aux.equals("3") && !aux.equals("4") && !aux.equals("5") && !aux.equals("6") && !aux.equals("7") && !aux.equals("8") && !aux.equals("9"))
                return 0;
        }
        
        return 1;
    }

    public int Bic2Dec(String binary)
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

    public String Dec2Bin(String decimal)
    {
        int aux= Integer.parseInt(decimal);
        String binary1="";

        if(aux==1)
        {
            return "1";
        }

        int res=aux%2;
        aux=aux/2;
        binary1=binary1+String.valueOf(res);
        
        while(aux!=1 && aux!=0)
        {
            res=aux%2;
            aux=aux/2;
            binary1=binary1+String.valueOf(res);
        }

        binary1=binary1+"1";
        
        String binary2="";

        for(int i=binary1.length()-1;i>=0;i--)
        {
            binary2+=binary1.charAt(i);
        }
        
        return binary2;
    }



}
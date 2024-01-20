public class Reversestring 
{
    public static void main(String[] args) 
    {
        String sb = "TonyStark";
        String rev= "";
        

        for (int i =0 ; i <sb.length() ; i++) 
        {
            rev = sb.charAt(i) + rev; 
            
        }
        System.out.println(rev);  
    }

}
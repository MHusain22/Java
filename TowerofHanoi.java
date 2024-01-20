public class TowerofHanoi 
{
    public static void toh(int n, String src, String helper, String Des)
    {
        if (n==1) 
        {
            System.out.println("Transfer disk from " + n + " from " + src  + " to " + Des);
            return;
                
        }
        toh(n-1, src, Des , helper);
        System.out.println("Transfer disk from " + n + " from " + src  + " to " + Des);
        toh(n-1, helper, src, Des);
        // System.out.println("Transfer disk from" + n + " from " + src  + "to" + Des);
    }
    public static void main(String[] args) 
    {
        int n = 3;
        toh(n,"S", "H", "D");    
    }    
}


public class Solution {

    
    public static String defangIPaddr(String address) {
    
        return address.replace(".", "[.]");
            
      
}
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String res = defangIPaddr(address);
        System.out.println(res);
        
    }
    
}

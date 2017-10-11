public class APCSNotes{

    public static void main (String [] args){
        System.out.println(reverse("\fcat"));
        reverse1("coffee");
        System.out.println("min: " + min(2,3));
        System.out.println("min: " + min(2,3, -3));
        stars(5);
    }
    
    public static void stars ( int x){
        for (int i = x; i > 0; i--){
            for (int j = 1; j <=i; j++)
                System.out.print("*");
                System.out.println();
            
            }
    }
    
    public static int min (int x, int y, int z){
            if (x < y && x<z)
                return x;
            else if (y < x && y < z)
                return y;
            else 
                return z;
            }
            
   public static int min (int x, int y){
            if (x < y)
                return x;
            else
                return y;
            }
    
        public static String reverse (String s) {
        String temp = "";
        for (int x = s.length(); x>0; x--)
        temp += s.charAt(x-1);
        return temp;
    }
            
        public static void reverse1 (String s) {
        String temp = "";
        for (int x = s.length(); x>0; x--)
        temp += s.charAt(x-1);
        System.out.println(temp);
    }
    }
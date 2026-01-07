public class Test {
    public static void main(String[] args) {
 
        String[] strs ={};

    
        if (strs == null || strs.length == 0) {
         
            System.out.println("");
            return;
        }

        String prefix = strs[0];
        System.out.println("outside while loop "+prefix.length());
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                System.out.println("inside while loop prefix value "+prefix);
                if (prefix.isEmpty()) {
                   
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}

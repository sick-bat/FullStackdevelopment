public class RemoveNth {
        // public String removeCharacter(String str, int index) {
        public String remChar(String str,String c) {
     
     
            if (c.equals("")){
                // return "No character to be removed";
                return "";
                // throw new IndexOutOfBoundsException("Specify the character to be removed");
    
            }
            int index = str.indexOf(c.charAt(0));
    
            if (str.equals("")){
                
                // return "invalid string";
                return "";
            }
    
            if (index == -1){
    
                // throw new IndexOutOfBoundsException("Specify the character to be removed");
                // return "Specify the character to be removed";
                return "";
            }
    
            if (index < 0 || index >= str.length()) {
                // throw new IndexOutOfBoundsException("not present int the String");
                // return "not present in the string ";
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != c.charAt(0)) {
                    sb.append(str.charAt(i));
                    // System.out.println("this line "+str +" "+ sb);
                }
            }
            return sb.toString();
        }
        
    }
    
    


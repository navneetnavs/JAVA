package Recursion.DuplicatesRemove;

public class remove {
    public static void removeduplicates(String str, int i,StringBuilder newstr, boolean map[]){
        if(i==str.length()){
            System.out.println(str);
            return;
        }
        char currchar = str.charAt(i);
        if(map[currchar - 'a'] == true){
        removeduplicates(str, i+1, newstr, map);
        }
        else
        map[currchar - 'a'] = true;
        removeduplicates(str, i+1, newstr.append(currchar), map);
    }
    public static void main(String[] args) {
        String str ="navneetsinghhh";
        removeduplicates(str,0,new StringBuilder(" "),new boolean[26]);
    }
}

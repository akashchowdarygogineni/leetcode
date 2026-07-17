class Solution {
    public boolean rotateString(String s, String goal) {
        /**
        public static void main(String[] args) {
        String s="akash";
        
        int k=2;
        
        //left roatation of the string
        String s1=leftRotate(s,k);
        System.out.println("the substring after the  left rotation is:"+s1);
        
        //right rotation of the string
        String s2=rightRotate(s,k);
        System.out.println("the substring after the right  roattion is :"+s2);
    }
    public static String leftRotate(String s,int k)
    {
        return s.substring(k,s.length())+s.substring(0,k);
    }
    
    public static String rightRotate(String s,int k)
    {
        return s.substring(s.length()-k,s.length())+s.substring(0,s.length()-k);
    } */
     
    if(s.length()!=goal.length())
    {
        return false;
    }

    String temp=s+s;

    if(temp.contains(goal))
    {
        return true;
    }
    return false;

    }
}
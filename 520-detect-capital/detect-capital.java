class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(allUpper(word) || allLower(word) || firstUpper(word))
        {
            return true;
        }
        return false;

    }

    public static boolean allUpper(String word)
    {
        int count=0;

        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                count++;
            }
        }
        if(word.length()==count)
        {
            //uppercase
            return true;
        }
        return false;

    }

    public static boolean allLower(String word)
    {
        int count1=0;

        for(int i=0;i<word.length();i++)
        {
            if(Character.isLowerCase(word.charAt(i)))
            {
                count1++;
            }

        }
        if(count1==word.length())
        {
            return true;
        }
        return false;
    }

    public static boolean firstUpper(String word)
    {
        char ch=word.charAt(0);
         
        String s=word.substring(1);

        if(Character.isUpperCase(ch) && allLower(s))
        {
            return true;
        }
        return false;
    }
}
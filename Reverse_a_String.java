

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
            String s="";
        for(int i=str.length()-1;i>=0;i--){
          s= s+str.charAt(i);
        }
        return s;
    
    }
}

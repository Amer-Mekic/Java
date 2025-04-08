// Last updated: 08. 04. 2025. 13:45:42
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] str = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'I', 'i', 'o', 'O', 'U', 'u'));
        System.out.println(vowels);
        while(i<j){
            if(vowels.contains(str[i])){
                System.out.println("i:"+str[i]);
                System.out.println("j:"+str[j]);
                while(!vowels.contains(str[j])){
                    j--;
                }
                char c = str[i];
                str[i]=str[j];
                str[j]=c;
                i++;
                j--;
            }
            else
                i++;
        }
        return String.valueOf(str);
    }
}
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        int count = 0;
        for(int i = 0;i<jewels.length();i++){
            for(int j = 0;j<stones.length();j++){
                if(jewel[i]==stone[j])
                count++;
            }
        }
        return count;
    }
}
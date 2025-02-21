class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean mozeKusur = true;
        int petica = 0;
        int cenera = 0;
        int cvancika = 0;
        for(int i = 0; i<bills.length;i++){
            if(bills[i]==5)
                petica++;
            else if(bills[i]==10 && petica >= 1){
                petica--;
                cenera++;
            }
            else if(bills[i]==20 && ((petica>=1 && cenera>=1) || (petica>=3 && cenera==0))){
                if(cenera>=1 && petica>=1){
                    cenera--;
                    petica--;
                    cvancika++;
                }
                else if(cenera == 0 && petica>=3){
                    petica-=3;
                }  
            }
            else 
                return false;
        }
        return mozeKusur;
    }
}

public class App {
    public static int canCompleteCircuit(int[] gas, int[] cost)     {
        int sum1 = 0,sum2 = 0;
        for(int i = 0;i < gas.length;i++){
            sum1 += gas[i];
            sum2 += cost[i];
        }
        if(sum2 > sum1){return -1;}
        for(int i = 0;i < gas.length;i++){
            if(gas[i]>=cost[i]){
                if(tryit(i,gas,cost)){return i;}
            }
        }
        return -1;
    }
    public static boolean tryit(int i,int[] gas,int[] cost){
        int sum = gas[i]-cost[i];
        for(int j = (i+1)%gas.length ;j != i;){
            sum += (gas[j]-cost[j]);
            if(sum < 0){return false;}
            j++;
            if(j == gas.length){j = 0;}
        }
        return true;
    }
    public static void main(String[] args) {
        int[] gas = {5,8,2,8},cost = {6,5,6,6};
        canCompleteCircuit(gas, cost);
        
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static int packBackpack(int[] valueArray,int[] weightArray,int weight, int[] numberUserProducts){
        int size = valueArray.length;
        int result = 0;
        for(int i =0;i<size;i++){
            numberUserProducts[i] = weight/weightArray[i];
            weight -= numberUserProducts[i] * weightArray[i];
            result += numberUserProducts[i] * valueArray[i];
        }
        return result;
    }
}
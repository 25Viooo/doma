import java.util.Arrays;

public class bam {
    public static void main(String[] args) {
        //создаётся массив
        int [] massive = {344, 525, 284, 73, 66, 137, 153};

        boolean SortedOrNo = false;
        int forSwap;
        //
        while(!SortedOrNo) {
            SortedOrNo = true;
            //сравнение индексов
            for (int i = 0; i < massive.length-1; i++) {
                if(massive[i] > massive[i+1]){
                    SortedOrNo = false;
                    //индексы меняются местами
                    forSwap = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = forSwap;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
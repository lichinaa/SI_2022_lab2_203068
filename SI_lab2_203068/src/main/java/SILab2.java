import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2 {

//    public static void main(String[] args) {
//        List<String> list= Arrays.asList("#", "0", "#", "0", "#", "#", "0", "0", "#");
//        function(list);
//    }

    public static List<String> function(List<String> list) {

        if (list.size() <= 0) {   //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size();  //C
        int rootOfN = (int) Math.sqrt(n); //C

        if (rootOfN * rootOfN  != n) { //D
            throw new IllegalArgumentException("List length should be a perfect square"); //E
        }

        List<String> numMines = new ArrayList<>();  //F
        for (int i = 0; i < n; i++) {  //G
            if (!list.get(i).equals("#")) {  //H
                int num = 0;  //I
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {  //J
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){  //K
                        num += 2; //L
                    }
                    else {
                        num  += 1; //M
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //N
                    num++;  //O
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //P
                    num++;  //R
                }
                numMines.add(String.valueOf(num)); //S
            }
            else {
                numMines.add(list.get(i)); //T
            }
        }
        return numMines; //U
    }//V
}

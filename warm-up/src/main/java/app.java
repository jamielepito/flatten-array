import java.util.ArrayList;
import java.util.List;

public class app {
    public static <E> void main(String[] args) {
//        E [] arr  = (E[]) new String []{"a", "b", null, "c"};
        E[][] arr2 = (E[][]) new String[][]{
                {"a", "b", null, "c"},
                {"d", null},
                {null, "e"},
                {"f"}};

        List<E> flatList = flattenArray(arr2);
        System.out.println(flatList);

        E[][] arrInt = (E[][]) new Integer[][]{
                {1, 2, null, 3},
                {4, null},
                {null, 5},
                {6}};

        List<E> flatList2 = flattenArray(arrInt);
        System.out.println(flatList2);
    }

    public static <E> List<E> flattenArray(E[][] someArr) {
        ArrayList<E> flatList = new ArrayList<>();

        for (int i = 0; i < someArr.length; i++) {
            for(int j = 0; j < someArr[i].length ; j++) {
                if (someArr[i][j] != null) {
                    flatList.add(someArr[i][j]);
                }
            }
        }

        return flatList;
    }
}

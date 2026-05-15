
import java.util.ArrayList;
import java.util.Arrays;

class ArrangeArrayBySign {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 6, - 4, -1, 4));
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }

        int i = 0, posIdx = 0, negIdx = 0;
        while (posIdx < pos.size() && negIdx < neg.size()) {
            if (i % 2 == 0) {
                arr.set(i++, pos.get(posIdx++));
            } else {
                arr.set(i++, neg.get(negIdx++));
            }
        }

        while (posIdx < pos.size()) {
            arr.set(i++, pos.get(posIdx++));
        }

        while (negIdx < neg.size()) {
            arr.set(i++, neg.get(negIdx++));
        }

        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
    }
}

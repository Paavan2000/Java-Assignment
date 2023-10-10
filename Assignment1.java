import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Assignment1 {
	public static void main(String[] args) {
		// Create a list with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        // Shuffle the list
        Collections.shuffle(arrayList);

        // Print the shuffled list
        System.out.println(arrayList);
	}
}

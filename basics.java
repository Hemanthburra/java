import java.util.*;

public class sai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //map declaration
        Map<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        /*
        .get(key)
        .remove(key)
        .clear()
        .keySet()
        .size()
        */
        //vector declaration
        ArrayList<Integer> ans = new ArrayList<>();
        /*
        .add(value)
        .get(value)
        .remove(value)
        .set(index,value)
        .clear()
        .size()
        */
        //array declaration
        int[] arr = {1,2,3,4,5};
        
        for (int i = 0 ; i < 5 ; i++){
            ans.add(sc.nextInt());//pushing elements to the vector
        }
        for (Integer it : ans){
            System.out.print(it+" ");//printing the vector
        }
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");//printing the array
            mpp.put(i,arr[i]);//putting the elements in the map
        }
        for (Integer it : mpp.keySet()){ // to print the map keys and respective values
            System.out.println("key:"+it+" value:"+mpp.get(it));
        }
    
        //=================================================Collections ArrayList============================================================
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);

        System.out.println("Original ArrayList: " + numbers);

        // Sort the list in ascending order
        Collections.sort(numbers);
        //System.out.println("Sorted ArrayList: " + numbers);

        // Reverse the order of the elements in the list
        Collections.reverse(numbers);
        //System.out.println("Reversed ArrayList: " + numbers);

        // Shuffle the order of the elements in the list
        Collections.shuffle(numbers);
        //System.out.println("Shuffled ArrayList: " + numbers);

        // Get the maximum element in the list
        int max = Collections.max(numbers);
        //System.out.println("Maximum element in the ArrayList: " + max);

        // Replace all occurrences of 5 with 100
        Collections.replaceAll(numbers, 5, 100);
        //System.out.println("ArrayList after replacing 5 with 100: " + numbers);

        // Get the frequency of 7 in the list
        int frequency = Collections.frequency(numbers, 7);
        //System.out.println("Frequency of 7 in the ArrayList: " + frequency);
  
        
    }
}

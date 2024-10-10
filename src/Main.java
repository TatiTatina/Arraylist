import java.util.ArrayList;

public class Main {
        static int n = 4;
        static int[] intArray = new int[n];
        static ArrayList<Integer> intList = new ArrayList(n);
    public static void main(String[] args) {
    }
    public static void reverse(int[] intArray){
        int n = intArray.length - 1;
        System.out.println("Array: ");
        for(int i = 0; i < intArray.length / 2; i++){
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
        for(int i = 0; i < intArray.length; i++) System.out.print(intArray[i]+" ");
    }
    public static void listReverse(ArrayList intList){
        int n = intList.size()-1;
        System.out.println("List: ");
        for(int i = 0; i < (intList.size()) / 2; i++){
            Integer temp = (Integer) intList.get(i);
            intList.set(i,intList.get(n-i));
            intList.set((n - i),temp);
        }
        for (int i = 0; i < intList.size(); i++) System.out.print(intList.get(i)+" ");
    }
}
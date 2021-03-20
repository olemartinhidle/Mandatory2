package ArraySumProg;// Java program to print all subarrays
// in the array which has sum 0
import ArraySumProg.Combination;

import java.util.*;

public class SubArraySum
{
    // Function to print all subarrays in the array which
    // has sum 0
    static ArrayList<Combination> findSubArrays(int[] arr, int n)
    {
        // create an empty map
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        // create an empty vector of pairs to store
        // subarray starting and ending index
        ArrayList<Combination> out = new ArrayList<>();

        // Maintains sum of elements so far
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            // add current element to sum
            sum += arr[i];

            // if sum is 0, we found a subarray starting
            // from index 0 and ending at index i
            if (sum == 0)
                out.add(new Combination(0, i));
            ArrayList<Integer> al = new ArrayList<>();

            // If sum already exists in the map there exists
            // at-least one subarray ending at index i with
            // 0 sum
            if (map.containsKey(sum))
            {
                // map[sum] stores starting index of all subarrays
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++)
                {
                    out.add(new Combination(al.get(it) + 1, i));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        return out;
    }

    // Utility function to print all subarrays with sum 0
    static void print(ArrayList<Combination> out)
    {
        for (int i = 0; i < out.size(); i++)
        {
            Combination c = out.get(i);
            System.out.println("Subarray found from Index "
                    + c.first + " to " + c.second);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        int n = arr.length;

        ArrayList<Combination> out = findSubArrays(arr, n);

        // if we did not find any subarray with 0 sum,
        // then subarray does not exists
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
    }
}

// This code is contributed by rachana soma
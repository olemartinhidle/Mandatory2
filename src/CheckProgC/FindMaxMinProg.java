package CheckProgC;

import java.util.Arrays;

public class FindMaxMinProg {


        public static void main(String args[]){
            Integer array[] = new Integer[]{0, 4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};

            // Calling getMax() method for getting max value
            Integer max = getMax(array);
            System.out.println("Maximum value index is: "+max);

            // Calling getMin() method for getting min value
            Integer min = getMin(array);
            System.out.println("Minimum value index is: "+min);
        }

        // Method for getting the maximum value
        public static Integer getMax(Integer[] inputArray){
            Integer maxValue = inputArray[0];
            for(Integer i=1;i < inputArray.length;i++){
                if(inputArray[i] > maxValue){
                    maxValue = inputArray[i];
                }
            }
            return Arrays.asList(inputArray).indexOf(maxValue);
        }

        // Method for getting the minimum value
        public static Integer getMin(Integer[] inputArray){
            Integer minValue = inputArray[0];
            for(Integer i=1;i<inputArray.length;i++){
                if(inputArray[i] < minValue){
                    minValue = inputArray[i];
                }
            }
            return Arrays.asList(inputArray).indexOf(minValue);
        }
    }

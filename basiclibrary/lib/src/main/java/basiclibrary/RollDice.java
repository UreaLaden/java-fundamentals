package basiclibrary;

import java.util.HashSet;

public class RollDice {
    public static int[] roll(int n){
        int[] result = new int[n];
        int roll = 0;
        int idx = 0;
        int call;
        while(roll < n){
            double random = Math.random();
            if(random <= 1.0 && random > .85){ call = 1;   }
            else if(random <= .85 && random > .68){ call = 2;   }
            else if(random <=.68 && random > .51){ call = 3;   }
            else if(random <= .51 && random > .34){ call = 4;   }
            else if(random <= .34 && random > .17){ call = 5;   }
            else { call = 6; }
            result[idx] = call;
            idx++;
            roll++;
        }
        System.out.print("[");
        for(int num:result){
            System.out.print(num + " ");
        }
        System.out.print("] \n");
        return result;
    }

    public static boolean containsDuplicates(int[] arr)
    {
        HashSet<Integer> setArr = new HashSet<>();
        for(int num:arr){
            setArr.add(num);
        }
        return !(arr.length == setArr.size());
    }

    public static double findAverage(int[] arr){
        double sum = 0;
        double count = arr.length;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum/count);
        return sum / count;
    }

    public static double findSmallestAverage(int[][] arr){
        double smallestAvg = Double.MAX_VALUE;
        for (int[] ints : arr) {
            double currentAvg = findAverage(ints);
            if (currentAvg < smallestAvg) {
                smallestAvg = currentAvg;
            }
        }
        return smallestAvg;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] temp1 = {3, 1, 3, 1, 3};
        System.out.print(haveThree(temp1));
        int[] temp2 = {3, 1, 3,3};
        System.out.print(haveThree(temp2));
        int[] temp3 = {3, 4, 3, 3, 4};
        System.out.print(haveThree(temp3));
    }
    public static boolean haveThree(int[] arr)
    {
        int num = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 3)
            {
                if(i < arr.length-1)
                {
                    if(arr[i+1] != 3)
                    {
                        num++;
                    }
                }
                else
                {
                    if(arr[i-1] != 3)
                    {
                        num++;
                    }
                }
            }
        }
        if(num == 3)
        {
            return true;
        }
        return false;
    }
}

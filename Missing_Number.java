Time limit: 1.00 s Memory limit: 512 MB
You are given all numbers between 1, 2, ... , n except one. Your task is to find the
missing number.
Input
The first input line contains an integer n.
The second line contains n - 1 numbers. Each number is distinct and between 1
and n (inclusive).
Output
Print the missing number.
Constraints
.2<n <2.105
Example
Input:

5
2315
Output:
4

import java.util.*;
public class Missing_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long actualsum=0;
        long exceptedsum=(long) n*(n+1)/2;
        for(int i=0;i<n-1;i++)
        {
            actualsum+=sc.nextInt();
        }
        System.out.println(exceptedsum-actualsum);
    }
}

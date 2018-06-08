/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIS;
import java.util.Scanner;
/**
 *
 * @author Sudhanshu
 */
public class LongestIncreasingSequence {    
    public static void longestIncreasingSeq(int input1,int[] input2){
        int count=1,max=0;
        for(int i=1; i<input1; i++)
        {
            if(input2[i]>input2[i-1]){
                count++;
                if(max<count)
                    max=count;
            }
            else{
                count=1; 
            }
        }
        System.out.println("LIS: "+ max);
    }
    public static void main(String[] args) {
        int in1;
        Scanner sc = new Scanner(System.in);
        in1 = sc.nextInt();
        int[] in2 = new int[in1];
        for(int k=0; k<in1; k++)
        {
            in2[k] = sc.nextInt();
        }
        longestIncreasingSeq(in1,in2);
    }
    
}

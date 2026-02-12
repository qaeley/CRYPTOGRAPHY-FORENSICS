/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayPackage;

/**23
 * 
 *
 * @author joopa19
 */

import java.util.*;
import java.text.*;

public class Temperature19 {
    public static void main (String[] args){
        
        DecimalFormat dp = new DecimalFormat("0.00");
        int[][] monthTemp = new int[12][2];
        System.out.println("--------------------------------");
        getData(monthTemp);
        System.out.println("--------------------------------");
        System.out.println("Temperature Data");
        System.out.println("--------------------------------");
        System.out.println("Average Low: " + dp.format(averageLow(monthTemp)));
        System.out.println("Average High: " + dp.format(averageHigh(monthTemp)));
        System.out.println("Lowest Temperature Index: " + indexLowTemp(monthTemp) + " - Month of " + month(indexLowTemp(monthTemp)));
        System.out.println("Highest Temperature Index: " + indexHighTemp(monthTemp) + " - Month of " + month(indexHighTemp(monthTemp)));
    }
    
            
    public static void getData(int[][] array){
        Scanner input = new Scanner (System.in);
        System.out.println("Input the highest and lowest temperature for each month ");
        for(int i=0; i<12;){
            System.out.println("--------------------------------");
            System.out.println("Month " + (i+1) + ": " + month(i));
                System.out.print("Highest: " );
                array[i][0] = input.nextInt();
                System.out.print("Lowest: " );
                array[i][1] = input.nextInt();
                
                if(array[i][0]<array[i][1])
                    System.out.println("Invalid Input! Please try again");
                else
                    i++;
            }
        }
        //0 - High Temps | 1 - Low Temps
    
    
    public static float averageLow(int[][] array){
        float avg, sum = 0;
        for(int i=0; i<12; i++)
            sum += array[i][1];
        avg = sum / 12;
        return avg;
    }
    
    public static float averageHigh(int[][] array){
        float avg, sum = 0;
        for(int i=0; i<12; i++)
            sum += array[i][0];
        avg = sum / 12;
        return avg;
    }
    
    public static int indexLowTemp(int[][] array){
        int lowIndex = 0;
        
        for(int i=1; i<12; i++)
            if(array[i][1] < array[lowIndex][1])
                lowIndex = i;
        
        return lowIndex;
    }
    
    public static int indexHighTemp(int[][] array){
         int highIndex = 0;
        
        for(int i=1; i<12; i++)
            if(array[i][0] > array[highIndex][0])
                highIndex = i;
        
        return highIndex;      
    }
    
    public static String month(int index){
        switch(index){
            case 0:
                return "January"; 
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    
}


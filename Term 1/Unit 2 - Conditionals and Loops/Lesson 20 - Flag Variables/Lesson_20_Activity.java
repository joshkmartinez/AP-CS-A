
/*
 * Lesson 20 Coding Activity
 *
 * Computer science jobs are in demand. Right now we have a shortage
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs.
 * This means you specialize in an area like biology,
 * and then use computer programming to do your job.
 *
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 *
 * One of these jobs is computational biology. Computational Biology,
 * sometimes referred to as bioinformatics, is the science of
 * using biological data to develop algorithms and relations
 * among various biological systems.
 *
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. Well input the longitude and
 * latitude data from a tracking device. We want to investigate
 * the farthest north, south, east and west Gracie has been.
 *
 * We will use the latitude to measure this.
 * Write a program to enter Gracies longitude and Latitude data.
 * Each time through the loop it should ask if you want to continue.
 * Enter 1 to repeat, 0 to stop.
 *
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 *
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude:
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947
 *              Farthest West: 69.862
 *
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_20_Activity{
    public static void main(String[] args)
     {
      Scanner scan = new Scanner (System.in);

      int flag = 1;
      double lat = 0;
      double latMax = Integer.MIN_VALUE;
      double latMin = Integer.MAX_VALUE;
      double longi = 0;
      double longiMax = Integer.MIN_VALUE;
      double longiMin = Integer.MAX_VALUE;

      while(flag != 0){
        System.out.println("Please enter the latitude:");
        lat = scan.nextDouble();
        System.out.println("Please enter the longitude:");
        longi = scan.nextDouble();

        if((lat > latMax) && ((lat >= -90) && (lat <= 90))){
          latMax = lat;
        }
        if(lat < latMin && ((lat >= -90) && (lat <= 90))){
          latMin = lat;
        }
        if(longi > longiMax && ((longi >= -180) && (longi <= 180))){
          longiMax = longi;
        }
        if(longi < longiMin && ((longi >= -180) && (longi <= 180))){
          longiMin = longi;
        }

        if(((lat >= -90) && (lat <= 90)) && ((longi >= -180) && (longi <= 180))){
          System.out.println("Would you like to enter another location?");
        flag = scan.nextInt();
        }


      }
      System.out.println("Farthest North: " + latMax);
      System.out.println("Farthest South: " + latMin);
      System.out.println("Farthest East: " + longiMax);
      System.out.println("Farthest West: " + longiMin);
    }
}
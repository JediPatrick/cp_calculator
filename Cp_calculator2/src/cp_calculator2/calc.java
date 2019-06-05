/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_calculator2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author patrickbruus
 */
public class calc {
    
    public static void calccp(double attack,double defense, double stamina){
        Scanner in = new Scanner(System.in);  
        double level = 0;
        int levelset = 0;
        while(levelset == 0){
            System.out.print("Enter the level of the pokemon: ");
            try {
                level = in.nextDouble();
            }
            catch(Exception e) {
                System.out.println("error");
                level = 0.0;
            }
            if (level != 0.0 && level % 1 == 0.0 || level % 1 == 0.5){
                System.out.println("The level is : "+level);
                level=level+level-1; 
                levelset = 1; 
            }
            else {
                System.out.println("its not a real level");
            }
        }
        double CPMlevel;
        double [][] CPM = {{1,0.094},{1.5,0.135137432},{2,0.16639787},{2.5,0.192650919},{3,0.21573247},{3.5,0.236572661},{4,0.25572005},{4.5,0.273530381},{5,0.29024988},{5.5,0.306057377},{6,0.3210876},{6.5,0.335445036},{7,0.34921268},{7.5,0.362457751},{8,0.37523559},{8.5,0.387592406},{9,0.39956728},{9.5,0.411193551},{10,0.42250001},{10.5,0.432926419},{11,0.44310755},{11.5,0.4530599578},{12,0.46279839},{12.5,0.472336083},{13,0.48168495},{13.5,0.4908558},{14,0.49985844},{14.5,0.508701765},{15,0.51739395},{15.5,0.525942511},{16,0.53435433},{16.5,0.542635767},{17,0.55079269},{17.5,0.558830576},{18,0.56675452},{18.5,0.574569153},{19,0.58227891},{19.5,0.589887917},{20,0.59740001}       ,{20.5,0.604818814},{21,0.61215729},{21.5,0.619399365},{22,0.62656713},{22.5,0.633644533},{23,0.64065295},{23.5,0.647576426},{24,0.65443563},{24.5,0.661214806},{25,0.667934},{25.5,0.674577537},{26,0.68116492},{26.5,0.687680648},{27,0.69414365},{27.5,0.700538673},{28,0.70688421},{28.5,0.713164996},{29,0.71939909},{29.5,0.725571552},{30,0.7317},{30.5,0.734741009},{31,0.73776948},{31.5,0.740785574},{32,0.74378943},{32.5,0.746781211},{33,0.74976104},{33.5,0.752729087},{34,0.75568551},{34.5,0.758630378},{35,0.76156384},{35.5,0.764486065},{36,0.76739717},{36.5,0.770297266},{37,0.7731865},{37.5,0.776064962},{38,0.77893275},{38.5,0.781790055},{39,0.78463697},{39.5,0.787473578},{40,0.79030001}};
        double IVattack = 15.0;
        double IVdefense = 15.0;
        double IVstamina = 15.0;
        
        System.out.println("Enter the attack IV of the pokemon: ");

        try {
            IVattack = (double)in.nextInt();
        }
        catch(Exception e) {
            System.out.println("error");
        }
        System.out.println("Enter the defense IV of the pokemon: ");
        try {
            IVdefense= (double)in.nextInt();
        }
        catch(Exception e) {
            System.out.println("error");
        }
        System.out.println("Enter the stamina IV of the pokemon: ");
        try {
            IVstamina = (double)in.nextInt();
        }
        catch(Exception e) {
            System.out.println("error");
        }
       
        attack = attack+IVattack;
        defense = defense+IVdefense;
        stamina = stamina+IVstamina;
        for (int i = (int)level; i < CPM.length; i++){
            CPMlevel = CPM[i][1];
            int totalattack = (int)(attack*CPMlevel);
            int totaldefense = (int)(defense*CPMlevel);
            int totalstamina = (int)(stamina*CPMlevel);
            int totalstats = (int)(attack*CPMlevel*defense*CPMlevel*Math.floor(stamina*CPMlevel)/1000);

            CPMlevel = Math.pow(CPMlevel, 2);
            
            //System.out.println("attack "+attack+" defense "+defense+" stamina "+stamina+" CPM "+CPMlevel);
            double CP = (Math.pow(stamina, 0.5)*attack*Math.pow(defense, 0.5)*CPMlevel)/10;
            CP = Math.floor(CP);
            
            System.out.println("Lvl "+CPM[i][0]+" "+(int)CP+ " CP and the totalstats is "+totalstats+" att:"+totalattack+" def:"+totaldefense+" HP:"+totalstamina);
            
        }
    }
    
    public static void calccponeline(double attack,double defense, double stamina, double IVattack, double IVdefense, double IVstamina, double[][] array2d ){
        double[] array = {array2d[0][0],array2d[0][1],array2d[0][2],array2d[0][3],array2d[0][4],array2d[0][5],array2d[0][6],array2d[0][7],array2d[0][8]};

        double level = 0.0;
        String pokemonstats = ""; 
        double maxtotalstats = 0.0;
        double CPMlevel;
        double [][] CPM = {{1,0.094},{1.5,0.135137432},{2,0.16639787},{2.5,0.192650919},{3,0.21573247},{3.5,0.236572661},{4,0.25572005},{4.5,0.273530381},{5,0.29024988},{5.5,0.306057377},{6,0.3210876},{6.5,0.335445036},{7,0.34921268},{7.5,0.362457751},{8,0.37523559},{8.5,0.387592406},{9,0.39956728},{9.5,0.411193551},{10,0.42250001},{10.5,0.432926419},{11,0.44310755},{11.5,0.4530599578},{12,0.46279839},{12.5,0.472336083},{13,0.48168495},{13.5,0.4908558},{14,0.49985844},{14.5,0.508701765},{15,0.51739395},{15.5,0.525942511},{16,0.53435433},{16.5,0.542635767},{17,0.55079269},{17.5,0.558830576},{18,0.56675452},{18.5,0.574569153},{19,0.58227891},{19.5,0.589887917},{20,0.59740001}       ,{20.5,0.604818814},{21,0.61215729},{21.5,0.619399365},{22,0.62656713},{22.5,0.633644533},{23,0.64065295},{23.5,0.647576426},{24,0.65443563},{24.5,0.661214806},{25,0.667934},{25.5,0.674577537},{26,0.68116492},{26.5,0.687680648},{27,0.69414365},{27.5,0.700538673},{28,0.70688421},{28.5,0.713164996},{29,0.71939909},{29.5,0.725571552},{30,0.7317},{30.5,0.734741009},{31,0.73776948},{31.5,0.740785574},{32,0.74378943},{32.5,0.746781211},{33,0.74976104},{33.5,0.752729087},{34,0.75568551},{34.5,0.758630378},{35,0.76156384},{35.5,0.764486065},{36,0.76739717},{36.5,0.770297266},{37,0.7731865},{37.5,0.776064962},{38,0.77893275},{38.5,0.781790055},{39,0.78463697},{39.5,0.787473578},{40,0.79030001}};

       
        attack = attack+IVattack;
        defense = defense+IVdefense;
        stamina = stamina+IVstamina;
        for (int i = (int)level; i < CPM.length; i++){
            CPMlevel = CPM[i][1];
            int totalattack = (int)(attack*CPMlevel);
            int totaldefense = (int)(defense*CPMlevel);
            int totalstamina = (int)(stamina*CPMlevel);
            double totalstats = (attack*CPMlevel*defense*CPMlevel*Math.floor(stamina*CPMlevel));

            CPMlevel = Math.pow(CPMlevel, 2);
            
            //System.out.println("attack "+attack+" defense "+defense+" stamina "+stamina+" CPM "+CPMlevel);
            double CP = (Math.pow(stamina, 0.5)*attack*Math.pow(defense, 0.5)*CPMlevel)/10;
            CP = Math.floor(CP);
            if (CP > 1500){
                break;
            }
            maxtotalstats = totalstats;
            pokemonstats = ("Lvl "+CPM[i][0]+" "+(int)CP+ " CP and the totalstats is "+(int)totalstats+" att:"+totalattack+" def:"+totaldefense+" HP:"+totalstamina+" IV "+(int)IVattack+":"+(int)IVdefense+":"+(int)IVstamina);
            
        }
        int number = 0;
        for (int i = array2d.length-1; i >= 0;i--) {
            //double IVrating = round((((double)array2d[i][6]+(double)array2d[i][7]+(double)array2d[i][8])/45*100),2);
            //System.out.println("At lvl " + array2d[i][1] + " CP is: " + (int)array2d[i][2] + " and the totalstats is " + (int)array2d[i][0] + " att " + round(array2d[i][3],1) +  " def " + round(array2d[i][4],1) + " HP " + (int)array2d[i][5] + " with the IV " + (int)array2d[i][6] + ":" + (int)array2d[i][7] + ":" + (int)array2d[i][8]+" and IV is "+IVrating+"%"+" number "+(i+1));
  
            if ((int)array2d[i][6] ==  IVattack && (int)array2d[i][7] == IVdefense && (int)array2d[i][8] == IVstamina){
                   number = i+1;

                }
        }
        double procent = findpokemon.round((maxtotalstats/array[0]*100), 2);
        System.out.println(array[0] +" "+maxtotalstats+"  "+" number "+number);

        System.out.println(pokemonstats+" "+procent+"%"+" number "+number);
    }
    
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static double[][] bubblesort(double array[][]){
        while(true){
            int isthearraysortet = 1;
            for (int i= 0;i < array.length-1;i++){
                //System.out.print("sorting");
                if (array[i][0] < array[i+1][0]){
                    isthearraysortet = 0;
                    double temptotalstats = array[i][0];
                    double templevel = array[i][1];
                    double tempcp = array[i][2];
                    double temptotalattack = array[i][3];
                    double temptotaldefense = array[i][4];
                    double temptotalstamina = array[i][5];
                    double tempj = array[i][6];
                    double tempk = array[i][7];
                    double templ = array[i][8];
                    
                    array[i][0] = array[i+1][0];
                    array[i][1] = array[i+1][1];
                    array[i][2] = array[i+1][2];
                    array[i][3] = array[i+1][3];
                    array[i][4] = array[i+1][4];
                    array[i][5] = array[i+1][5];
                    array[i][6] = array[i+1][6];
                    array[i][7] = array[i+1][7];
                    array[i][8] = array[i+1][8];
                    
                    array[i+1][0] = temptotalstats;
                    array[i+1][1] = templevel;
                    array[i+1][2] = tempcp;
                    array[i+1][3] = temptotalattack;
                    array[i+1][4] = temptotaldefense;
                    array[i+1][5] = temptotalstamina;
                    array[i+1][6] = tempj;
                    array[i+1][7] = tempk;
                    array[i+1][8] = templ;
                }        
            }
            
            if (isthearraysortet == 1){
                System.out.println("done sorting");
                return array;    
            }
        }
    }

    public static double[][] quicksort(double array[][]){
        while(true){
            int randompick = array.length/2;
            System.out.println(" random pick is "+randompick+" and it has the value "+array[randompick][0]);

            double[][] sortetarray = new double[array.length][9];
            int sortlowerbound = 0;
            int sortupperbound = array.length-1;
            System.out.println("sorting");

            for (int i = 0;i < array.length;i++){
                if (array[i][0] <= array[randompick][0] && i != randompick){
                    sortetarray[sortlowerbound][0] = array[i][0];
                    sortetarray[sortlowerbound][1] = array[i][1];
                    sortetarray[sortlowerbound][2] = array[i][2];
                    sortetarray[sortlowerbound][3] = array[i][3];
                    sortetarray[sortlowerbound][4] = array[i][4];
                    sortetarray[sortlowerbound][5] = array[i][5];
                    sortetarray[sortlowerbound][6] = array[i][6];
                    sortetarray[sortlowerbound][7] = array[i][7];
                    sortetarray[sortlowerbound][8] = array[i][8];
                    sortlowerbound++;
                }
                if (array[i][0] > array[randompick][0]){
                    sortetarray[sortupperbound][0] = array[i][0];
                    sortetarray[sortupperbound][1] = array[i][1];
                    sortetarray[sortupperbound][2] = array[i][2];
                    sortetarray[sortupperbound][3] = array[i][3];
                    sortetarray[sortupperbound][4] = array[i][4];
                    sortetarray[sortupperbound][5] = array[i][5];
                    sortetarray[sortupperbound][6] = array[i][6];
                    sortetarray[sortupperbound][7] = array[i][7];
                    sortetarray[sortupperbound][8] = array[i][8];
                    sortupperbound--;
                }     
            }
          
            sortetarray[sortlowerbound][0] = array[randompick][0];
            sortetarray[sortlowerbound][1] = array[randompick][1];
            sortetarray[sortlowerbound][2] = array[randompick][2];
            sortetarray[sortlowerbound][3] = array[randompick][3];
            sortetarray[sortlowerbound][4] = array[randompick][4];
            sortetarray[sortlowerbound][5] = array[randompick][5];
            sortetarray[sortlowerbound][6] = array[randompick][6];
            sortetarray[sortlowerbound][7] = array[randompick][7];
            sortetarray[sortlowerbound][8] = array[randompick][8];
            System.out.println("done sorting");
            return sortetarray;         
        }
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_calculator2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patrickbruus
 */
public class findiv {
    public static double[][] calc_iv_comb(double attack,double defense, double stamina){
        double [][] CPM = {{1,0.094},{1.5,0.135137432},{2,0.16639787},{2.5,0.192650919},{3,0.21573247},{3.5,0.236572661},{4,0.25572005},{4.5,0.273530381},{5,0.29024988},{5.5,0.306057377},{6,0.3210876},{6.5,0.335445036},{7,0.34921268},{7.5,0.362457751},{8,0.37523559},{8.5,0.387592406},{9,0.39956728},{9.5,0.411193551},{10,0.42250001},{10.5,0.432926419},{11,0.44310755},{11.5,0.4530599578},{12,0.46279839},{12.5,0.472336083},{13,0.48168495},{13.5,0.4908558},{14,0.49985844},{14.5,0.508701765},{15,0.51739395},{15.5,0.525942511},{16,0.53435433},{16.5,0.542635767},{17,0.55079269},{17.5,0.558830576},{18,0.56675452},{18.5,0.574569153},{19,0.58227891},{19.5,0.589887917},{20,0.59740001},{20.5,0.604818814},{21,0.61215729},{21.5,0.619399365},{22,0.62656713},{22.5,0.633644533},{23,0.64065295},{23.5,0.647576426},{24,0.65443563},{24.5,0.661214806},{25,0.667934},{25.5,0.674577537},{26,0.68116492},{26.5,0.687680648},{27,0.69414365},{27.5,0.700538673},{28,0.70688421},{28.5,0.713164996},{29,0.71939909},{29.5,0.725571552},{30,0.7317},{30.5,0.734741009},{31,0.73776948},{31.5,0.740785574},{32,0.74378943},{32.5,0.746781211},{33,0.74976104},{33.5,0.752729087},{34,0.75568551},{34.5,0.758630378},{35,0.76156384},{35.5,0.764486065},{36,0.76739717},{36.5,0.770297266},{37,0.7731865},{37.5,0.776064962},{38,0.77893275},{38.5,0.781790055},{39,0.78463697},{39.5,0.787473578},{40,0.79030001}};
        ArrayList<Double> combs = new ArrayList<>();
        boolean highIVfilter = false;
        boolean IVfilterset = false;
        Scanner in = new Scanner(System.in);
               
                    while (IVfilterset == false){
                            int temp = 0;
                            System.out.println("Do you want highIVfilter");
                            try {
                                temp = in.nextInt();
                            }
                            catch(Exception e){
                                System.out.println("error");
                            }
                            if (temp == 1 || temp == 2){
                                if (temp == 2){
                                    highIVfilter = true;
                                }
                                IVfilterset = true;
                            }
                            

                    }
        int loop = 0;
        int levelstartindex = 0;
        double IVattack = attack+15;
        double IVdefense = defense+15;
        double IVstamina = stamina+15;
        double CPmax = 1500;
        double CPfloor;
        int IVfilterfloor = 0;
        double CPzeroIV = (Math.pow(stamina, 0.5)*attack*Math.pow(defense, 0.5)*Math.pow(CPM[CPM.length-1][1], 2))/10;
        double CPmaxIV = (Math.pow((stamina+15), 0.5)*(attack+15)*Math.pow((defense+15), 0.5)*Math.pow(CPM[CPM.length-1][1], 2))/10;
        
        //Checks if level 40 with 0% IV is lower than the league max CP
        if (CPzeroIV <= CPmax){
            CPfloor = CPzeroIV;
            //Checks if level 40 with 100% IV is lower than the league max CP
            if (CPmaxIV <= CPmax){
                //Sets the the start value so level 40 is the only level looked at
                levelstartindex = CPM.length-1;
            }   
        }
        else {
            CPfloor = CPmax-50;
        }

        System.out.println(CPmaxIV);
        if (levelstartindex == 0){
            //Checks at what level it should start looking for IV
            for (int i = 0; i < CPM.length; i++){
                double CP = (Math.pow(IVstamina, 0.5)*IVattack*Math.pow(IVdefense, 0.5)*Math.pow(CPM[i][1], 2))/10;
                //System.out.println("CP is "+CP+" and lvl "+CPM[i][0]+" CPM "+CPMlevel+" at index "+i);
                //iv calculates the closest 100% IV level below and starts from set the start level to that
                CP = Math.floor(CP);
                if (CP > CPmax){
                    levelstartindex = i-1;
                    System.out.println("Index "+i);
                    break;

                }            
            }
        }
        if (highIVfilter == true){
            IVfilterfloor = 10;
        }
        for (int j = IVfilterfloor; j <= 15; j++){
            for (int k = IVfilterfloor; k <= 15; k++){
                for (int l = IVfilterfloor; l <= 15; l++){
                    double defenseCPM = Math.pow(defense+k, 0.5);
                    double staminaCPM = Math.pow(stamina+l, 0.5);
                    for (int i = levelstartindex; i < CPM.length; i++){
                        double CPMlevel = CPM[i][1];
                        loop++;
                        //double totalstats = ((attack+j)*CPMlevel*(defense+k)*CPMlevel*Math.floor((stamina+l)*CPMlevel)/1000);
                        //double totalstats = ((int)((attack)*CPMlevel)*(int)((defense)*CPMlevel)*Math.floor(((stamina)*CPMlevel)));

                        double totalstats = (((attack+j)*CPMlevel)*((defense+k)*CPMlevel)*Math.floor((stamina+l)*CPMlevel));

                        double totalattack = ((attack+j)*CPMlevel);
                        double totaldefense = ((defense+k)*CPMlevel);
                        double totalstamina = ((stamina+l)*CPMlevel);
                        //double totalstats = attack * defense * (int)stamina;
                        CPMlevel = Math.pow(CPMlevel, 2);
                        double CP = ((attack+j)*defenseCPM*staminaCPM*CPMlevel)/10;
                        CP = Math.floor(CP);
                        if (CP > CPmax){
                            break;
                        }
                        
                        if (CP >= Math.floor(CPfloor) && CP <= CPmax) {
                            combs.add(totalstats);
                            combs.add(CPM[i][0]);
                            combs.add(CP);
                            combs.add(totalattack);
                            combs.add(totaldefense);
                            combs.add(totalstamina);
                            combs.add((double)j);
                            combs.add((double)k);
                            combs.add((double)l);
                            //System.out.println("At level "+CPM[i][0]+" CP is: "+CP+ " and the totalstats is "+totalstats+" attack "+totalattack+" defense "+totaldefense+" stamina "+totalstamina+" with the IV "+j+":"+k+":"+l);
                        }
                    }
                }   
            }
        }
        System.out.println("IV combs looped in "+loop);
        System.out.println("combs size "+combs.size()/9);

        double[][] array2d = new double[combs.size()/9][9];
        int t = 0;
        while(combs.isEmpty()==false){            
            array2d[t][0] = combs.remove(0);//totalstats
            array2d[t][1] = combs.remove(0);//level
            array2d[t][2] = combs.remove(0);//cp
            array2d[t][3] = combs.remove(0);//totalattack
            array2d[t][4] = combs.remove(0);//totaldefense
            array2d[t][5] = combs.remove(0);//totalstamina
            array2d[t][6] = combs.remove(0);//Attack IV
            array2d[t][7] = combs.remove(0);//Defense IV
            array2d[t][8] = combs.remove(0);//Stamina IV
            //System.out.println("copied data "+array2d[t][0]+array2d[t][1]+array2d[t][2]+array2d[t][3]+array2d[t][4]+array2d[t][5]+array2d[t][6]+array2d[t][7]+array2d[t][8]);
            t++;
        }
        
        
        array2d = calc.bubblesort(array2d);
        int printcutoff = 50;
        if (array2d.length == 0){
            System.out.println("Array is empty");
        }
        else{
            if (array2d.length <= printcutoff){
                printcutoff = array2d.length-1;
            }
            print_csv(array2d,3000);
            print(array2d,printcutoff);
            
        }
        double test[] = {array2d[0][0],array2d[0][1],array2d[0][2],array2d[0][3],array2d[0][4],array2d[0][5],array2d[0][6],array2d[0][7],array2d[0][8]};
        return array2d;
    }

    private static void print_csv(double [][]array2d,int printcutoff){
        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Rank#,LVL,CP,Totalstats,Attack,Defense,Stamina,Attack IV,Defense IV,Stamina IV,IV procent");
                sb.append('\n');
                for (int i = printcutoff; i >= 0;i--) {
                    double IVrating = round((((double)array2d[i][6]+(double)array2d[i][7]+(double)array2d[i][8])/45*100),2);
                    String IVratings = Double.toString(IVrating);
                    IVratings = IVratings.replace('.',',');
                
                    sb.append((i+1)+"," + array2d[i][1] + "," + (int)array2d[i][2] + "," + round(array2d[i][0],0) + ","+((int)array2d[i][3]+ (int)array2d[i][4] + (int)array2d[i][5]) +"," + (int)array2d[i][3] +  "," + (int)array2d[i][4] + "," + (int)array2d[i][5] + "," + (int)array2d[i][6] + "," + (int)array2d[i][7] + "," + (int)array2d[i][8]+",\""+IVratings+"\"");
                    sb.append('\n');
                }
                writer.write(sb.toString());
                System.out.println("done!");

            } 
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
    }
    
    private static void print(double [][]array2d,int printcutoff) {
        for (int i = printcutoff-1; i >= 0;i--) {
                double IVrating = round((((double)array2d[i][6]+(double)array2d[i][7]+(double)array2d[i][8])/45*100),2);
                System.out.println("#"+(i+1)+" At lvl " + array2d[i][1] + " CP is: " + (int)array2d[i][2] + " and the totalstats is " + (int)array2d[i][0] + " att " + round(array2d[i][3],1) +  " def " + round(array2d[i][4],1) + " HP " + (int)array2d[i][5] + " with the IV " + (int)array2d[i][6] + ":" + (int)array2d[i][7] + ":" + (int)array2d[i][8]+" and IV is "+IVrating+"%");
            }
    }
    
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    

}

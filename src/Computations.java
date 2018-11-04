import java.util.Scanner;
import  java.io.*;

public class Computations {

    double DIA;
    double UT;
    double LT;
    double L;
    double RA;
    int OP_NR=4;

    public static void main(String[] args){

        Computations COMP = new Computations();

        //COMP.GetInput();
        COMP.NrOperation();
        COMP.Prologue();
        COMP.Serious();
    }

    public void GetInput() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Diameter = ");
        double DIA = keyboard.nextDouble();
        System.out.print("Upper Tol = ");
        double UT = keyboard.nextDouble();
        System.out.print("Lower Tol = ");
        double LT = keyboard.nextDouble();
        System.out.print("Lenght = ");
        double L = keyboard.nextDouble();
        System.out.print("Roughness = ");
        double RA = keyboard.nextDouble();

        //For debugging
        //System.out.println(DIA);
        //System.out.println(UT);
        //System.out.println(LT);
        //System.out.println(L);
        //System.out.println(RA);
    }

    public void NrOperation() {

        if (RA == 0.8) {
            OP_NR = 4;
        }
        if (RA == 1.6) {
            OP_NR = 3;
        }
        if (RA == 3.2) {
            OP_NR = 2;
        }
        if (RA == 6.4) {
            OP_NR = 1;
        }
    }
    public void Prologue() {

        try{
            FileWriter writer = new FileWriter("TCM.txt");
            writer.write("Pentru obținerea suprafetei respective se efectueaza urmatoarele operatii:");
            writer.write("\n");
            writer.write("\n");
            if(OP_NR>=1) {
                writer.write("Strunjire de degrosare");
            }if(OP_NR>=2) {
                writer.write("\n");
                writer.write("Strunjire de finisare");
            }if(OP_NR>=3) {
                writer.write("\n");
                writer.write("Rectificare de degrosare");
            }if(OP_NR>=4) {
                writer.write("\n");
                writer.write("Rectificare de finisare");
            }
            writer.close();
        }catch (IOException ex) {}
    }

    public void Serious(){
         if(OP_NR>=1) {

        }if(OP_NR>=2) {

        }if(OP_NR>=3) {

        }if(OP_NR>=4) {

        }

    }


}
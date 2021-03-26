/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicSimulator;

import datastructures.Signal;
import java.util.ArrayList;

/**
 *
 * @author clayt
 */
public class Test_Item {
    
    private ArrayList <Integer> inputVector;
    private String outputFreeFault;
    private String faultOutput;
    private Signal faultSignals;
    private ArrayList <Signal> allfaultSignals;
    private int originalSignalValue;
    private int faultSignalValue;
    private int index;
    private long threadID;
    
    public Test_Item(ArrayList <Integer> inputVector, Signal faultSignal, int input_pos) {
            this.faultSignals = faultSignal;
            this.inputVector = inputVector;
            //this.faultSignalValue = sigValue;
            this.index = input_pos;
            this.threadID = 0;
            this.allfaultSignals = new ArrayList<>();
            
    }
    
     public String getBitFlip(){
            
            String bitflip;
            String r = "";
           
            if(this.originalSignalValue == 0){
                bitflip = "1";
            }
            else{
                bitflip = "0";
            }
            
            r = "("+ this.originalSignalValue + ")to("+ bitflip + ")";
            
            return r;
            
            
        }
    
     public void setThreadID(long id){
         this.threadID = id;
     }
    
     public void setFaultSignalValue(int FaultSigValue){
         this.faultSignalValue = FaultSigValue;
     }
     
     public void setSignalOriginalValue(int SigValue){
         this.originalSignalValue = SigValue;
         
         if(this.originalSignalValue == 0){
             this.faultSignalValue = 1;
         }
         else{
             this.faultSignalValue = 0;
         }
             
         
     }
     
     public int getSignalOriginalValue(){
        return this.originalSignalValue;
     }
      
     public int getFaultSignalValue(){
        return this.faultSignalValue;
     }
    
    
    /*
     public void setSigValue(int x){
        this.originalSignalValue = x;
    }
*/

     public void setFaultFreeOutput(String output){
        this.outputFreeFault = output;
    }
     
     public void setFaultOutput(String output){
        this.faultOutput = output;
    }
     
     public String getFaultOutput(){
        return this.faultOutput;
    }
     
     public String getOrignalOutput(){
        return this.outputFreeFault;
    }
    
     public Object getItem(){
        System.out.println("This: "+ this.faultSignals);
        return this;
    }
     
     public Signal getFaultSignal(){
        return this.faultSignals;
    }
    
     public ArrayList <Integer> getinputVector(){
        return this.inputVector;
    }
     
     public int getSimulationIndex(){
        return this.index;
    }
    
}
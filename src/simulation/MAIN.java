package simulation;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class MAIN {  //Class to run debug tests
    int threads;
    int sample;
    String reliabilityConst;
    String relativePath;
    String genlib;
    String OUTPUT_INFO;

    public MAIN(int threads, String reliabilityConst, String relativePath, String genlib){
            this.threads = threads;
            this.reliabilityConst = reliabilityConst;
            this.relativePath = relativePath;
            this.genlib = genlib;
    }

    public void runloop(SimulationInLot simulationInLotDebug) throws Exception {


        /*
        s953
                s5378
        s9234
                s15850
        s38417
                s35932
        s38584

             */
        //SimulationMode sim_mtf_debug = new SimulationMode(simulationInLotDebug.getCircuitListSpecs().get(4)); // first Circuit c.v
        //    sim_mtf_debug.PrintAVGSensitiveAreasCompiled("ok/", "45nm_HP.pm", "Library.txt");

             /*
        SimulationInLot simulationInLot = new SimulationInLot();
        simulationInLot.setup(relativePath, genlib, threads);
        simulationInLot.processParser(signalsToinjectFault, constReliability, sampleSize);  //STF's - String signalsToinjectFault, String reliabilityConst, int sampleSize
                //simulationInLot.processParser(signalsToinjectFault, constReliability, mtf_sizes); // MTF's
                simulationInLot.print();

        SimulationMode sim_stf = new SimulationMode(simulationInLot.getCircuitListSpecs().get(0)); // first Circuit c.v


        ///sim_stf.monteCarloSTFSimulation();
                //sim_stf.multithreadingSimulationExaustic();
                   //sim_stf.multithreadingSimulationExausticComplete();
                        //     sim_stf.monteCarloSimulationMultipleTransientFaultsProportion();



        SimulationInLot simulationInLotMTF = new SimulationInLot();
        simulationInLotMTF.setup(relativePath, genlib, threads);
        simulationInLotMTF.processParser(signalsToinjectFault, constReliability, mtf_sizes);

            SimulationMode sim_mtf = new SimulationMode(simulationInLotMTF.getCircuitListSpecs().get(0)); // first Circuit c.v
                //sim_mtf.monteCarloSimulationMultipleTransientFaults();
                    //sim_mtf.monteCarloSimulationMultipleTransientFaultsProportionAndCalculationOfSensitiveArea("netlist_files/", "45nm_HP.pm", "Library.txt");
                     //sim_mtf.monteCarloSimulationMultipleTransientFaultsProportionAndCalculationOfSensitiveArea();


        //SimulationSpiceNetlistCircuit simulationElectric= new SimulationSpiceNetlistCircuit();
            //simulationElectric.setup(relativePath + "netlist_files/", relativePath + "Library.txt");
                //simulationElectric.processParserSpiceNetlists();
                    //sim_mtf.runElectricalSimulation(relativePath , "netlist_files/" + simulationElectric.getCircuitsListName().get(4));  // fixed


        */
        //simulationInLotDebug.setup("circuitos/fullv2/", "lib_full_no_cost.genlib", threads);
        //simulationInLotDebug.setup("circuitos/ISCAS89/min/", "lib_min_no_cost.genlib", threads);
        /*
        simulationInLotDebug.setup("circuitos/ISCAS89/min/", "lib_min_no_cost.genlib", threads);
        sx.setup("circuitos/ISCAS89/fullv2/", "lib_full_no_cost.genlib", threads);
        epfl.setup("teste/mapped/EPFL2015/1-minimal_no_cost/", "1-minimal_no_cost.genlib", threads);

         */
        /*
        simulationInLotDebug.processParser(signalsToinjectFault, constReliability, mtf_sizes);
        sx.processParser(signalsToinjectFault, constReliability, mtf_sizes);
        epfl.processParser(signalsToinjectFault, constReliability, mtf_sizes);
        */


        for (int i = 0; i < simulationInLotDebug.getCircuitListSpecs().size(); i++) {


            SimulationMode sim_mtf_debug = new SimulationMode(simulationInLotDebug.getCircuitListSpecs().get(i)); // first Circuit c.v
            try {
                    sim_mtf_debug.monteCarloReliabilityAPI("");
                // sim_mtf_debug.GateCounter();

                //gates.add(sim_mtf_debug.OUTPUT_INFO);
                //sim_mtf_debug.faultToleranceExhaustiveCompleteMETAPI();
                ///sim_mtf_debug.faultToleranceExhaustiveSETAPI();
                //samples.add(sim_mtf_debug.getOutput_sample());
                //sim_mtf_debug.monteCarloReliabilityAPI("ok/", "45nm_HP.pm", "Library.txt");
                //sim_mtf_debug.monteCarloReliabilityAPI();
                //sim_mtf_debug.runElectricalSimulation();
                //-Xms2G -Xmx7G  para ISCAS89
           }catch (Exception e){
               System.out.println("- WARNING --- Some error happen in simulation test: " + e);
        }

        }
        System.out.println("---------------------- END ----------------------");
    }

    public static void main(String[] args) throws Exception{

            System.out.println("- New methodology....");
            MAIN experiment = new MAIN(0 ,"", "", "");
            String relativePath = "teste/demo/";
            String genlib = "cadence.genlib";//"lib_min_no_cost.genlib"; //"cadence.genlib";
            String signalsToinjectFault = "ALL_SIGNALS";
            String constReliability = "0.9999";




        int threads = 8;

        ArrayList<Float> mtf_sizes = new ArrayList<>();  //MTF's
        mtf_sizes.add((float) 100);
        mtf_sizes.add((float) 1);
        mtf_sizes.add((float) 0);
        mtf_sizes.add((float) 0);


        SimulationInLot circuits_folder = new SimulationInLot();

        circuits_folder.setup(relativePath, genlib, threads);
        circuits_folder.processParser(signalsToinjectFault, constReliability, mtf_sizes);
        circuits_folder.print();

        SimulationMode sim_mtf_debug = new SimulationMode(circuits_folder.getCircuitListSpecs().get(0));

        sim_mtf_debug.faultToleranceExhaustiveSETAPI();    // Exaustiva Simples

        sim_mtf_debug.faultToleranceExhaustiveCompleteMETAPI();  // Exaustiva Completa

        sim_mtf_debug.monteCarloReliabilityAPI("teste/demo/lookup_table.csv");  // Monte Carlo (n)





    }
}

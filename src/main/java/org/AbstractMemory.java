package org;

import java.sql.Timestamp;
import java.util.Arrays;

public abstract class AbstractMemory implements Memorable {

    int saveRawStep;
    int saveStep;
    int batchSize;
    int epochs;
    int iterations;
    int stateLength;
    int compressCoefficient;
    int bufferSize;
    int sizeOfActions;
    boolean flagSave;
    char dataType; //ставлю char, в python - string. Тут ругается
    int minibatchGeneratorPeriod;
    char configRawFlagSave;
    char rawFlagSave;
   // char flagSave;
    float compressionCoefficient;


//    void initFromConfig () {
//
//    }

    public void setStateLength(int stateLength) {
        this.stateLength = stateLength;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public void setEpochs(int epochs) {
        this.epochs = epochs;
    }

    public void batchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    int buffer_size = Math.round(iterations * epochs * bufferSize);

    public void setSaveRawStep(int save_raw_step) {
        this.saveRawStep = saveRawStep;
    }

    public void saveStep(int saveStep) {
        this.saveStep = saveStep;
    }

    public void config_raw_flag_save(char configRawFlagSave) {
        this.configRawFlagSave = configRawFlagSave;
    }

    public void raw_flag_save(char flagSave) {
        this.rawFlagSave = flagSave;
    }

//    public void (char flagSave) {
//        this.flagSave = flagSave;
//    }

    public void DataType(char dataType) {
        this.dataType = dataType;
        int cellCounter = 0;
        boolean bufferFull = false;
        boolean miniBatch = false;
        float compressionCoefficient;
        char minibatchGeneratorPeriod;

    }

    char stateRawSize;
    char stateSize;
    private double[][] actions = new double[bufferSize][sizeOfActions];

    public void initializeActions() {
        for (double[] action : actions) {
            Arrays.fill(action, 0.0); // задать заранее
        }
    }

    private double[][] rewards = new double[bufferSize][dataType];

    public void initializeRewards() {
        for (double[] rewards : rewards) {
            Arrays.fill(rewards, 0.0);

        }
    }

    private double[][] doneMask = new double[bufferSize][];

    public void initializeDoneMask() {
        for (double[] doneMask : doneMask) {
            Arrays.fill(doneMask, 0.0);

        }
    }

    private double[] timeIntervals;
    public void initializeTimeIntervals(int bufferSize, double dataType) {
        this.bufferSize = bufferSize;
        this.dataType = (char) dataType;
        this.timeIntervals = new double[bufferSize];
        Arrays.fill(this.timeIntervals, dataType);
    }

    private double[][] dateTime = new double[bufferSize][];
    public void initializeDateTime() {
        for (double[] dateTime : dateTime) {
            Arrays.fill(dateTime, 0.0);
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        }
    }

    private double[][] currentState = new double[stateSize][dataType];
    public void initializeCurrentState() {
        for (double[] currentState : currentState) {
            Arrays.fill(doneMask, 0.0);
        }
    }

    private double[][] previousState = new double [stateSize][dataType];

    public void initializePreviousState(){
        for(double[] previousState : previousState) {
            Arrays.fill(previousState, 0.0);
        }
    }

//    Что это в проге на питоне? визуальное окно?
//    self.me_rew_pre = -100500
//    self.window_norm = 100
//    self.flag_save_best = False  # ????
//    self.me_rew = -100500

    private double[][] timeBuffer;
    public void initializetimeBuffer(int bufferSize) {
        timeBuffer = new double[bufferSize][3];
        for(double[] timeBuffer : timeBuffer){
            Arrays.fill(timeBuffer, 0.0 );
        }
    }


    // вероятно, блоки кода в питоне взаимосвязаны, поэтому написаны раздельно

}

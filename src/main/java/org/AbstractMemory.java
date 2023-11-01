package org;

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
        for (double[] rewards : rewards) {
            Arrays.fill(rewards, 0.0);

        }
    }

    // вероятно, блоки кода в питоне взаимосвязаны, поэтому написаны раздельно

}

package Computers;

public class HardDisk extends Computers {
    private String modelDisk;
    private String type;
    private int sizeDisk;
    private enum country {
        China, Korea, India, USA
    }

    public HardDisk() {
    }

    public HardDisk(String modelDisk, String type, int sizeDisk) {
        this.modelDisk = modelDisk;
        this.type = type;
        this.sizeDisk = sizeDisk;
    }

    public String getModelDisk() {
        return modelDisk;
    }

    public void setModelDisk(String modelDisk) {
        this.modelDisk = modelDisk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSizeDisk() {
        return sizeDisk;
    }

    public void setSizeDisk(int sizeDisk) {
        this.sizeDisk = sizeDisk;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "modelDisk='" + modelDisk + '\'' +
                ", type='" + type + '\'' +
                ", sizeDisk=" + sizeDisk +
                '}';
    }
}

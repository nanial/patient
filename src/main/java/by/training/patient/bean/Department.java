package by.training.patient.bean;

public enum Department {
    THERAPY("therapy"), NEUROLOGY("neurology"), SURGERY("surgery"),
    UROLOGY("urology");

    private String realName;

    Department(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}

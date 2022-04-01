package installation.legacy;

public class Mid implements IExam {
    private String midDate;

    public String getMidDate() {
        return midDate;
    }

    public void setMidDate(String midDate) {
        this.midDate = midDate;
    }

    @Override
    public String PrintDate() {
        return String.valueOf(this.midDate);
    }
}

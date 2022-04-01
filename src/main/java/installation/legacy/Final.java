package installation.legacy;

public class Final implements IExam{
    private String finalDate;

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    @Override
    public String PrintDate() {
        return String.valueOf(finalDate);
    }
}

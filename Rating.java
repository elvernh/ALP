public class Rating {
    private int value = 0;
    private String comment = "";

    

    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getComment() {
        return comment;
    }
    public int getValue() {
        return value;
    }
}

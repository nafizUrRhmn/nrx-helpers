package model.result;


public class Success {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Success{" +
                "data=" + data +
                '}';
    }
}

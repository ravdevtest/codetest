package ravelin.codetest.backend.model.request;

public class SubmitTimeRequest extends Request {

    private int time; // in seconds

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}

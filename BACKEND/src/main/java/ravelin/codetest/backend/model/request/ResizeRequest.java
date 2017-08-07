package ravelin.codetest.backend.model.request;

import ravelin.codetest.backend.model.Dimension;

public class ResizeRequest extends Request {

    private Dimension resizeFrom;

    private Dimension resizeTo;

    public Dimension getResizeFrom() {
        return resizeFrom;
    }

    public void setResizeFrom(Dimension resizeFrom) {
        this.resizeFrom = resizeFrom;
    }

    public Dimension getResizeTo() {
        return resizeTo;
    }

    public void setResizeTo(Dimension resizeTo) {
        this.resizeTo = resizeTo;
    }

}

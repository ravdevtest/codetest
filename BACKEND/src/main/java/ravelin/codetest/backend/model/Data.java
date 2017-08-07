package ravelin.codetest.backend.model;

import java.util.HashMap;
import java.util.Map;

// Type following the specification.
public class Data {

    private String websiteUrl;

    private String sessionId;

    private Dimension resizeFrom;

    private Dimension resizeTo;

    private Map<String, Boolean> copyAndPaste;

    private Integer formCompletionTime;

    public Data(String websiteUrl, String sessionId) {
        this.websiteUrl = websiteUrl;
        this.sessionId = sessionId;
        copyAndPaste = new HashMap<>();
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

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

    public Map<String, Boolean> getCopyAndPaste() {
        return copyAndPaste;
    }

    public void setCopyAndPaste(Map<String, Boolean> copyAndPaste) {
        this.copyAndPaste = copyAndPaste;
    }

    public void addCopyAndPaste(String formId) {
        copyAndPaste.put(formId, true);
    }

    public Integer getFormCompletionTime() {
        return formCompletionTime;
    }

    public void setFormCompletionTime(Integer formCompletionTime) {
        this.formCompletionTime = formCompletionTime;
    }

    @Override
    public String toString() {
        return "Data [websiteUrl=" + websiteUrl + ", sessionId=" + sessionId + ", resizeFrom=" + resizeFrom
                + ", resizeTo=" + resizeTo + ", copyAndPaste=" + copyAndPaste + ", formCompletionTime="
                + formCompletionTime + "]";
    }

}

package ravelin.codetest.backend.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ravelin.codetest.backend.model.Dimension;
import ravelin.codetest.backend.model.request.CopyAndPasteRequest;
import ravelin.codetest.backend.model.request.ResizeRequest;
import ravelin.codetest.backend.model.request.SubmitTimeRequest;
import ravelin.codetest.backend.service.DataService;

public class DataServiceTest {

    private DataService dataService = new DataService();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpOutputStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void testUpdateData_copyAndPasteRequest() {
        CopyAndPasteRequest req = new CopyAndPasteRequest();
        req.setFormId("field1");
        req.setSessionId("123");
        req.setWebsiteUrl("http://localhost/");
        dataService.updateData(req);
        assertTrue(outContent.toString().contains("field1"));
    }

    @Test
    public void testUpdateData_multipleCopyAndPasteRequests() {
        CopyAndPasteRequest req = new CopyAndPasteRequest();
        req.setFormId("field1");
        req.setSessionId("123");
        req.setWebsiteUrl("http://localhost/");
        dataService.updateData(req);

        CopyAndPasteRequest req2 = new CopyAndPasteRequest();
        req2.setFormId("field2");
        req2.setSessionId("123");
        req2.setWebsiteUrl("http://localhost/");
        dataService.updateData(req2);

        assertTrue(outContent.toString().contains("field1"));
        assertTrue(outContent.toString().contains("field2"));
    }

    @Test
    public void testUpdateData_resizeRequest() {
        ResizeRequest req = new ResizeRequest();
        req.setResizeFrom(new Dimension("1024", "768"));
        req.setResizeTo(new Dimension("800", "600"));
        req.setSessionId("123");
        req.setWebsiteUrl("http://localhost/");
        dataService.updateData(req);
        assertTrue(outContent.toString().contains("1024"));
        assertTrue(outContent.toString().contains("768"));
        assertTrue(outContent.toString().contains("800"));
        assertTrue(outContent.toString().contains("600"));
    }

    @Test
    public void testUpdateData_submitTimeRequest() {
        SubmitTimeRequest req = new SubmitTimeRequest();
        req.setTime(42);
        req.setSessionId("123");
        req.setWebsiteUrl("http://localhost/");
        dataService.updateData(req);
        assertTrue(outContent.toString().contains("42"));
    }

    @Test
    public void testUpdateData_nullWebsiteUrl_illegalArgumentException() {
        try {
            CopyAndPasteRequest req = new CopyAndPasteRequest();
            req.setSessionId("123");
            dataService.updateData(req);
            fail("No exception thrown.");
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testUpdateData_nullSessionId_illegalArgumentException() {
        try {
            CopyAndPasteRequest req = new CopyAndPasteRequest();
            req.setWebsiteUrl("http://localhost");
            dataService.updateData(req);
            fail("No exception thrown.");
        } catch (IllegalArgumentException ex) {
        }
    }

}

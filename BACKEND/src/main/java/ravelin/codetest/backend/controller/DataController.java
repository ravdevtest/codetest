package ravelin.codetest.backend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ravelin.codetest.backend.model.request.CopyAndPasteRequest;
import ravelin.codetest.backend.model.request.Request;
import ravelin.codetest.backend.model.request.ResizeRequest;
import ravelin.codetest.backend.model.request.SubmitTimeRequest;
import ravelin.codetest.backend.service.DataService;

@CrossOrigin // we allow multiple sources of requests
@RestController
public class DataController {

    @Autowired
    private HttpServletRequest httpRequest;
    
    @Autowired
    private DataService dataService;

    @PostMapping("/copyAndPaste")
    public void index(@RequestBody CopyAndPasteRequest req) {
        prepareRequest(req);
        dataService.updateData(req);
    }

    @PostMapping("/resize")
    public void index(@RequestBody ResizeRequest req) {
        prepareRequest(req);
        dataService.updateData(req);
    }

    @PostMapping("/submit")
    public void index(@RequestBody SubmitTimeRequest req) {
        prepareRequest(req);
        dataService.updateData(req);
    }

    private void prepareRequest(Request req) {
        req.setWebsiteUrl(httpRequest.getHeader("referer"));
    }

}

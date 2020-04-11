package bezbednost.controller;

import bezbednost.service.IOCSPService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocsp")
public class OCSPController {

    private final IOCSPService _ocspService;

    public OCSPController(IOCSPService ocspService) {
        _ocspService = ocspService;
    }
}
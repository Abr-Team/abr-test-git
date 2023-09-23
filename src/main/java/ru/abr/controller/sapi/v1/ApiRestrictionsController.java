package ru.abr.controller.sapi.v1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.abr.service.CommonHolderService;

@RestController
@RequestMapping("/sapi/v1/account/apiRestrictions")
public class ApiRestrictionsController {

    private final CommonHolderService service;

    @Autowired
    public ApiRestrictionsController(CommonHolderService service) {
        this.service = service;
    }

    @GetMapping()
    public Object getRestrictions (@RequestHeader("APIKEY") String apiKey) {
        return service.getIncomeAsyncReq("foo", 123L);
    }
}

package quick.pager.pay.admin.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.pay.Constants;


@RestController
@RequestMapping(Constants.ADMIN_MODULE)
@Api(tags = {"消息通知推送"})
public class PushController {
}

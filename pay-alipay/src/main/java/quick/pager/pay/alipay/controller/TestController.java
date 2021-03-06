package quick.pager.pay.alipay.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import quick.pager.pay.alipay.service.TestService;
import quick.pager.pay.dto.actor.TestDTO;
import quick.pager.pay.request.pay.Request;
import quick.pager.pay.response.Response;

/**
 * @author siguiyang
 */
@RestController
@Api(description = "测试项目模块连接")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/spring/test")
    @ApiOperation("测试spring client 是否连接")
    public Response test(Request request) {
        TestDTO dto = new TestDTO();
        dto.setBeginTime(request.getBeginTime());
        dto.setEndTime(request.getEndTime());
        dto.setMerchantNo(request.getMerchantNo());
        dto.setMerchantOrderCode(request.getMerchantOrderCode());
        dto.setMobile(request.getMobile());
        dto.setVersion(request.getVersion());
        return testService.doService(dto);
    }

    @RequestMapping("/doTest")
    public Response doTest(String name){
        Response<String> response = new Response<>();
        response.setData(name);
        return response;
    }

}

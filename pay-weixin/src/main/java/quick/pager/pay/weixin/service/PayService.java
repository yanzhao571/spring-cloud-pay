package quick.pager.pay.weixin.service;

import org.springframework.stereotype.Service;
import quick.pager.pay.dto.BaseDto;
import quick.pager.pay.response.Response;
import quick.pager.pay.service.IService;

/**
 * 支付服务
 */
@Service
public class PayService implements IService{
    @Override
    public Response doService(BaseDto dto) {
        return null;
    }
}
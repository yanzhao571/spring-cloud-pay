package quick.pager.pay.admin.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import quick.pager.pay.dto.BaseDTO;
import quick.pager.pay.response.Response;
import quick.pager.pay.service.IService;

@Service
@Slf4j
public class BankService implements IService{
    @Override
    public Response doService(BaseDTO dto) {
        return null;
    }
}

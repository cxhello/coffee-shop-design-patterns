package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractCustomerService;

/**
 * VIP用户处理策略
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class VipCustomerService extends AbstractCustomerService {

    @Override
    public String provideService(BaseRequest baseRequest) {
        return greetCustomer("VIP") + " </br>" +
                "👔 专属客服接待" + " </br>" +
                "📖 提供VIP专属菜单" + " </br>" +
                "VIP服务完成  </br>";
    }

}

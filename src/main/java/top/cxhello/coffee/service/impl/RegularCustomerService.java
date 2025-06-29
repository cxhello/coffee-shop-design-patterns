package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractCustomerService;

/**
 * 普通用户策略
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class RegularCustomerService extends AbstractCustomerService {

    @Override
    public String provideService(BaseRequest baseRequest) {
        return greetCustomer("普通顾客") + " </br>" +
                "📋 提供标准服务" + " </br>" +
                "普通客户服务完成 </br>";
    }

}

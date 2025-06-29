package top.cxhello.coffee.service.base;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.CustomerService;

/**
 * 会员抽象服务
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public abstract class AbstractCustomerService implements CustomerService {

    public abstract String provideService(BaseRequest baseRequest);

    // 公共方法
    protected String greetCustomer(String customerType) {
        return String.format("👋 欢迎 %s 光临咖啡店! </br>", customerType);
    }

}

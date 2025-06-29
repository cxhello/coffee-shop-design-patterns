package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractCustomerService;

/**
 * 会员用户处理策略
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class MemberCustomerService extends AbstractCustomerService {

    @Override
    public String provideService(BaseRequest baseRequest) {
        return greetCustomer("会员") + " </br>" +
                "📱 扫码登记会员" + " </br>" +
                "🎯 推荐会员专属优惠" + " </br>" +
                "会员服务完成  </br>";
    }

}

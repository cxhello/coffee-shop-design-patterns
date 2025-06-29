package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractPaymentService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class VipPaymentService extends AbstractPaymentService {

    @Override
    public String pay(BaseRequest baseRequest) {
        return "💎 处理VIP支付 </br>" + verifyPayment() + "✨ 使用VIP专属通道 </br>" + "VIP支付完成: ¥" + baseRequest.getPrice() + " </br>";
    }
    
}

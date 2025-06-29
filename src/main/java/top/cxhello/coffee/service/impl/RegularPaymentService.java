package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractPaymentService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class RegularPaymentService extends AbstractPaymentService {

    @Override
    public String pay(BaseRequest baseRequest) {
        return "💳 处理现金/刷卡支付 </br>" + verifyPayment() + "支付完成: ¥" + baseRequest.getPrice() + " </br>";
    }

}

package top.cxhello.coffee.service.base;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.PaymentService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public abstract class AbstractPaymentService implements PaymentService {

    public abstract String pay(BaseRequest baseRequest);

    // 公共方法
    protected String verifyPayment() {
        return "🔒 验证支付安全性  </br>";
    }

}

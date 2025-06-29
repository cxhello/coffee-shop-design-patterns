package top.cxhello.coffee.service.base;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.OrderService;

import java.text.DecimalFormat;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public abstract class AbstractOrderService implements OrderService {

    public abstract String prepareOrder(BaseRequest baseRequest);

    // 公共方法
    protected String printReceipt(BaseRequest baseRequest) {
        DecimalFormat df = new DecimalFormat("#.##");
        return "🧾 打印收据: " + baseRequest.getQuantity() + "份, 总价: ¥" + df.format(baseRequest.getPrice()) + " </br>";
    }

    protected String addFreeGift() {
       return "🎁 添加免费小饼干  </br>";
    }
}

package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractOrderService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class VipOrderService extends AbstractOrderService {
    
    @Override
    public String prepareOrder(BaseRequest baseRequest) {
        baseRequest.setPrice(baseRequest.getPrice() * 0.8); // VIP8折
        return "🌟 VIP订单处理: " + baseRequest.getOrderType() + " </br>" + printReceipt(baseRequest) + addFreeGift() + "💺 安排VIP座位  </br>" + "VIP订单准备完成  </br>";
    }


}

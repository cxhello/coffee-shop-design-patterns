package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractOrderService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class MemberOrderService extends AbstractOrderService {

    @Override
    public String prepareOrder(BaseRequest baseRequest) {
        baseRequest.setPrice(baseRequest.getPrice() * 0.9); // 会员9折
        return "⭐ 会员订单处理: " + baseRequest.getOrderType() + " </br>" + printReceipt(baseRequest) + "会员订单准备完成 </br>";
    }

}

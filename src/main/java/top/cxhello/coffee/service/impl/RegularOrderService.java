package top.cxhello.coffee.service.impl;

import org.springframework.stereotype.Service;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractOrderService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service
public class RegularOrderService extends AbstractOrderService {

    @Override
    public String prepareOrder(BaseRequest baseRequest) {
        return "☕ 准备普通订单: " + baseRequest.getOrderType() + " </br>" + printReceipt(baseRequest) + "普通订单准备完成 </br>";
    }

}

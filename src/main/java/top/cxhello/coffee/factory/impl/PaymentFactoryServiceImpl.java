package top.cxhello.coffee.factory.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.cxhello.coffee.factory.CommonFactoryService;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractPaymentService;
import top.cxhello.coffee.strategy.CommonStrategyBeanSelector;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service("paymentFactoryService")
public class PaymentFactoryServiceImpl implements CommonFactoryService<AbstractPaymentService> {

    @Resource
    private CommonStrategyBeanSelector selector;


    @Override
    public AbstractPaymentService getService(BaseRequest baseRequest) {
        return selector.getService(baseRequest, "%sPaymentService");
    }


}

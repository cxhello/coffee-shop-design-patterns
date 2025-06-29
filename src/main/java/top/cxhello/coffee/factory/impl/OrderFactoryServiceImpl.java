package top.cxhello.coffee.factory.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.cxhello.coffee.factory.CommonFactoryService;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractOrderService;
import top.cxhello.coffee.strategy.CommonStrategyBeanSelector;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@Service("orderFactoryService")
public class OrderFactoryServiceImpl implements CommonFactoryService<AbstractOrderService> {

    @Resource
    private CommonStrategyBeanSelector selector;

    @Override
    public AbstractOrderService getService(BaseRequest baseRequest) {
        return selector.getService(baseRequest, "%sOrderService");
    }

}

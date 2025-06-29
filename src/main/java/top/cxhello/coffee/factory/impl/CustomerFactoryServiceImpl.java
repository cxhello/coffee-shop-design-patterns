package top.cxhello.coffee.factory.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.cxhello.coffee.factory.CommonFactoryService;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractCustomerService;
import top.cxhello.coffee.strategy.CommonStrategyBeanSelector;

/**
 * 用户工厂
 * @author cxhello
 * @date 2025/6/27
 */
@Service("customerFactoryService")
public class CustomerFactoryServiceImpl implements CommonFactoryService<AbstractCustomerService> {

    @Resource
    private CommonStrategyBeanSelector selector;

    @Override
    public AbstractCustomerService getService(BaseRequest baseRequest) {
        return selector.getService(baseRequest, "%sCustomerService");
    }

}

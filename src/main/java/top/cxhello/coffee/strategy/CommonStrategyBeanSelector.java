package top.cxhello.coffee.strategy;

import jakarta.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import top.cxhello.coffee.request.BaseRequest;

/**
 * 策略选择器
 * @author cxhello
 * @date 2025/6/27
 */
@Component
public class CommonStrategyBeanSelector {

    @Resource
    private ApplicationContext context;

    public <T> T getService(BaseRequest baseRequest, String pattern) {
        String suffix = determineSuffix(baseRequest);
        String beanName = String.format(pattern, suffix);
        return (T) context.getBean(beanName);
    }

    private String determineSuffix(BaseRequest baseRequest) {
        // 根据顾客类型和订单类型确定策略
        if ("VIP".equals(baseRequest.getCustomerType())) {
            return "vip";
        } else if ("MEMBER".equals(baseRequest.getCustomerType())) {
            return "member";
        }
        return "regular";
    }

}

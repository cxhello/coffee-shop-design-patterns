package top.cxhello.coffee.request;

import lombok.Getter;
import lombok.Setter;

/**
 * 基础请求
 * @author cxhello
 * @date 2025/6/27
 */
@Getter
@Setter
public class BaseRequest {

    /**
     * 用户类型 REGULAR、MEMBER、VIP
     */
    private String customerType;

    /**
     * 订单类型 COFFEE、TEA、DESSERT、COMBO
     */
    private String orderType;

    /**
     * 支付方式 Wechat、Alipay、Points
     */
    private String paymentMethod;

    /**
     *
     */
    private int quantity;

    /**
     *
     */
    private double price;

}

package top.cxhello.coffee.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cxhello.coffee.factory.CommonFactoryService;
import top.cxhello.coffee.request.BaseRequest;
import top.cxhello.coffee.service.base.AbstractCustomerService;
import top.cxhello.coffee.service.base.AbstractOrderService;
import top.cxhello.coffee.service.base.AbstractPaymentService;

/**
 * @author cxhello
 * @date 2025/6/27
 */
@RestController
public class TestController {

    @Resource(name = "customerFactoryService")
    private CommonFactoryService<AbstractCustomerService> customerFactoryService;

    @Resource(name = "orderFactoryService")
    private CommonFactoryService<AbstractOrderService> orderFactoryService;

    @Resource(name = "paymentFactoryService")
    private CommonFactoryService<AbstractPaymentService> paymentFactoryService;


    @GetMapping("/test1")
    public String test1() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setCustomerType("REGULAR");
        baseRequest.setOrderType("COFFEE");
        baseRequest.setPaymentMethod("CASH");
        baseRequest.setQuantity(1);
        baseRequest.setPrice(30.0);
        StringBuilder result = new StringBuilder();

        result.append("====== 订单处理开始 ====== </br>");
        AbstractCustomerService abstractCustomerService = customerFactoryService.getService(baseRequest);
        AbstractOrderService abstractOrderService = orderFactoryService.getService(baseRequest);
        AbstractPaymentService abstractPaymentService = paymentFactoryService.getService(baseRequest);

        result.append(abstractCustomerService.provideService(baseRequest)).append("\n");
        result.append(abstractOrderService.prepareOrder(baseRequest)).append("\n");
        result.append(abstractPaymentService.pay(baseRequest)).append("\n");

        result.append("====== 订单处理完成 ====== </br>");
        return result.toString();
    }

    @GetMapping("/test2")
    public String test2() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setCustomerType("MEMBER");
        baseRequest.setOrderType("COMBO");
        baseRequest.setPaymentMethod("MOBILE");
        baseRequest.setQuantity(2);
        baseRequest.setPrice(60.0);
        StringBuilder result = new StringBuilder();

        result.append("====== 订单处理开始 ====== </br>");
        AbstractCustomerService abstractCustomerService = customerFactoryService.getService(baseRequest);
        AbstractOrderService abstractOrderService = orderFactoryService.getService(baseRequest);
        AbstractPaymentService abstractPaymentService = paymentFactoryService.getService(baseRequest);

        result.append(abstractCustomerService.provideService(baseRequest)).append("\n");
        result.append(abstractOrderService.prepareOrder(baseRequest)).append("\n");
        result.append(abstractPaymentService.pay(baseRequest)).append("\n");

        result.append("====== 订单处理完成 ====== </br>");
        return result.toString();
    }

    @GetMapping("/test3")
    public String test3() {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setCustomerType("VIP");
        baseRequest.setOrderType("DESSERT");
        baseRequest.setPaymentMethod("CARD");
        baseRequest.setQuantity(1);
        baseRequest.setPrice(40.0);
        StringBuilder result = new StringBuilder();

        result.append("====== 订单处理开始 ====== </br>");
        AbstractCustomerService abstractCustomerService = customerFactoryService.getService(baseRequest);
        AbstractOrderService abstractOrderService = orderFactoryService.getService(baseRequest);
        AbstractPaymentService abstractPaymentService = paymentFactoryService.getService(baseRequest);

        result.append(abstractCustomerService.provideService(baseRequest)).append("\n");
        result.append(abstractOrderService.prepareOrder(baseRequest)).append("\n");
        result.append(abstractPaymentService.pay(baseRequest)).append("\n");

        result.append("====== 订单处理完成 ====== </br>");
        return result.toString();
    }


}

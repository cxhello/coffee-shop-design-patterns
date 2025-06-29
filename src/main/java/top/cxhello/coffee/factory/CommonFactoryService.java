package top.cxhello.coffee.factory;

import top.cxhello.coffee.request.BaseRequest;

/**
 * 通用工厂接口
 * @author cxhello
 * @date 2025/6/27
 */
public interface CommonFactoryService<T> {

    /**
     * 获取服务类型
     * @param baseRequest
     * @return
     */
    T getService(BaseRequest baseRequest);
}

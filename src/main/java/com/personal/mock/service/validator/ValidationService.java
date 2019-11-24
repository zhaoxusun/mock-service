package com.personal.mock.service.validator;

import java.util.List;

/**
 * 参数校验服务
 *
 * @author <a href="mailto:wangchao@yidian-inc.com">wangchao</a>
 * @since 2017-06-08 10:56:00
 */
public interface ValidationService {

    /**
     * <p>Description: 按照注解参数校验+分组，返回校验失败的消息列表</p>
     *
     * @author hanchao
     * @date 2018/9/1 上午10:52
     */
    <T> List<String> validate(T obj, Class<?>... groups);
}

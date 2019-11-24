package com.personal.mock.service.validator.impl;

import com.personal.mock.service.validator.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>Description: 校验实现类</p>
 *
 * @author hanchao
 * @date 2018/8/20 下午2:59
 */
@Service
public class ValidationServiceImpl implements ValidationService {

    @Resource
    private Validator validator;

    /**
     * <p>Description: 处理校验结果，返回校验失败的消息列表</p>
     *
     * @param obj 被校验对象
     * @author hanchao
     * @date 2018/8/31 下午5:23
     */
    @Override
    public <T> List<String> validate(T obj, Class<?>... groups) {
        return validator.validate(obj, groups).stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }
}

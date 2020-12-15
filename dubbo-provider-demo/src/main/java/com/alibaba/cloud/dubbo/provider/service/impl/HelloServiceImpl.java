package com.alibaba.cloud.dubbo.provider.service.impl;

import com.alibaba.cloud.dubbo.api.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @mudule: 应用模块名称
 * @Copyright: Copyright (C) 2020 BlueSea, Inc. All rights reserved.
 * @Company: 北京巅峰同道科技有限公司
 * @author：zhouxiankai
 * @since：2020/12/10 17:20
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return null;
    }
}

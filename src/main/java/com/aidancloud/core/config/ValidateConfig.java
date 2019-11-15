package com.aidancloud.core.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * 参数校验配置
 * @author hutao
 * @date 2019-11-11 12:18
 */
@Configuration
public class ValidateConfig {

    /**
     * 修改校验的模式，默认是普通模式(会校验完所有的属性，然后返回所有的验证失败信息)
     * 先修改为：快速失败返回模式(只要有一个验证失败，则返回)
     * @return
     */
    @Bean
    public Validator validator(){
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .addProperty("hibernate.validator.fail_fast","true")
                .buildValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        return validator;
    }

}

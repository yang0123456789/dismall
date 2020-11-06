package com.yang.mall_product.exception;

import com.yang.common.exception.BizCodeEnum;
import com.yang.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.support.WebExchangeBindException;

import java.util.HashMap;
import java.util.Map;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/7 0:40
 * # @version 1.0
 * # @File : MallExceptionControllerAdvice.java
 * # @Software: IntelliJ IDEA
 * 启动应用后，被 @ExceptionHandler、@InitBinder、@ModelAttribute 注解的方法，都会作用在 被 @RequestMapping 注解的方法上。
 *
 * 作为特化@Component，允许通过类路径扫描自动检测实现类。
 *
 * 它通常用于定义@ExceptionHandler， @InitBinder 和 @ModelAttribute 适用于所有@RequestMapping方法的方法。
 *
 * annotations()，basePackageClasses()， basePackages()或它的别名value() 可以被指定，以限定控制器，以协助的特定子集。当应用多个选择器时，应用OR逻辑 - 意味着所选的控制器应匹配至少一个选择器。
 *
 * 默认行为（即，如果没有任何选择器使用），带@ControllerAdvice注释的类将协助所有已知的控制器。
 * ExceptionHandler
 *
 * 异常处理方式一. @ExceptionHandler
 * 异常处理方式二. 实现HandlerExceptionResolver接口
 * 异常处理方式三. @ControllerAdvice+@ExceptionHandler
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.yang.mall_product.controller")
public class MallExceptionControllerAdvice {
    @ExceptionHandler(value = {WebExchangeBindException.class})
    public R handleVaildException(WebExchangeBindException e) {
        log.error("数据校验出现问题{}，异常类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            // 错误字段 、 错误提示
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(), BizCodeEnum.VAILD_EXCEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {

        log.error("错误：", throwable);
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}

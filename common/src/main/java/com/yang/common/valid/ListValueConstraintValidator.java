package com.yang.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/7 1:27
 * # @version 1.0
 * # @File : ListValueConstraintValidator.java
 * # @Software: IntelliJ IDEA
 *
 * Description：校验器：规定ListValue这个注解 用于校验 Integer 类型的数据
 * 			POSTman :{"name":"aaa","logo":"https://github.com/1046762075","sort":0,"firstLetter":"d","showStatus":0}
 *
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    /**
     * set 里面就是使用注解时规定的值, 例如: @ListValue(vals = {0,1})  set= {0,1}
     */
    private Set<Integer> set = new HashSet<>();

    //初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {

        int[] vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }

    /**
     * 判断是否校验成功
     * @param value 需要校验的值
     *              判断这个值再set里面没
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
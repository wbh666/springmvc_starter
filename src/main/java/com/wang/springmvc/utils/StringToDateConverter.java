package com.wang.springmvc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请传入数据");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 进行类型转化
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换失败");
        }
    }
}

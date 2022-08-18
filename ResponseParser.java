package com.example.funtest.response;

import com.example.funtest.response.Response;

import java.io.IOException;
import java.lang.reflect.Type;

import rxhttp.wrapper.annotation.Parser;
import rxhttp.wrapper.exception.ParseException;
import rxhttp.wrapper.parse.TypeParser;
import rxhttp.wrapper.utils.Converter;

@Parser(name = "Response"/*, wrappers = {com.example.funtest.response.Response.class}*/)
public class ResponseParser<T> extends TypeParser<T> {

    //该构造方法是必须的
    protected ResponseParser() {
        super();
    }

    //如果依赖了RxJava，该构造方法也是必须的
    public ResponseParser(Type type) {
        super(type);
    }

    @Override
    public T onParse(okhttp3.Response response) throws IOException {
        //将okhttp3.Response转换为自定义的Response对象
        Response<T> data = Converter.convertTo(response, Response.class, types);  //这里的types就是自定义Response<T>里面的泛型类型
        T t = data.getData(); //获取data字段
        if (data.getCode() != 1 || t == null) {//这里假设code不等于1，代表数据不正确，抛出异常
            throw new ParseException(String.valueOf(data.getCode()), data.getMsg() == null ? "ParseException" : data.getMsg(), response);
        }
        return t;
    }
}
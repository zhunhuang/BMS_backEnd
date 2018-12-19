package com.learn.nolan.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * description: 拦截Executor.class 的update方法
 *
 * @author zhun.huang 2018-12-17
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update",args = {MappedStatement.class, Object.class})
})
public class MybatisInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("update type sql executed...");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}

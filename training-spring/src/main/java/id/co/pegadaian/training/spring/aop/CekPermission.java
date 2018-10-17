/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author anggi
 */

@Component
public class CekPermission implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation targetMethod) throws Throwable {
        
        System.out.println("Menjalankan advice cek premission untuk method : " + targetMethod.getMethod().getName());
        
        Object result = targetMethod.proceed();
        
        return result;
    }
}

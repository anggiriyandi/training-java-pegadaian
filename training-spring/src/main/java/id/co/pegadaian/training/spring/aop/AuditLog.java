/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.training.spring.aop;

import java.util.Date;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author anggi
 */

@Component
public class AuditLog implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation targetObject) throws Throwable {
        
        
        Object result = targetObject.proceed();
        
        System.out.println("Menjalankan advice auditlog di method : " + 
                targetObject.getMethod().getName() + " pada tanggal : " + new Date());
        
        
        return result;
    }
    
}

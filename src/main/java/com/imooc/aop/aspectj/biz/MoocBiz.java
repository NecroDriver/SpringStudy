package com.imooc.aop.aspectj.biz;

import com.imooc.aop.aspectj.MoocMethod;
import org.springframework.stereotype.Service;

/**
 * @author mafh
 * @create 2017-07-10 13:03
 * Created With Intellij IDEA
 */
@Service
public class MoocBiz {
    @MoocMethod("MoocBiz save with MoocMethod.")
    public String save(String arg){
        System.out.println("MoocBiz save:"+arg);
//        throw new RuntimeException("save exception!");
        return "success save!";
    }
}

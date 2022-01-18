package cn.bdqn.hzp.config;


import cn.bdqn.hzp.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author java30
 * @date 2022/1/7
 * @apinote
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    //@Autowired
    //UrlCountInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/templates","/login","/css/**","/fonts/**","/images/**","/img","/js/**","/webjars/**","/static/**");
        //registry.addInterceptor(interceptor)
        //        .addPathPatterns("/**")
        //        .excludePathPatterns("/","/templates","/login","/css/**","/fonts/**","/images/**","/img","/js/**","/webjars/**","/static/**");
    }
}

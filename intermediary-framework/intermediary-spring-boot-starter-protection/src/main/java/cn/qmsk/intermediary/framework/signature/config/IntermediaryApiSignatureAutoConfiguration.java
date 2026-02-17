package cn.qmsk.intermediary.framework.signature.config;

import cn.qmsk.intermediary.framework.redis.config.IntermediaryRedisAutoConfiguration;
import cn.qmsk.intermediary.framework.signature.core.aop.ApiSignatureAspect;
import cn.qmsk.intermediary.framework.signature.core.redis.ApiSignatureRedisDAO;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * HTTP API 签名的自动配置类
 *
 * @author Zhougang
 */
@AutoConfiguration(after = IntermediaryRedisAutoConfiguration.class)
public class IntermediaryApiSignatureAutoConfiguration {

    @Bean
    public ApiSignatureAspect signatureAspect(ApiSignatureRedisDAO signatureRedisDAO) {
        return new ApiSignatureAspect(signatureRedisDAO);
    }

    @Bean
    public ApiSignatureRedisDAO signatureRedisDAO(StringRedisTemplate stringRedisTemplate) {
        return new ApiSignatureRedisDAO(stringRedisTemplate);
    }

}

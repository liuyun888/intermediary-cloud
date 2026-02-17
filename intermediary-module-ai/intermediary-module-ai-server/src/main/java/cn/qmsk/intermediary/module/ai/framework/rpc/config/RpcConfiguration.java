package cn.qmsk.intermediary.module.ai.framework.rpc.config;

import cn.qmsk.intermediary.module.infra.api.file.FileApi;
import cn.qmsk.intermediary.module.system.api.user.AdminUserApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "aiRpcConfiguration", proxyBeanMethods = false)
@EnableFeignClients(clients = {FileApi.class, AdminUserApi.class})
public class RpcConfiguration {
}

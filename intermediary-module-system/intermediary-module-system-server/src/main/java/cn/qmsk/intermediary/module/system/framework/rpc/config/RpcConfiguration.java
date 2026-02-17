package cn.qmsk.intermediary.module.system.framework.rpc.config;

import cn.qmsk.intermediary.module.infra.api.config.ConfigApi;
import cn.qmsk.intermediary.module.infra.api.file.FileApi;
import cn.qmsk.intermediary.module.infra.api.websocket.WebSocketSenderApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "systemRpcConfiguration", proxyBeanMethods = false)
@EnableFeignClients(clients = {FileApi.class, WebSocketSenderApi.class, ConfigApi.class})
public class RpcConfiguration {
}

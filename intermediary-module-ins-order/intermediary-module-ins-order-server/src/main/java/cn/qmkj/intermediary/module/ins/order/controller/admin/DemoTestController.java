package cn.qmkj.intermediary.module.ins.order.controller.admin;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

import javax.annotation.security.PermitAll;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - Test")
@RestController
@RequestMapping("/ins/order/demo/test")
@Validated
public class DemoTestController {

    // 这个构造方法，只是方便大家，验证 Controller 有生效
    public DemoTestController() {
        System.out.println(getClass() + "ins-order 模块生效啦！！！");
    }

    @GetMapping("/get")
    @Operation(summary = "获取 test 信息")
    @PermitAll
    public CommonResult<String> get() {
        return success("true");
    }
}

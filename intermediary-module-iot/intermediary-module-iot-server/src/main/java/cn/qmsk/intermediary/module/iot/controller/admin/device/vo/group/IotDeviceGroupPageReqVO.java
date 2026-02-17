package cn.qmsk.intermediary.module.iot.controller.admin.device.vo.group;

import cn.qmsk.intermediary.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.qmsk.intermediary.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - IoT 设备分组分页 Request VO")
@Data
public class IotDeviceGroupPageReqVO extends PageParam {

    @Schema(description = "分组名字", example = "李四")
    private String name;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}
package cn.qmsk.intermediary.module.system.api.dict;

import cn.qmsk.intermediary.framework.common.pojo.CommonResult;
import cn.qmsk.intermediary.framework.common.util.object.BeanUtils;
import cn.qmsk.intermediary.framework.common.biz.system.dict.dto.DictDataRespDTO;
import cn.qmsk.intermediary.module.system.dal.dataobject.dict.DictDataDO;
import cn.qmsk.intermediary.module.system.service.dict.DictDataService;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

import static cn.qmsk.intermediary.framework.common.pojo.CommonResult.success;

@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
@Primary // 由于 DictDataCommonApi 的存在，必须声明为 @Primary Bean
public class DictDataApiImpl implements DictDataApi {

    @Resource
    private DictDataService dictDataService;

    @Override
    public CommonResult<Boolean> validateDictDataList(String dictType, Collection<String> values) {
        dictDataService.validateDictDataList(dictType, values);
        return success(true);
    }

    @Override
    public CommonResult<List<DictDataRespDTO>> getDictDataList(String dictType) {
        List<DictDataDO> list = dictDataService.getDictDataListByDictType(dictType);
        return success(BeanUtils.toBean(list, DictDataRespDTO.class));
    }

}

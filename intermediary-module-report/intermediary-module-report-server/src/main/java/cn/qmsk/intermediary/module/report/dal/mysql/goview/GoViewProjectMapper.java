package cn.qmsk.intermediary.module.report.dal.mysql.goview;

import cn.qmsk.intermediary.framework.common.pojo.PageParam;
import cn.qmsk.intermediary.framework.common.pojo.PageResult;
import cn.qmsk.intermediary.framework.mybatis.core.mapper.BaseMapperX;
import cn.qmsk.intermediary.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.qmsk.intermediary.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoViewProjectMapper extends BaseMapperX<GoViewProjectDO> {

    default PageResult<GoViewProjectDO> selectPage(PageParam reqVO, Long userId) {
        return selectPage(reqVO, new LambdaQueryWrapperX<GoViewProjectDO>()
                .eq(GoViewProjectDO::getCreator, userId)
                .orderByDesc(GoViewProjectDO::getId));
    }

}

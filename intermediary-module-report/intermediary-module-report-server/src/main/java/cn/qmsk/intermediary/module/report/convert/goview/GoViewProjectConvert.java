package cn.qmsk.intermediary.module.report.convert.goview;

import cn.qmsk.intermediary.framework.common.pojo.PageResult;
import cn.qmsk.intermediary.module.report.controller.admin.goview.vo.project.GoViewProjectCreateReqVO;
import cn.qmsk.intermediary.module.report.controller.admin.goview.vo.project.GoViewProjectRespVO;
import cn.qmsk.intermediary.module.report.controller.admin.goview.vo.project.GoViewProjectUpdateReqVO;
import cn.qmsk.intermediary.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoViewProjectConvert {

    GoViewProjectConvert INSTANCE = Mappers.getMapper(GoViewProjectConvert.class);

    GoViewProjectDO convert(GoViewProjectCreateReqVO bean);

    GoViewProjectDO convert(GoViewProjectUpdateReqVO bean);

    GoViewProjectRespVO convert(GoViewProjectDO bean);

    PageResult<GoViewProjectRespVO> convertPage(PageResult<GoViewProjectDO> page);

}

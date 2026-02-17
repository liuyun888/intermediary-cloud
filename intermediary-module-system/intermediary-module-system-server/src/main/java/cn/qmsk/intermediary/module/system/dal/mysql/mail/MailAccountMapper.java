package cn.qmsk.intermediary.module.system.dal.mysql.mail;

import cn.qmsk.intermediary.framework.common.pojo.PageResult;
import cn.qmsk.intermediary.framework.mybatis.core.mapper.BaseMapperX;
import cn.qmsk.intermediary.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.qmsk.intermediary.module.system.controller.admin.mail.vo.account.MailAccountPageReqVO;
import cn.qmsk.intermediary.module.system.dal.dataobject.mail.MailAccountDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MailAccountMapper extends BaseMapperX<MailAccountDO> {

    default PageResult<MailAccountDO> selectPage(MailAccountPageReqVO pageReqVO) {
        return selectPage(pageReqVO, new LambdaQueryWrapperX<MailAccountDO>()
                .likeIfPresent(MailAccountDO::getMail, pageReqVO.getMail())
                .likeIfPresent(MailAccountDO::getUsername , pageReqVO.getUsername())
                .orderByDesc(MailAccountDO::getId));
    }

}

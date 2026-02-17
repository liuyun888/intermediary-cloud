package cn.qmsk.intermediary.module.member.service.level;

import cn.qmsk.intermediary.framework.common.pojo.PageResult;
import cn.qmsk.intermediary.module.member.controller.admin.level.vo.record.MemberLevelRecordPageReqVO;
import cn.qmsk.intermediary.module.member.dal.dataobject.level.MemberLevelRecordDO;
import cn.qmsk.intermediary.module.member.dal.mysql.level.MemberLevelRecordMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * 会员等级记录 Service 实现类
 *
 * @author owen
 */
@Service
@Validated
public class MemberLevelRecordServiceImpl implements MemberLevelRecordService {

    @Resource
    private MemberLevelRecordMapper levelLogMapper;

    @Override
    public MemberLevelRecordDO getLevelRecord(Long id) {
        return levelLogMapper.selectById(id);
    }

    @Override
    public PageResult<MemberLevelRecordDO> getLevelRecordPage(MemberLevelRecordPageReqVO pageReqVO) {
        return levelLogMapper.selectPage(pageReqVO);
    }

    @Override
    public void createLevelRecord(MemberLevelRecordDO levelRecord) {
        levelLogMapper.insert(levelRecord);
    }

}

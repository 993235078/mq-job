package com.quicker.sana.mqjob.impl;


import com.quicker.sana.mqjob.mapper.JobConfigMapper;
import com.quicker.sana.mqjob.pojo.JobConfig;
import com.quicker.sana.mqjob.pojo.JobConfigExample;
import com.quicker.sana.mqjob.service.JobConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_-
 * @author www.51quicker.com
 * 当前接口实现类只是简单的动态查询，根据id查询详情，新增，根据主键修改，批量/单一删除
 * -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_-
 */
@Service
@Transactional( rollbackFor = Exception.class )
public class JobConfigServiceImpl implements JobConfigService {

    private final JobConfigMapper jobConfigMapper;

    @Autowired
    public JobConfigServiceImpl(JobConfigMapper jobConfigMapper) {
        this.jobConfigMapper = jobConfigMapper;
    }

    /**
     * 根据id删除数据
     * @param id 数据id,主键
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobConfigMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据实体类中属性选择性新增，只新增字段不为null的数据
     * @param record
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    @Override
    public int insertSelective(JobConfig record) {
        return jobConfigMapper.insertSelective(record);
    }

    /**
     * 根据条件和分页查询数据
     * @param example 查询条件封装对象
     * @author www.51quicker.com
     * @return ClassMsg对象的集合
     */
    @Override
    public List<JobConfig> selectByExample(JobConfigExample example) {
        return jobConfigMapper.selectByExample(example);
    }

    /**
     * 根据id查询数据
     * @param id 数据id,主键
     * @author www.51quicker.com
     * @return ClassMsg对象
     */
    @Override
    public JobConfig selectByPrimaryKey(Integer id) {
        return jobConfigMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据实体类中属性选择性修改，只修改字段不为null的数据
     * @param record
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    @Override
    public int updateByPrimaryKeySelective(JobConfig record) {
        return jobConfigMapper.updateByPrimaryKeySelective(record);
    }

}

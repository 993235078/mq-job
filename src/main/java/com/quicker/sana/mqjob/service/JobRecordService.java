package com.quicker.sana.mqjob.service;





import com.quicker.sana.mqjob.pojo.JobRecord;
import com.quicker.sana.mqjob.pojo.JobRecordExample;

import java.util.List;

/**
 * -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_-
 * @author www.51quicker.com
 * 当前接口类只是简单的动态查询，根据id查询详情，新增，根据主键修改，批量/单一删除
 * -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_-
 */
public interface JobRecordService {

    /**
     * 根据id删除数据
     * @param id 数据id,主键
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    int deleteByPrimaryKey(String id);

    /**
     * 根据实体类中属性选择性新增，只新增字段不为null的数据
     * @param record
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    int insertSelective(JobRecord record);

    /**
     * 根据条件和分页查询数据
     * @param example 查询条件封装对象
     * @author www.51quicker.com
     * @return ClassMsg对象的集合
     */
    List<JobRecord> selectByExample(JobRecordExample example);

    /**
     * 根据id查询数据
     * @param id 数据id,主键
     * @author www.51quicker.com
     * @return ClassMsg对象
     */
    JobRecord selectByPrimaryKey(String id);

    /**
     * 根据实体类中属性选择性修改，只修改字段不为null的数据
     * @param record
     * @author www.51quicker.com
     * @return 1 成功 0失败
     */
    int updateByPrimaryKeySelective(JobRecord record);

}
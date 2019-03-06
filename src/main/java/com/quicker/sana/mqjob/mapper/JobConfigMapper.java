package com.quicker.sana.mqjob.mapper;


import com.quicker.sana.mqjob.pojo.JobConfig;
import com.quicker.sana.mqjob.pojo.JobConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobConfigMapper {
    long countByExample(JobConfigExample example);

    int deleteByExample(JobConfigExample example);

    int deleteByPrimaryKey(Integer jobType);

    int insert(JobConfig record);

    int insertSelective(JobConfig record);

    List<JobConfig> selectByExample(JobConfigExample example);

    JobConfig selectByPrimaryKey(Integer jobType);

    int updateByExampleSelective(@Param("record") JobConfig record, @Param("example") JobConfigExample example);

    int updateByExample(@Param("record") JobConfig record, @Param("example") JobConfigExample example);

    int updateByPrimaryKeySelective(JobConfig record);

    int updateByPrimaryKey(JobConfig record);
}
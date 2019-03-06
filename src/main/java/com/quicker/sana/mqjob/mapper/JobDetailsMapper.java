package com.quicker.sana.mqjob.mapper;


import com.quicker.sana.mqjob.pojo.JobDetails;
import com.quicker.sana.mqjob.pojo.JobDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobDetailsMapper {
    long countByExample(JobDetailsExample example);

    int deleteByExample(JobDetailsExample example);

    int deleteByPrimaryKey(String jobDetailCode);

    int insert(JobDetails record);

    int insertSelective(JobDetails record);

    List<JobDetails> selectByExample(JobDetailsExample example);

    JobDetails selectByPrimaryKey(String jobDetailCode);

    int updateByExampleSelective(@Param("record") JobDetails record, @Param("example") JobDetailsExample example);

    int updateByExample(@Param("record") JobDetails record, @Param("example") JobDetailsExample example);

    int updateByPrimaryKeySelective(JobDetails record);

    int updateByPrimaryKey(JobDetails record);
}
package com.quicker.sana.mqjob.mapper;


import com.quicker.sana.mqjob.pojo.JobRecord;
import com.quicker.sana.mqjob.pojo.JobRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JobRecordMapper {
    long countByExample(JobRecordExample example);

    int deleteByExample(JobRecordExample example);

    int deleteByPrimaryKey(String jobRecordCode);

    int insert(JobRecord record);

    int insertSelective(JobRecord record);

    List<JobRecord> selectByExample(JobRecordExample example);

    JobRecord selectByPrimaryKey(String jobRecordCode);

    int updateByExampleSelective(@Param("record") JobRecord record, @Param("example") JobRecordExample example);

    int updateByExample(@Param("record") JobRecord record, @Param("example") JobRecordExample example);

    int updateByPrimaryKeySelective(JobRecord record);

    int updateByPrimaryKey(JobRecord record);
}
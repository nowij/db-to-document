package com.dtd.dbtodocument.repository.mysql;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MysqlMapper {
    int selectOne();
}

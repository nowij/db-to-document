package com.dtd.dbtodocument.repository.postgres;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostgresMapper {
    int selectById();
}

package com.dtd.dbtodocument.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConnectDTO {
    private String dbType;
    private String host;
    private int port;
    private String dbName;
    private String username;
    private String password;
}

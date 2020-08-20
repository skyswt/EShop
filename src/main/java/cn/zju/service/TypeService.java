package cn.zju.service;


import cn.zju.entity.Type;

import java.sql.SQLException;
import java.util.List;

public interface TypeService {

    List<Type> findAll() throws SQLException;

}

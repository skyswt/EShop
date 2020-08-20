package cn.zju.dao;


import cn.zju.entity.Type;

import java.sql.SQLException;
import java.util.List;

public interface TypeDao {

    List<Type> selectAll() throws SQLException;

}

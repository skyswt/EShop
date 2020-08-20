package cn.zju.dao.impl;


import cn.zju.dao.TypeDao;
import cn.zju.entity.Type;
import cn.zju.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class TypeDaoImpl implements TypeDao {

    @Override
    public List<Type> selectAll() throws SQLException {

        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "select t_id as tid,t_name as tname ,t_info as tinfo from type limit 5;";

        List<Type> list = queryRunner.query(sql, new BeanListHandler<Type>(Type.class));
        return list;
    }
}

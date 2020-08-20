package cn.zju.service.impl;



import cn.zju.dao.TypeDao;
import cn.zju.dao.impl.TypeDaoImpl;
import cn.zju.entity.Type;
import cn.zju.service.TypeService;

import java.sql.SQLException;
import java.util.List;

public class TypeServiceImpl  implements TypeService {

    @Override
    public List<Type> findAll() throws SQLException {
        TypeDao typeDao = new TypeDaoImpl();

        List<Type> types = typeDao.selectAll();

        return types;
    }
}

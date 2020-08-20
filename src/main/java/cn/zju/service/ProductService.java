package cn.zju.service;



import cn.zju.entity.PageBean;
import cn.zju.entity.Product;

import java.sql.SQLException;

public interface ProductService {
    PageBean<Product> findPage(String tid, int page, int pageSize) throws SQLException;

    Product findProductByPid(String pid) throws SQLException;
}

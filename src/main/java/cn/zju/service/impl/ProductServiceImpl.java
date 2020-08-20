package cn.zju.service.impl;



import cn.zju.dao.ProductDao;
import cn.zju.dao.impl.ProductDaoImpl;
import cn.zju.entity.PageBean;
import cn.zju.entity.Product;
import cn.zju.service.ProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public PageBean<Product> findPage(String tid, int page, int pageSize) throws SQLException {

        ProductDao productDao = new ProductDaoImpl();

        long count = productDao.selectCountByTid(tid); //查询总条数

        List<Product> list = productDao.selectProductByPage(page,pageSize,tid); //查询当前页对应的商品

        // limit (currentPage-1)*pageSize,pageSize;

        return new PageBean<Product>(list,page,pageSize,count);
    }

    @Override
    public Product findProductByPid(String pid) throws SQLException {

        ProductDao productDao = new ProductDaoImpl();

        Product product = productDao.selectProductByPid(pid);

        return product;
    }
}

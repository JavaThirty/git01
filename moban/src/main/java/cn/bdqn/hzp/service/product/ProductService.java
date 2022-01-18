package cn.bdqn.hzp.service.product;


import cn.bdqn.hzp.mapper.ProductMapper;
import cn.bdqn.hzp.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author java30
 * @date 2022/1/7
 * @apinote
 */
@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;


    public Product getInfo(Integer id){

        return productMapper.getInfo(id);
    }
}

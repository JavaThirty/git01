package cn.bdqn.hzp.mapper;

import cn.bdqn.hzp.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author java30
 * @date 2022/1/7
 * @apinote
 */
@Mapper
public interface ProductMapper {

    public Product getInfo(Integer id);
}

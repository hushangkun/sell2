package com.imooc.sell2.repository;

import com.imooc.sell2.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;


/**
 * @author hushangkun
 * @date 2018/2/7 1:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        /*ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);*/
        ProductCategory productCategory = new ProductCategory("女生最爱",3);
        ProductCategory result = repository.save(productCategory);
        //两个断言意思一样
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    //此时会有updateTime无法更新的问题，productCategory中有updateTime，所以不会更新
    //怎么处理？ --- 在ProductCategory实体类上加一个注解@DynamicUpdate
    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(10);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}
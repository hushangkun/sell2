package com.imooc.sell2.dataobject;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * @author hushangkun
 * @date 2018/2/7 1:15
 */
@Data
@Entity
@DynamicUpdate
public class ProductCategory {

    /* 类目id*/
    @Id
    @GeneratedValue    //自增类型
    private Integer categoryId;

    /* 类目名字*/
    private String categoryName;

    /* 类目编号*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}

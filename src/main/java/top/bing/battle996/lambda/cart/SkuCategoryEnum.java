package top.bing.battle996.lambda.cart;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 08:55
 * @Description: 商品类型枚举
 */
@AllArgsConstructor
public enum SkuCategoryEnum {

    CLOTHING(10, "服装类"),
    ELECTRONICS(20, "数码类"),
    SPORTS(30, "运动类"),
    BOOKS(40, "图书类");

    // 商品类型的编号
    private Integer code;
    // 商品类型的名称
    private String name;
}

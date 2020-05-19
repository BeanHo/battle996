package top.bing.battle996.lambda.cart;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 08:49
 * @Description: 下单商品信息对象
 */
@Data
@AllArgsConstructor
public class Sku {

    // 编号
    private Integer skuId;
    // 商品名称
    private String skuName;
    // 单价
    private Double skuPrice;
    // 购买个数
    private Integer totalNum;
    // 总价
    private Double totalPrice;
    // 商品类型
    private Enum skuCategory;
}

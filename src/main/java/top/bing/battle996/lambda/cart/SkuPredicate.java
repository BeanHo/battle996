package top.bing.battle996.lambda.cart;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 08:58
 * @Description: Sku选择谓词接口
 */
public interface SkuPredicate {

    /**
     * 选择判断标准
     * @param sku
     * @return
     */
    boolean test(Sku sku);
}

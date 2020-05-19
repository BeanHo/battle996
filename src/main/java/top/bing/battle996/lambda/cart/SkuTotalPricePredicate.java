package top.bing.battle996.lambda.cart;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 09:03
 * @Description: 对Sku的总价是否超出2000作为判断标准
 */
public class SkuTotalPricePredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return sku.getTotalPrice() > 2000;
    }
}

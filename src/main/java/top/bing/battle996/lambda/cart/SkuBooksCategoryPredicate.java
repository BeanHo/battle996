package top.bing.battle996.lambda.cart;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 09:02
 * @Description: 对Sku的商品类型为图书类的判断标准
 */
public class SkuBooksCategoryPredicate implements SkuPredicate {

    @Override
    public boolean test(Sku sku) {
        return SkuCategoryEnum.BOOKS.equals(sku.getSkuCategory());
    }
}

package top.bing.battle996.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 14:37
 * @Description:
 */
class CartServiceTest {

    @Test
    void filterElectronicsSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();
        // 查找购物车中数码类商品
        List<Sku> result = CartService.filterElectronicsSkus(cartSkuList);
        System.out.println(JSON.toJSONString(result, true));
    }

    @Test
    void filterSkusByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();
        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkusByCategory(cartSkuList, SkuCategoryEnum.BOOKS);
        System.out.println(JSON.toJSONString(result, true));
    }

    @Test
    void filterSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

//        // 根据商品总价过滤超过2000元的商品列表
//        List<Sku> result = CartService.filterSkus(cartSkuList, null, 2000.00, false);

//        // 过滤商品总价大于2000的商品
//        List<Sku> result = CartService.filterSkus(cartSkuList, new SkuTotalPricePredicate());

        // 过滤商品单价大于1000的商品
        List<Sku> result = CartService.filterSkus(
                cartSkuList, new SkuPredicate() {
                    @Override
                    public boolean test(Sku sku) {
                        return sku.getSkuPrice() > 1000;
                    }
                });

        System.out.println(JSON.toJSONString(result, true));

    }

    @Test
    void filterSkus1() {

    }
}
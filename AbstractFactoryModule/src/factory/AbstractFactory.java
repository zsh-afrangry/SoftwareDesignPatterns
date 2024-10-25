package factory;

import products.clothes.Clothes;
import products.pants.Pants;
import products.shoes.Shoes;

public interface AbstractFactory {
    //创建一个抽象工厂接口，里面有所有抽象产品接口的声明
    Clothes createClothes(); // 衣服接口
    Pants createPants(); // 裤子接口
    Shoes createShoes(); // 鞋子接口
}

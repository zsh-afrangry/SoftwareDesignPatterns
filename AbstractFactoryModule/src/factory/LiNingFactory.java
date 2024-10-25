package factory;

import products.clothes.Clothes;
import products.clothes.LiNingClothes;
import products.pants.LiNingPants;
import products.pants.Pants;
import products.shoes.LiNingShoes;
import products.shoes.Shoes;

public class LiNingFactory implements AbstractFactory{// 这是具体工厂，实现抽象工厂接口 并 创建具体产品
    @Override
    public Clothes createClothes() {
        System.out.println("创建李宁衣服");
        return new LiNingClothes();
    }

    @Override
    public Pants createPants() {
        System.out.println("创建李宁裤子");
        return new LiNingPants();
    }

    @Override
    public Shoes createShoes() {
        System.out.println("创建李宁鞋子");
        return new LiNingShoes();
    }

}

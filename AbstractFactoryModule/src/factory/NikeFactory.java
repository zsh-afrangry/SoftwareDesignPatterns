package factory;

import products.clothes.Clothes;
import products.clothes.NikeClothes;
import products.pants.NikePants;
import products.pants.Pants;
import products.shoes.NikeShoes;
import products.shoes.Shoes;

public class NikeFactory implements AbstractFactory{
    @Override
    public Clothes createClothes() {
        System.out.println("创建耐克衣服");
        return new NikeClothes();
    }

    @Override
    public Pants createPants() {
        System.out.println("创建耐克裤子");
        return new NikePants();
    }

    @Override
    public Shoes createShoes() {
        System.out.println("创建耐克鞋子");
        return new NikeShoes();
    }
}

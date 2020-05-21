package vn.edu.huuduc.recycleview59cntt2.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.huuduc.recycleview59cntt2.Model.Product;

public class CartController extends Application implements ICartController {
    List<Product> productList = new ArrayList<>();

    public CartController() {
        productList.add(new Product("Chuối Đà Lạt", 25000, "Chuối to, chín vàng"));
        productList.add(new Product("Sầu riêng Khánh Sơn", 95000, "Cơm vàng, hạt lép"));
        productList.add(new Product("Khoai lang", 35000, "Khoai lang theo tiêu chuẩn Việt gap"));
        productList.add(new Product("Xoài cát Hòa Lộc", 55000, "Xoài cát Hòa Lộc loại 1"));
        productList.add(new Product("Nho không hạt", 65000, "Nhho Mỹ không hạt loại 1"));
        productList.add(new Product("Táo", 65000, "Táo Chile"));
    }

    @Override
    public List<Product> getAllProduct() {
        return productList;
    }
}

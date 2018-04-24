package com.nf.myapp.dataProvider;


import com.nf.myapp.models.IData;
import com.nf.myapp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class DataManager implements IData {


    @Override
    public List<Product> getBestProduct() {

        List <Product> productList=new ArrayList<Product>();

        Product product=new Product();
        product.setCatId(1);
        product.setCatId(001);
        product.setBulk("115");
        product.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product.setPackageName("com.nf");
        product.setPrice("0");
        product.setDownloadLink("nnn.ap");
        product.setRate(5.2f);
        product.setTitle("امپراطوری");
        product.setVersionCode(1);
        product.setVersionName("1.0");
        productList.add(product);

        Product product2=new Product();
        product2.setCatId(1);
        product2.setCatId(002);
        product2.setBulk("108");
        product2.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product2.setPackageName("com.nf");
        product2.setPrice("0");
        product2.setDownloadLink("nnn.ap");
        product2.setRate(5.2f);
        product2.setTitle("دریفت");
        product2.setVersionCode(1);
        product2.setVersionName("1.0");
        productList.add(product2);


        Product product3=new Product();
        product3.setCatId(1);
        product3.setCatId(003);
        product3.setBulk("112");
        product3.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product3.setPackageName("com.nf");
        product3.setPrice("0");
        product3.setDownloadLink("nnn.ap");
        product3.setRate(5.2f);
        product3.setTitle("nnn");
        product3.setVersionCode(1);
        product3.setVersionName("1.0");
        productList.add(product3);

        Product product4=new Product();
        product4.setCatId(1);
        product4.setCatId(004);
        product4.setBulk("106");
        product4.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product4.setPackageName("com.nf");
        product4.setPrice("0");
        product4.setDownloadLink("nnn.ap");
        product4.setRate(5.2f);
        product4.setTitle("فیدیلیو");
        product4.setVersionCode(1);
        product4.setVersionName("1.0");
        productList.add(product4);

        Product product5=new Product();
        product5.setCatId(1);
        product5.setCatId(005);
        product5.setBulk("100");
        product5.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product5.setPackageName("com.nf");
        product5.setPrice("0");
        product5.setDownloadLink("nnn.ap");
        product5.setRate(5.2f);
        product5.setTitle("Quiz of Kings");
        product5.setVersionCode(1);
        product5.setVersionName("1.0");
        productList.add(product5);



        return productList;
    }

    @Override
    public List<Product> getNewProduct() {
        List <Product> productList=new ArrayList<Product>();

        Product product=new Product();
        product.setCatId(1);
        product.setCatId(001);
        product.setBulk("115");
        product.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product.setPackageName("com.nf");
        product.setPrice("0");
        product.setDownloadLink("nnn.ap");
        product.setRate(5.2f);
        product.setTitle("امپراطوری");
        product.setVersionCode(1);
        product.setVersionName("1.0");
        productList.add(product);

        Product product2=new Product();
        product2.setCatId(1);
        product2.setCatId(002);
        product2.setBulk("108");
        product2.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product2.setPackageName("com.nf");
        product2.setPrice("0");
        product2.setDownloadLink("nnn.ap");
        product2.setRate(5.2f);
        product2.setTitle("دریفت");
        product2.setVersionCode(1);
        product2.setVersionName("1.0");
        productList.add(product2);


        Product product3=new Product();
        product3.setCatId(1);
        product3.setCatId(003);
        product3.setBulk("112");
        product3.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product3.setPackageName("com.nf");
        product3.setPrice("0");
        product3.setDownloadLink("nnn.ap");
        product3.setRate(5.2f);
        product3.setTitle("nnn");
        product3.setVersionCode(1);
        product3.setVersionName("1.0");
        productList.add(product3);

        Product product4=new Product();
        product4.setCatId(1);
        product4.setCatId(004);
        product4.setBulk("106");
        product4.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product4.setPackageName("com.nf");
        product4.setPrice("0");
        product4.setDownloadLink("nnn.ap");
        product4.setRate(5.2f);
        product4.setTitle("فیدیلیو");
        product4.setVersionCode(1);
        product4.setVersionName("1.0");
        productList.add(product4);

        Product product5=new Product();
        product5.setCatId(1);
        product5.setCatId(005);
        product5.setBulk("100");
        product5.setIcon("https://s.cafebazaar.ir/1/icons/com.kingkodestudio.z2h_512x512.png");
        product5.setPackageName("com.nf");
        product5.setPrice("0");
        product5.setDownloadLink("nnn.ap");
        product5.setRate(5.2f);
        product5.setTitle("Quiz of Kings");
        product5.setVersionCode(1);
        product5.setVersionName("1.0");
        productList.add(product5);



        return productList;

    }

    @Override
    public List<Product> getBestFreeProduct() {
        return null;
    }

    @Override
    public List<Product> Announcement() {
        return null;
    }
}

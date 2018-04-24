package com.nf.myapp.models;

import java.util.List;

/**
 * Created by KarAmad-user on 4/19/2018.
 */

public interface IData {

    public List<Product> getBestProduct();
    public List<Product> getNewProduct();
    public List<Product> getBestFreeProduct();
    public List<Product> Announcement();
}
